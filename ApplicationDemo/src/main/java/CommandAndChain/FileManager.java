package CommandAndChain;

/**
 * 模拟读取系统文件的功能
 */
public class FileManager {

    //ls
    public static String ls(String path) {
        return "file1\nfile2\nfile3\nfile4\n";
    }

    //ls -l
    public static String ls_l(String path) {
        String str = "drw-rw-rw root system 1024 2009-8-20 10:23 file1\n";
        str = str + "drw-rw-rw root system 1024 2009-9-20 10:23 file2\n";
        str = str + "drw-rw-rw root system 1024 2009-9-20 10:23 file3\n";
        return str;
    }

    //ls -a
    public static String ls_a(String path) {
        return ".\n..\nfile1\nfile2\nfile3";
    }
}
