package com.java9;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DropWhileTakeWhile {
    public static void main(String[] args) {

        IntStream.range(1,50).dropWhile(a-> a <=10).forEach(System.out::print);
        System.out.println("----------------------------");
        IntStream.range(1,50).takeWhile(a-> a <=10).forEach(System.out::print);
        Stream<Integer> inputList = Stream.of(5, 8, 12, 16,51);
        //inputList.dropWhile(num -> num < 10).forEach(num -> System.out.print(num+" "));

    }
}
