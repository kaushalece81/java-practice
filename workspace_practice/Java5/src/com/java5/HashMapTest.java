package com.java5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//https://www.codingame.com/playgrounds/6162/6-ways-to-iterate-or-loop-a-map-in-java
public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer,String> hm=new HashMap<>();
		hm.put(1, "Kaushal");
		hm.put(2, "Kaushalender");
		hm.put(3, "Pawan");
		//Using entrySet()
		System.out.println("========Using entrySet()========");
		for(Map.Entry<Integer,String> entry : hm.entrySet()){
			System.out.println("Key : "+entry.getKey()+ " value : "+ entry.getValue());
		}
		
		//Using keySet()
		System.out.println("========Using keySet()========");
		for (Integer key : hm.keySet()) {
		      System.out.println("Key : " + key + " value : " + hm.get(key));
		}

		// Using iterator through map
		System.out.println("========Using entryset() & iterator()========");
		Set<Entry<Integer, String>> entrySet = hm.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) iterator.next();
			System.out.println("Key : "+entry.getKey()+ " value : "+ entry.getValue());
		}
		
		//Using iterator through the KeySet
		System.out.println("========Using KeySet() & iterator()========");
		Iterator<Integer> iterator1 = hm.keySet().iterator();
		while (iterator.hasNext()) {
			Integer key = iterator1.next();
			System.out.println("Key : " + key + " value : " + hm.get(key));
		}
		
		//Using foreach in Java 8
		System.out.println("========Using forEach() Java8========");
		hm.forEach((key,value) -> System.out.println(key +" : "+ value));
		
		//Using stream() in Java 8
		System.out.println("========Using stream and forEach() Java8========");
		hm.entrySet().stream().forEach(e -> System.out.println(e.getKey() +" : "+ e.getValue()));

	}

}
