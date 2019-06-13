package tech.veedo.zhuzhu.utils;

import org.springframework.cglib.beans.BeanMap;

import java.util.HashMap;

public class MyUtils {

    public static HashMap<String, Object> Object2HashMap(Object o) {
        HashMap<String, Object> res = new HashMap<>();
        if (o != null) {
            BeanMap beanMap = BeanMap.create(o);
            beanMap.keySet().forEach(k -> res.put(k.toString(), beanMap.get(k)));
        }
        return res;
    }

}
