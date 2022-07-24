package com.java14;
// enable    -XX:+ShowCodeDetailsInExceptionMessages   in java15 enabled by default
//disable    -XX:-ShowCodeDetailsInExceptionMessages   in java15 enabled by default
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
//enable    -XX:+ShowCodeDetailsInExceptionMessages
/*
 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke
 * "com.java14.Address.permanentAddress()" because the return value of
 * "com.java14.PersonalDetail.address()" is null at
 * Java14/com.java14.HelpFulNullPointerExpressionExample.main(
 * HelpFulNullPointerExpressionExample.java:12)
 */

//disable    -XX:-ShowCodeDetailsInExceptionMessages   in java15 enabled by default
/*
 * Exception in thread "main" java.lang.NullPointerException at
 * Java14/com.java14.HelpFulNullPointerExpressionExample.main(
 * HelpFulNullPointerExpressionExample.java:12)
 */
record Employee(ProfessionalDetail ProfessionalDetail, PersonalDetail personalDetail){
	
	
}
record ProfessionalDetail(String designation,String employeeId,Double salary){
	 
}
record PersonalDetail(String name, int age, Address address){
	
}
record Address(String presentAddress, String permanentAddress) {

}

