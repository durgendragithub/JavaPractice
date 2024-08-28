package org.example.javaBasicPrograms;

public class ReverseANumber {
    public static void main(String[] args) {
        int number = 13931;
        int number2  = number;
        int reminder, revNumber=0,sum=0;
        System.out.println("original number: "+ number);

        //Approch - 1
        System.out.println("Approch - 1");
        while(number  > 0){
            reminder = number % 10;
            number = number / 10;

            // reverseing the number
            revNumber = (revNumber * 10) + reminder;

            //sum the digits of the number
            sum = sum + reminder;
        }
        System.out.println("revresed Number: "+revNumber);
        System.out.println("sum of digits : "+sum);

        if (number2 == revNumber){
            System.out.println("The number is a palindrome number");
        }
    }
}
