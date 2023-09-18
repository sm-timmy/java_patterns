package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonAdapter {
    public static String JavaToJson(String str) {
        StringBuilder jsonStr = new StringBuilder("{");

        String regex = "[\\{ ,](\\w+)=(['\\w\\d.@]+)";
        //String regex = ".*\\{(\\w)\\}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            jsonStr.append("\"").
                    append(matcher.group(1)).
                    append("\"")
                    .append(":")
                    .append(matcher.group(2).replaceAll("'", "\""))
                    .append(", ");
        }
        jsonStr = new StringBuilder(jsonStr.substring(0, jsonStr.length() - 2));
        jsonStr.append("}");
        return jsonStr.toString();
    }
}
