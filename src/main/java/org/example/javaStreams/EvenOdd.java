package org.example.javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,56,5,85,7,6);

        List<Integer> even = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(even);
        List<Integer> oddlist = list.stream().filter(e->e%2 != 0).collect(Collectors.toList());
        System.out.println(oddlist);
    }
}
