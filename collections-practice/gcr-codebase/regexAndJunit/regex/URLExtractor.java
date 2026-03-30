package com.bridgelabz.regex;

import java.util.regex.*;

public class URLExtractor {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org";
        String regex = "https?://[^\\s]+";

        Matcher matcher = Pattern.compile(regex).matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

