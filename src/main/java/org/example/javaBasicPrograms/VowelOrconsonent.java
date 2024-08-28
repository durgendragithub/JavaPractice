package org.example.javaBasicPrograms;

import java.util.Scanner;

public class VowelOrconsonent {

    public static void main(String[] args) {

         char ch = 'a';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println("given character: \'"+ ch + "\' is Vowel");
        else
            System.out.println("given character is consonent.");
    }
}
