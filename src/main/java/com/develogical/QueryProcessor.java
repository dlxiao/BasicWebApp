package com.develogical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "dlxiao";
        }
        if (query.toLowerCase().contains("newquery")) {
            return "New query!";
        }

        if(query.toLowerCase().contains("largest")) {
            String[] parts = query.split(",");
            String first_num = parts[0].substring((query.indexOf(':') + 2));

            int max = Integer.parseInt(first_num);
            for(String num_str : parts) {
                int num_int = Integer.parseInt(num_str.substring(1));
                if(num_int > max) {
                    max = num_int;
                } 
            }
            return Integer.toString(max);  
        }

        if(query.toLowerCase().contains("plus")) {

            // String input = "Today is 22 September";
            // Pattern regex = Pattern.compile("Today is (\\d+) \\w+");
            // Matcher matcher = regex.matcher(input);
            // System.out.println(matcher.group(1));
            String first_num = query.substring(query.indexOf("is ") + 3, query.indexOf("plus") - 1);
            String second_num = query.substring(query.indexOf("plus ") + 5);
            int sum = Integer.valueOf(first_num) + Integer.valueOf(second_num);
            return Integer.toString(sum);
        }

        return "";
    }
}
