Java 10 released in Mar 2018
Most of changes in java 10 are house keeping related and performance related.
From java programmer perspective there is no significant changes except var type inference.
Java10 reached end of support its not LTS long term not support available
Java8 and Java11 are with LTS
Also we cannot download java9 and java10 now as not available for download


Features
Type inference with local variable 'var'
orElseThrow
Garbage collector interface
Parallel full GC for G1
Heap allocation on alternative memory devices
Removed javah
Root certificates


Type inference with local variable 'var'
It reduces the verbosity of the java language
It helps to infer data type implicitly
It improves readability of code
better concise code

where to use var
--------------------
1. local variable with initializer for var declaration initialzation is must
eg. var names= List.of("kaushal","kaushalender","sharma");
2. index in for loop
for(var name: names){
sysout(name);
}
3. in try with resources
try(Scanner sc=new Scanner(new File("abc.txt"))){
}catch(Exception e){
e.printStackTrace();
}
4. we can use final with var 
final var a=10;

where var cannot be used 
--------------------------
1. Cannot be used with class fields or varaibles 
2. Cannot be used with method parameters and return type
class Employee{
var name;
 var add(var a, var b)
 {
 	return a+b;
 }
 }
 3. cannot be used in catch formals
 
 catch(var Exception){
 }
 4. constructor parameter
 class Apple{
 var name;
 Apple(var name){
 this.name=name;
 }
 }
 5. var is not keyword its an reserved identifier
 var var=10;   // should be avoided
 
 when not to prefer var
 ===========================
var employees= getEmployees(); // not good idea as does not improve readability
Map<Integer, Employee> employees= getEmployees(); // prefer this
As we need to go to getEmployees method to know the type of variable  employees

be careful list of type object this defeats the purpose
List<Integer> list=new ArrayList<>();  // prefer this one
//var list=new ArrayList<>();
list.add(1);
//list.add("kaushal"); // compiler does not complains now
another soulution
var list=new ArrayList<String>();

try to limit the scope of local variable to minimum



Optional orElseThrow
===============
optionalString.get()
 public T get() {
        if (value == null) {
            throw new NoSuchElementException("No value present");
        }
        return value;
    }
    
    get method of Optional can return NoSuchElementException hence code smell
	
	In future optionalString.get() will be deprecated we should use now orElseThrow
		//Optional<String> optionalString = Optional.of("kaushal");
		Optional<String> optionalString = Optional.empty();
		//optionalString.get(); // gives code smell
//		if(optionalString.isPresent()) {
//			System.out.println(optionalString.get());
//		}else {
//			System.out.println("empty value");
//		}
		System.out.println(optionalString.orElseThrow());
House keeping activity
======================
Consolidate JDK repository into single repository
Before java10 we have 8 below mentioned repository which were combined into single repository
corba,jdk,hotspot,jaxp,jaxws,langtools,nashorn,oot

Experimental Java based JIT compiler [Graal]
==============================================
Introduced in java10
Available on Linux OS[Java experimention first on Linux os if it successful then will try on mac and windows OS]
The main purpose of this is to improve the performance.
How to enable java based JIT compiler?
-XX:+UnlockExperimentalVMOptions 
-XX:+UseJVMCICompiler

Garbage Collector interface
=============================
This interface improves the source code isolation of different garbage collectors

Parallel Full GC for G1
=======================
This feature improves the G1 worst case latencies by making the Full GC parallel

Heap Allocation on Alternative memory devices
===================================================
This feature enable Hotspot VM to allocate heap on alternative devices specified by the user.

Javah has been removed from java10
======================================
Now javac will do the task of the javah

Java10 provides the default set of root Certification Authority[CA]





