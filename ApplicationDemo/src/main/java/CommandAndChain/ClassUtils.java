package CommandAndChain;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Objects;

/**
 * 根据父类获取子类
 */
public class ClassUtils {

    @SuppressWarnings("unchecked")
    public static List<Class> getSonClass(Class fatherClass) {
        List<Class> returnClassList = new ArrayList<>();
        String packageName = fatherClass.getPackage().getName();
        //获得包下的所有类
        List<Class> packageClasses = getClasses(packageName);
        for (Class c : packageClasses) {
            //isAssignableFrom:确定由此类对象表示的类或接口是否与由指定的Class 类表示的类或接口相同或是超类或类接口。 如果是，则返回true ; 否则返回false
            if(fatherClass.isAssignableFrom(c) && !fatherClass.equals(c)) {
                returnClassList.add(c);
            }
        }
        return returnClassList;
    }

    private static List<Class> getClasses(String packageName) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace(".","/");
        Enumeration<URL> resources = null;
        try {
            resources = classLoader.getResources(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(Objects.isNull(resources)) {
            return null;
        }
        List<File> dirs = new ArrayList<>();
        while(resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        ArrayList<Class> classes = new ArrayList<>();
        for (File directory : dirs) {
            classes.addAll(findClasses(directory, packageName));
        }
        return classes;
    }

    private static List<Class> findClasses(File directory, String packageName) {
        List<Class> classes = new ArrayList<>();
        if(!directory.exists()) {
            return classes;
        }
        //listFiles() 返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。
        File[] files = directory.listFiles();
        if (Objects.isNull(files) || files.length == 0) {
            return classes;
        }
        for (File file : files) {
            //如果还是文件夹,递归搜索
            if(file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                try {
                    classes.add(Class.forName(packageName + "." + file.getName().substring(0, file.getName().length() - 6)));
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        return classes;
    }
}
