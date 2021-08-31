module com.clientmodule {
	requires com.mymodule;  // here we linked com.clientmodule with com.mymodule
}

/* Hover over cursor to error com.mymodule line 2
 * click Fix project setup
 *  Then click on link "click here" in popup  to manually configure
 *  Java build path-->projects tab --> module path --> add ==> module you want to use select project in which that module 
 *  here its jpms-demo -->then click on apply and close button
 *  
 */