package com.example.mongodemo.controller;

import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        IntStream.range(1,500).filter(a-> a%2==0).forEach(System.out::println);
    }
}
