package org.example.javaStreams;

import java.util.Arrays;
import java.util.List;

public class Average {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,5,56,5,85,7,6);
        double avg = list.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println("Average is " + avg);

        double avgEven = list.stream().filter(e->e%2==0).mapToInt(e->e).average().getAsDouble();
        System.out.println("Average is " + avgEven);
    }
}
