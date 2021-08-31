=====================================================================
JPMS Java Platform Module System
Jigsaw is a project name under which JPMS was developed
Main purpose of JPMS was modularity
Before java9 java application development was based on jars
From java9 java application development was based on modules
UseCase #1
1. Suppose we are creating a java application which requires only 5 java classes from rt.jar
	Then also we need complete rt.jar whose size is 61980 kb
	if we are running on mobile device this file size matters.
2.From java9 we have modules with small size modules.

UseCase #2
-----------------------------------
Suppose your application contains 500 java classes.
Before java 9
1 jar file for 500 java classes.
Third party wants to use only 1 java class from your jar file then?
From java 9
We can divide 500 java classes into small modules[50,10,5] 

jar is a group of packages which contains classes and interfaces
jar = classes + interfaces
module = classes + interfaces + configuration data

configuration data
module helloModule{
	requires java.base;
	exports com.java9;
}