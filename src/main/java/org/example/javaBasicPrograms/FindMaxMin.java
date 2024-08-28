package org.example.javaBasicPrograms;

public class FindMaxMin {
    public static void main(String[] args) {
        int[] arr = {5,7,6,1,9,3,7,8};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
