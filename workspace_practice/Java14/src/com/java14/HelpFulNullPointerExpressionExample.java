package com.java14;
//  -XX:+ShowCodeDetailsInExceptionMessages
public class HelpFulNullPointerExpressionExample {

	public static void main(String[] args) {
		ProfessionalDetail professionalDetail = new ProfessionalDetail("Sofetware Engineer","12534", 50000.0);
		Address address = null;
		//Address address = new Address("AECS Layout", "Delhi");
		PersonalDetail personalDetail = new PersonalDetail("Kaushal", 40, address);
		Employee employee = new Employee(professionalDetail,personalDetail);
		System.out.println(employee.personalDetail().address().permanentAddress().toLowerCase());
		
	}

}

record Employee(ProfessionalDetail ProfessionalDetail, PersonalDetail personalDetail){
	
	
}
record ProfessionalDetail(String designation,String employeeId,Double salary){
	 
}
record PersonalDetail(String name, int age, Address address){
	
}
record Address(String presentAddress, String permanentAddress) {

}

