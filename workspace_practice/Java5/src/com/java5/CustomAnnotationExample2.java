package com.java5;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
@interface MyAnnotationNew {
	String developerName() default "Kaushlender Kumar Sharma";
	String role();
}

//Applying annotation  
class ApplyAnnotation {
	@MyAnnotationNew(developerName = "Kaushal",role="developer")
	public void sayHello() {
		System.out.println("hello annotation");
	}
}

//Accessing annotation  
public class CustomAnnotationExample2 {

	public static void main(String[] args) throws Exception {
		ApplyAnnotation h = new ApplyAnnotation();
		Method m = h.getClass().getMethod("sayHello");

		MyAnnotationNew myAnnotationNew = m.getAnnotation(MyAnnotationNew.class);
		System.out.println("developerName value is: " + myAnnotationNew.developerName());
		System.out.println("Role value is: " + myAnnotationNew.role());

	}

}
