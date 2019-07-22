package tech.veedo.zhuzhu.utils;

import org.springframework.cglib.beans.BeanMap;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class MyUtils {

//    private static DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM");

    public static HashMap<String, String> Object2HashMap(Object o) {
        HashMap<String, String> res = new HashMap<>();
        if (o != null) {
            BeanMap beanMap = BeanMap.create(o);
            beanMap.keySet().forEach(k -> {
                if (beanMap.get(k) != null) {
                    if (k.toString().equals("endJobDate") || k.toString().equals("endProjDate")) {
                        if ("9999.12".equals(beanMap.get(k).toString())) {
                            res.put(k.toString(), "至今");
                        } else {
                            res.put(k.toString(), beanMap.get(k).toString());
                        }
                    } else {
                        res.put(k.toString(), beanMap.get(k).toString());
                    }
                } else {
                    res.put(k.toString(), "");
                }
            });
        }
        return res;
    }

    public static <T> HashMap<String, Object> List2HashMap(List<T> list) {
        HashMap<String, Object> res = new HashMap<>();
        if (CollectionUtils.isEmpty(list)) return res;

        Stream.iterate(0, integer -> integer + 1).limit(list.size()).forEach(i -> {
            BeanMap beanMap = BeanMap.create(list.get(i));
            beanMap.keySet().forEach(k -> res.put(k.toString() + i, beanMap.get(k)));
        });

        return res;
    }

    public static String getWordIdStringRandom() {
        return getStringRandom(8);
    }

    /**
     * 生成随机数字和大写字母
     * @param len 位数
     * @return
     */
    public static String getStringRandom(int len) {
        if (len <= 0) return null;

        StringBuffer sb = new StringBuffer();

        Random random = new Random();
        Stream.iterate(0, i -> i + 1).limit(len).forEach(i -> {
            if (random.nextBoolean()) { // true: 大写字母
                sb.append((char) (random.nextInt(26)+65));
            } else {
                sb.append(random.nextInt(10));
            }
        });

        return sb.toString();
    }

    public static String getOutDirPath() {
        switch (System.getProperty ("os.name")) {
            case "Windows 10":
                return "C:/Users/50689/Desktop/IO/";
            case "Mac OS X":
                return "/Users/ifzhang/Downloads/";
            default:
                return "/root/word/";
        }
    }
}
