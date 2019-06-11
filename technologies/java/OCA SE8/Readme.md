# OCA Oracle Certified Associate: Java SE8 Programmer I

This folder contains my code for the OCA exam.


## Basic Questions
### How to get Java?
This certification works with Java SE8. How to install the right version? Java is in the repositories of Ubuntu. But you can get Java from other sources as well.

#### Which version?
On my ubuntu (18.04) openjdk-11 is pre-installed. I removed it and installed openjdk-8 instead to make sure I use java 8.

#### OpenJDK? Oracle Java? Zulu OpenJDK?
There are many distributions of Java. Openjdk is in the ubuntu repositories but not in current versions. Also, ubuntu drops openjdk-8 in 19.04 and ships only later versions.

There is this [Zulu project](https://www.linuxuprising.com/2019/04/install-latest-openjdk-12-11-or-8-in.html) that maintains and offerst their own openjdk distributions.

I'll stick with openjdk-8 from the ubuntu repos right now.

### How to run a java file program?

a) Compile with 
`javac TestClass.java`

b) run with
`java TestClass`
