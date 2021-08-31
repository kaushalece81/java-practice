package com.java9.streamenhancement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * dropWhile
 * It will start if condition is false for any value
 * It may or may not take all values in the collection 
 * 
 * takeWhile
 * It will stop if condition is false for any value
 * It may or may not take all values in the collection 
 * ofNullable
 * It prevents NullPointer Exception
	*/
public class DropWhileTakeWhile {
    static List<Integer> marksList = Arrays.asList(50, 60, 80, 90, 40);
    public static void main(String[] args) {

        IntStream.range(1,20).dropWhile(a-> a <=10).forEach(System.out::print);
        System.out.println("\n----------------------------");
        // output 111213141516171819
        IntStream.range(1,20).takeWhile(a-> a <=10).forEach(System.out::print);
        System.out.println("\n----------------------------");
        // output 12345678910
        System.out.println("=========================================");
    	List<Integer> intNullList=null;
        List nullList = Stream.ofNullable(intNullList).collect(Collectors.toList());
        System.out.println("nullList========"+nullList);
        List<Integer> intList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List nonNullList = Stream.ofNullable(intList).collect(Collectors.toList());
        System.out.println("nonNullList========"+nonNullList);

        
        Stream<Integer> inputList = Stream.of(5, 8, 12, 16,51);
        //inputList.dropWhile(num -> num < 10).forEach(num -> System.out.print(num+" "));
        System.out.println("\n===============================-");
        takeWhile();
		dropWhile();
		ofNullable();
    
    }
	public static void takeWhile() {
		List<Integer> tempList = marksList.stream().takeWhile(i -> i <80).collect(Collectors.toList());
		System.out.println("takeWhile: " + tempList);

	}
	public static void dropWhile() {
		 
		List<Integer> tempList = marksList.stream().dropWhile(i -> i <80).collect(Collectors.toList());
		System.out.println("DropWhile: " + tempList);

	}
	public static void ofNullable() {
		List<Integer> nullList = null;
		List<Integer> marksList = Arrays.asList(50, 60, 80, 90, 40);
		List tempList = Stream.ofNullable(nullList).collect(Collectors.toList());
		List tempList2 = Stream.ofNullable(marksList).collect(Collectors.toList());
		System.out.println("ofNullable: " + tempList);
		System.out.println("ofNullable tempList2: " + tempList2);

	}
  
}
