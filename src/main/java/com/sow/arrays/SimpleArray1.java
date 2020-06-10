package com.sow.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SimpleArray1 {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
            List<Integer> result = new ArrayList<Integer>();
            Integer counterA=0,counterB=0;
            for(int i=0;i<a.size();i++)
            {
                if(0 <= a.get(i) || a.get(i)<=100 && 0 <= b.get(i) || b.get(i)<=100)
                {
                    if(a.get(i) > b.get(i))
                        counterA++;
                    else if (a.get(i) < b.get(i))
                        counterB++;
                }
            }   
        result.add(counterA);
        result.add(counterB);
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

//        bufferedWriter.write(
          System.out.println(result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
