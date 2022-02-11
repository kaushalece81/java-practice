package com.java5;

/*CovariantReturnType means that return type may vary during method overriding
		before java5 it was not allowed to override any method
		if return type is changed in child class
		Bit in java5 its possible only if return type is subclasstype.*
		*/

public class CovariantReturnTypeExample {

	public static void main(String[] args) {
		// Dog dogRef=new Dog();
		Dog dogRef = new Labrador();
		dogRef.specialCapabilities();
		dogRef.show();
	}

}
