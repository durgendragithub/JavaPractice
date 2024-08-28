package org.example.javaStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,56,5,85,7,6);

        Optional<Integer> max = list.stream().max(Integer::compareTo);
        Optional<Integer> min = list.stream().min(Comparator.comparing(Integer::valueOf));

        int min2 = list.stream().min(Integer::compareTo).get();
        int max2 = list.stream().max(Comparator.comparing(Integer::valueOf)).get();

        Optional<Integer> Minimum = list.stream().sorted().findFirst();
        Optional<Integer> maximium = list.stream().sorted(Comparator.reverseOrder()).findFirst();



        System.out.println("max: "+ max);
        System.out.println("min : " + min);
        System.out.println("max2 : " + max2);
        System.out.println("min2 : " + min2);
        System.out.println("minimum : " + Minimum);
        System.out.println("maximum : " + maximium);
    }
}
