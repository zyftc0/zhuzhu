package tech.veedo.zhuzhu.utils;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    private static final String prefix = "#w#o#";

    private static final String suffix = "#r#d#";

    private static final Pattern pattern = Pattern.compile(prefix + ".*" + suffix);

    public static String format(String text, Map<String, Object> params) {
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String var = matcher.group();
            String key = var.replace(prefix, "").replace(suffix, "");
            text = text.replaceAll(var, params.get(key).toString());
        }

        return text;
    }

}
