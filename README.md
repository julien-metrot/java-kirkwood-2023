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

### Week 5 and 6

In Week 5 and 6 we learned about __Casting__, More about the __Math Class__, Generating __random numbers__, __Nested if statement__, __Nested for loops__, __Nested while loops__.

#### Casting
__Java__ __casting__ converts data types, done implicitly or explicitly. Implicitly for smaller to larger variables, and explicitly for the opposite. However, explicit casting may cause data loss or truncation and should be used cautiously.
Here is an example:
```java
long num1 = 1000000L;
int num2 = (int)myLong;
```
The code assigns a __long__ value to __num1__, then casts it to an integer __num2__. Since a __Long__ data type can hold more data than an __Int__, data truncation may occur if the number is larger than the limitation of an int.

#### Nested If Statements

__Nested if statements__ are when you have an __if statement__ inside another __if statement__. It's used when you need to check for __multiple conditions__ to be true in order to execute a block of code. <br>
Here is an example:
```java
int num1 = 10;
int num2 = 20;

if (num1 > 5) {
    if (num2 > 10) {
        System.out.println("Both conditions are true.");
    }
}
```
The code first checks if __num1__ is greater than 5. If that's true, it then checks if __num2__ is greater than 10. If both conditions are true, it prints out "Both conditions are true." Else it doesn't print anything. <br>
However, this code can be written in a much better way. <br>
Here is the updated code:
```java
int num1 = 10;
int num2 = 20;

if (num1 > 5 && num2 > 10) {
        System.out.println("Both conditions are true.");
}
```
In my opinion, this makes the codes a lot more readable and easier to understand.

## Week 7 and 8

In week 7 and 8 we learned about debugging and java arrays and their methods. Debugging can be a helpful tool to figure out a problem in the code.

### Debugging in IntelliJ

Using the built-in debugger in IntelliJ can be very useful. I learned how to set breakpoints and step through code to identify and fix errors.
<br>
Here's an example:
```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i--;
    }
```
This is a simple infinite while loop. Let's say I don't understand why it's infinite, You can set a breakpoint on print statements and the code will stop on that breakpoint. You can manually step through code to identify and fix the error.

### Arrays

Arrays are a fundamental concept in Java, and I learned how to declare, initialize, and access arrays. We can also use various methods with arrays, such as Arrays.sort(), which sorts the elements in the array in ascending order.
<br>
Here's an example:
```java
int[] nums = {3, 1, 2, 5, 4};
Arrays.sort(nums);
System.out.println(Arrays.toString(nums));
```
We first initialize an int array with 5 indexes. We then use the ```Arrays.sort``` method to sort the array in ascending order. Finally, we print out the array. <br>
We also user ```Arrays.toString``` to print it out. this will print a String representation of the array so, it is readable for the user. If we do not include this method it will print the location in memory. This results in a bunch of random characters and numbers.

## Week 9 and 10

### Java Methods

In week 9 and 10 we learned about creating and using methods in Java.
Methods are reusable blocks of code that can be called from other parts of your program.
I learned the syntax for creating methods, including the access modifier, return type, method name, parameter list, and method body.
<br>
Here's an example:
```java
public static int calculateArea(int length, int width) {
  return length * width;
}
```
This program calculates the area of a rectangle.

### Static and Non-Static Methods

I also learned about the difference between static and non-static methods.
Static methods belong to the class and can be called without creating an instance of the class, while non-static methods belong to the object and can only be called on an instance of the class.
<br>
Here's an example:
```java
public static int generateRandomNumber() {
  return (int) (Math.random() * 100);
}
```
The code above creates a static method to generate a random number. We use the Math class to do so. The Math class is a static method and can be called without creating an instance of it.