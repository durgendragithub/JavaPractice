package org.example.javaBasicPrograms;

public class StringReverseSpecialWithCharaters {
    public static void main(String[] args) {

        String s = "tirupathi@durge!!ndr*^vdfh$(a";
        char[] charArray = s.toCharArray();

        reverseString(charArray);
        String rev = new String(charArray);
        System.out.println(s);
        System.out.println(rev);
    }

    private static void reverseString(char[] charArray) {
        int i = 0;
        int j = charArray.length - 1;

        while (i < j) {
            if (!Character.isAlphabetic(charArray[i])) {
                i++;
            } else if (!Character.isAlphabetic(charArray[j])) {
                j--;
            }else {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;
                j--;
            }

        }
    }
}
