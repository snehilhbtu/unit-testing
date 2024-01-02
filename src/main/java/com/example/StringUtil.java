package com.example;

public class StringUtil {

    public static String reverseString(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = reverseString(cleanedStr);
        return cleanedStr.equals(reversed);
    }

    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Input strings cannot be null");
        }
        return str1 + str2;
    }

    public static int countOccurrences(String str, char target) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }
}
