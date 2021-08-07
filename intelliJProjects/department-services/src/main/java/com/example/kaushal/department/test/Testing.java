package com.example.kaushal.department.test;

import java.util.Collection;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        Runnable runnable = Testing::run;
        runnable.run();
        Collection
    }

    private static void run() {
        final List<Integer> list = List.of(1, 2, 5, 6, 96, 8, 9, 78);
        for (int a : list) {
            System.out.println("Numeber: " + a);
        }
    }
}
