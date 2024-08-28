package org.example.javaStreams;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,56,5,85,7,6);
        System.out.println("original : "+ list);

        //find duplicates
        Set<Integer> dup = new HashSet<>();
        Set<Integer> set = list.stream().filter(e->!dup.add(e)).collect(Collectors.toSet());
        System.out.println("Approch-1 : "+set);


        //Approch - 2 find duplicates
        Set<Integer> duplist = list.stream().filter(e->Collections.frequency(list,e) > 1).collect(Collectors.toSet());
        System.out.println("Approch-2 : "+duplist);

        //remove duplicates
        Set<Integer> unq = new HashSet<>();
        Set<Integer> unqlist = list.stream().filter(e->unq.add(e)).collect(Collectors.toSet());
        System.out.println("Approch-3 remove duplicates : "+unqlist);


    }
}
