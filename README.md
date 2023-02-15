# Java Kirkwood 2023

This is the work I completed for my CIS-171 Java course at Kirkwood Community College. Below is a journal of all the things I learned throughout the class.

### Introduction

In the Introduction unit we created accounts and installed software needed for the class.

Using [IntelliJ](https://www.jetbrains.com/) we created a module with a __Java class__ inside it. Inside the class we created a main method that displays a message in the terminal. We can type "sout" followed by the tab key to generate the System.out.println() statement.

```java
public class MyClass {
    public static void main(String[] args) {
        System.out.println("My name is Julien!");
    }
}
```

We initialized our project as a __Git repository__ and pushed our project code to [GitHub](https://github.com/). Our project includes a **.gitignore** file telling Git which files not to track.

Going forward, whenever I complete a task I will __Add-Commit-Push (ACP)__
```
git add .
git commit -m "describe my work"
git push origin main
```

### Week 3 and 4

In Chapters 1 and 2 we learned about the __if statement__, __for loops__, what __data types__ are, and the usefull __Math class__ built in __Java__.
Learning the basics of java will become very handy for the future.

#### If Statements

The [if statement](https://www.w3schools.com/java/java_conditions.asp) in __Java__ is a conditional statement that executes a block of code if a particular condition is true. The code within the if statement's curly braces is executed only if the condition is true.
<br>
Here is an example: <br>
```java
int num1 = 10;
int num2 = 20;
if (num1 < num2) {
    System.out.println("num1 is greater than num2.");
}
```
The if statement will only run if __num1__ is greater than __num2__.

#### For Loop

A [for loop](https://www.w3schools.com/java/java_for_loop.asp) in __Java__ is a control structure that executes a block of code repeatedly for a fixed number of times. The loop consists of three parts: __initialization__, __condition__, and __update__, and the code within the loop's curly braces is executed repeatedly until the condition is false.
<br>
Here is an example: <br>
```java
for (int i = 0; i <= 10; i++;) {
    System.out.println(i);
}
```
The for loop will print out the numbers 0 to 10. It will keep running until __i is less than 10__.