package org.example.javaBasicPrograms;

public class CharStringConverion {
    public static void main(String[] args) {
        // Convert char to String

        char ch = 'A';

        String str = Character.toString(ch);

        System.out.println("Char to String: " + str);

        // Convert String to char

        String s = "Hello";

        char c = s.charAt(0);

        System.out.println("String to Char: " + c);
    }
}
