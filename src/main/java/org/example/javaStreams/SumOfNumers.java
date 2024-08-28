package org.example.javaStreams;

import java.util.Arrays;
import java.util.List;

public class SumOfNumers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,5,25,5,6,5,4,5);

        //Approch - 1
        int sum  = list.stream().mapToInt(e->e).sum();
        System.out.println(sum);

        //Approch - 2
        int sum2 = list.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum2);

    }
}
