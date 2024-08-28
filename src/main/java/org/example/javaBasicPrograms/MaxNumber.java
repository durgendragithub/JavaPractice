package org.example.javaBasicPrograms;

public class MaxNumber {
    static int a =10;
    static int b = 13;
    static int c = 3;

    public static void main(String[] args) {
        int max = a>b?(a>c?a:c):(b>c?b:c);
        System.out.println(max);
    }

   }
