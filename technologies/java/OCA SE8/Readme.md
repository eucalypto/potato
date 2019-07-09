# OCA Oracle Certified Associate: Java SE8 Programmer I

This folder contains my code for the OCA exam.


## Basic Questions

### Which sources am I using?

#### Book: Study Guide
I'm using the book "OCA: Oracle Certified Associate Java SE 8 Programmer I Study Guide: Exam 1Z0-808" by Jeanne Boyarsky and Scott Selikoff from 2015-01. It's the only textbook I use, so I can't compare to other available study guides.

Java is an object-oriented language. If I didn't know the topics already, I would have needed an extra Java textbook and much, much more time.

The review questions at the end of each chapter are annoyingly hard. The authors wanted to give me a good feeling when I can solve them correctly because they are harder than the exam questions. Still, I like those questions. Even without the exam they are useful: they force me to actively recall the content.

Disclaimer: The folders mimic the chapter structure of this study guide. And my code samples are often inspired by the book's examples though I'm trying to change them to my own ideas.

#### Book: Practice Tests
The authors of the study guide have also a book with practice questions: "OCA / OCP Java SE 8 Programmer Practice Tests" by Jeanne Boyarsky and Scott Selikoff from 2017-06.

This is almost more valuable than the study guide! In a perfect world, they would have put those questions already in their study guide. Those questions are easy to solve: they have only 4 answers and only one of them is correct! Those questions are not there to test my knowledge but to teach me one simple lesson.

They could have been written in normal paragraphs. But them being in form of questions makes it a much more active form of reading!

I recommend reading one chapter from the study guide but then _not_ do the review questions from the study guide but _instead_ do the questions from this "Practice test" concerning the chapter. They will make you understand important aspects. Then you can take the review questions from the study guide.

#### Practice Exams



### How to get Java?
This certification works with Java SE8. How to install the right version? Java is in the repositories of Ubuntu. But you can get Java from other sources as well.

#### Which version?
On my ubuntu (18.04) openjdk-11 is pre-installed. I removed it and installed openjdk-8 instead to make sure I use java 8.

#### OpenJDK? Oracle Java? Zulu OpenJDK?
There are many distributions of Java. Openjdk is in the ubuntu repositories but not in current versions. Also, ubuntu drops openjdk-8 in 19.04 and ships only later versions.

There is this [Zulu project](https://www.linuxuprising.com/2019/04/install-latest-openjdk-12-11-or-8-in.html) that maintains and offers their own openjdk distributions.

I'll stick with openjdk-8 from the ubuntu repos right now.

### How to run a java file program?

a) Compile with 
`javac TestClass.java`

b) run with
`java TestClass`
