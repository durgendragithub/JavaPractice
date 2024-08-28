package org.example.javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,56,5,85,7,6);
        System.out.println(list);
        List<Integer> start = list.stream()
                                    .map(e->String.valueOf(e))
                                    .filter(e->e.startsWith("5"))
                                    .map(Integer::valueOf)
                                    .collect(Collectors.toList());
        System.out.println(start);
    }
}
