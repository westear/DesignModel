package demo4;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

public class BeanUtils {

    //bean 的所有属性及数值放入到 HashMap 中
    public static HashMap<String, Object> backupProp(Object bean) {
        HashMap<String, Object> result = new HashMap<>();
        try {
            //获得Bean的描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            //获得属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            //遍历所有属性
            for(PropertyDescriptor descriptor : descriptors) {
                //属性名称
                String fieldName = descriptor.getName();
                //读取属性的方法
                Method getter = descriptor.getReadMethod();
                //读取属性
                Object fieldValue = getter.invoke(bean, new Object[]{});
                if(!fieldName.equalsIgnoreCase("class")) {
                    result.put(fieldName, fieldValue);
                }
            }
        } catch (Exception e) {
            //异常处理
        }
        return result;
    }

    //把HashMap的值返回到bean中
    public static void restoreProp(Object bean, HashMap<String, Object> propMap) {
        try {
            //获得Bean的描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            //获得属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            //遍历所有属性
            for (PropertyDescriptor descriptor : descriptors) {
                //属性名称
                String fieldName = descriptor.getName();
                //如果有这个属性
                if(propMap.containsKey(fieldName)) {
                    //写属性方法
                    Method setter = descriptor.getWriteMethod();
                    setter.invoke(bean, new Object[]{propMap.get(fieldName)});
                }
            }
        } catch (Exception e) {
            //异常处理
            e.printStackTrace();
        }
    }
}
