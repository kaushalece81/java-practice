package com.java5;
public class Labrador extends Dog{
	public Labrador() {
	}
	@Override
	public String specialCapabilities() {
		System.out.println("Is an athletic Dog and Barks also");
		return "Covariant Type";
	}
	@Override
	public Labrador show() {
		System.out.println("I am Labrador Dog ");
		return this;
	}
}