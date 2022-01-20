Java 11 is not free for commercial purpose was relased on September 2018

Jdk11 is available for only 64 bit OS and not available for 32 bit OS

Either download latest eclipse which support latest java version or download java plugin in eclipse
Java 11 support for eclipse plugin


Java 11 removed features
===========================
4 categories
Modules,Classes,Methods,Tools

Modules removed in java 11
==============================
java.corba
jdk.snmp
java.xml.ws
java.xml.bind
JavaFX module

Classes removed in java 11
===============================
com.sun.awt.AWTUtilities
sun.misc.Unsafe.defineClass

Methods removed in java 11
=============================
Thread.destroy()
Thread.stop(Throwable)

Tools removed in java 11
==============================
applietviewer launcher
wsimport
wsgen
schemagen
Xjc


Migration from java8 to java11
===================================
If code is written using library of java.corba then it will throw error in java 11

How to handle Strings in java11
=================================
repeat(n)     repeats string multiple times without using for loop
isBlank()
lines()
strip()
stripLeading()
stripTrailing()


Nashorn
===============
nashorn is a javascript engine
Nashorn is used for calling Javascript Function from java
Nashorn has been deprecated in java11
Intent is to remove Nashorn in a future release

Http Client
===============
HttpClient is used for calling webservices from java
It was Introduced in java9
and HttpClient was available in package jdk.incubator.http 

But from java 11 HttpClient is available in package java.net.http

Calling webservices from java Before java9
------------------------------------------------
1. Rest Template(Spring)
2. HttpClient from apache
3. HttpClient from google
4. HTTPURLConnection from java
HTTPURLConnection  has lot issues so developers used to prefer third party tools like
 rest template, HttpClient from apache, HttpClient from google
 
 Http Client Advantages
 --------------------------
1. Avoid dependency on third party libraries
2. It is very simple
3. Can send both text and binary data
4. We can send multiple requests
5. Supports both synchronous and asynchronous communication


Java11 Lambda Enhancements
============================
Introduces couple of enhancements to Lambda Expressions
we can use var keyword in lambda expression also from java 11 example
AddInterface1 addInterface1 = (  var a, var b) -> (a + b);
Benefits of using var here 
1. we can use final with var in lambda expression which is not possible without using var
2. For adding validation using annotations to the lambda input before java11 adding validation annotation was not possible
example
//AddInterface1 addInterface1 = (final  var a, final var b) -> (a + b);
//AddInterface1 addInterface1 = (@Min(value = 10)  var a, @Min(value = 1) var b) -> (a + b);