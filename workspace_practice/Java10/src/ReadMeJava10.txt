Java 10 released in Mar 2018
Most of changes in java 10 are house keeping related and performance related.
From java programmer perspective there is no significant changes except var type inference.
Java10 reached end of support its not LTS long term not support available
Java8 and Java11 are with LTS
Also we cannot download java9 and java10 now as not available for download


Features
Type inference with local variable 'var'
Garbage collector interface
Parallel full GC for G1
Heap allocation on alternative memory devices
Removed javah
Root certificates


Type inference with local variable 'var'
It reduces the verbosity of the java language
It helps to infer data type implicitly

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





