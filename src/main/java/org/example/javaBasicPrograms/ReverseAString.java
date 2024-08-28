package org.example.javaBasicPrograms;

public class ReverseAString {

    public static void main(String[] args) {
        String str  = "radar";
        char[] strArray = str.toCharArray();
        String rev =  "";
        String revrese = "";

        int j = strArray.length - 1;
   // Approch -1

        System.out.println("*************************");
        System.out.println("Approch -1 ");
        while (j >= 0) {
            System.out.print(strArray[j--] + " ");
        }
        //approch-2
        System.out.println();
        System.out.println("*************************");
        System.out.println("Approch -2 ");

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
            rev+=str.charAt(i);
        }
        System.out.println();
        System.out.println("------stored in rev ---------");
        System.out.println(rev);

        // Approch - 3
        System.out.println();
        System.out.println("*************************");
        System.out.println("Approch -3 ");
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());


        System.out.println("=========palindrome check==============");
        if(str.equals(rev)){
            System.out.println("Given String is a palindrome");
        }else{
            System.out.println("Given String is not a palindrome");
        }
    }
}
