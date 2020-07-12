package com.sow.strings;


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class splitString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        System.out.println(Stream.of(s.split("[!,?._'@\\s]+"))
            .map(ele -> new String(ele)).count());
        
        Stream.of(s.split("[!,?._'@\\s]+"))
            .map(ele -> new String(ele))
            .collect(Collectors.toList())
            .forEach(System.out::println);

        scan.close();
    }
}

