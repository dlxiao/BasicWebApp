package com.develogical;

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
            return ""+max;  
        }
        return "";
    }
}
