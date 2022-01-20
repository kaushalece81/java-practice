package com.java5;

//public class GenericCalculator<T extends Number> {
public class GenericCalculator<T> {
	
	private T a;
	private T b;
	public GenericCalculator() {
	}
//	public GenericCalculator(T a, T b) {
//		this.a=a;
//		this.b=b;
//	}
	public T addNumbers(T a, T b) {
		 if (a.getClass() == Integer.class) {
			 return (T) (Integer) ((Integer) a + (Integer) b);
		 }
		 else if (a.getClass() == Long.class) {
		        // Without auto-boxing / unboxing
		        return (T) Long.valueOf(((Long) a).longValue() + 
		                                ((Long) b).longValue());
		  }
		 else if (a.getClass() == Double.class) {
		        // Without auto-boxing / unboxing
		        return (T) Double.valueOf(((Double) a).doubleValue() + 
		                                ((Double) b).doubleValue());
		  }
		 else if (a.getClass() == String.class) {
		        // Without auto-boxing / unboxing
		        return (T)String.valueOf((String)a + (String)b);
		  }
		 else { 
		        throw new IllegalArgumentException("Type " + a.getClass() + " is not supported by this method"); 
		    } 
	}
	


}
