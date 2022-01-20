package com.java8.lambda.example;

import java.util.List;

public class ListOfExample {
    public static void main(String[] args) {
    	 final List<Integer> list = List.of(1, 2, 5, 6, 96, 8, 9, 78);
         for (int a : list) {
             System.out.println("Numeber: " + a);
         }

    }

   
}
