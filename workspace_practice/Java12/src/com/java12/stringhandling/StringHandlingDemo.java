package com.java12.stringhandling;
public class StringHandlingDemo {
    public static void main(String[] args) {

        indentExample();
        transformExample();

    }
    private static void indentExample(){

        var jff= "Learn Java Straightforward \n Join Java Fast Forward";
        // add 60 leading spaces before word Learn
        System.out.println(jff.indent(60));

     // add 10 leading spaces before word Learn
        System.out.println(jff.indent(10));

    }
    private static void transformExample(){

        var jff=  "Java".transform(str -> str + "Fast-Forward");
        System.out.println(jff);
    }
}
