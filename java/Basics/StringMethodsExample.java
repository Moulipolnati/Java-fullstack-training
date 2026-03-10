package com.basics;
public class StringMethodsExample {

    public static void main(String[] args) {

        // Original string with spaces
        String str = "   Hello Java World   ";

        // trim() removes spaces at the beginning and end
        String trimmed = str.trim();
        System.out.println("Trimmed: " + trimmed);

        // toLowerCase() converts all characters to lowercase
        System.out.println("Lowercase: " + trimmed.toLowerCase());

        // toUpperCase() converts all characters to uppercase
        System.out.println("Uppercase: " + trimmed.toUpperCase());

        // equals() compares content exactly
        String s1 = "Java";
        String s2 = "Java";
        System.out.println("equals(): " + s1.equals(s2));

        // equalsIgnoreCase() compares ignoring uppercase/lowercase
        String s3 = "JAVA";
        System.out.println("equalsIgnoreCase(): " + s1.equalsIgnoreCase(s3));

        // replace() replaces characters in a string
        String replaced = trimmed.replace("Java", "Python");
        System.out.println("Replace: " + replaced);

        // substring() extracts part of the string
        String sub = trimmed.substring(6, 10);
        System.out.println("Substring: " + sub);

        // split() splits the string into words
        String[] words = trimmed.split(" ");

        System.out.println("Split words:");
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }

        // toCharArray() converts string to character array
        char[] chars = trimmed.toCharArray();

        System.out.println("Characters:");
        for(int i = 0; i < chars.length; i++){
            System.out.println(chars[i]);
        }

    }

}