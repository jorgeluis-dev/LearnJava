# Loop Structures in Java

In Java, loop structures are fundamental constructs that enable the execution of a set of instructions multiple times. These structures are essential for tasks that require repetitive actions, such as iterating over arrays, processing data, or simply running a block of code several times under specific conditions. This document provides an overview of the three primary loop structures in Java: `for`, `while`, and `do-while`.

## For Loop

The `for` loop is used to iterate over a range of values or through elements of an array or collection. It is particularly useful when the number of iterations is known beforehand. The syntax of the `for` loop is as follows:

```java
	for (initialization; condition; update) {
		{ // block of code to be executed }
	}
```

**Initialization:** Sets a starting point for the loop variable.
**Condition:** The loop will continue executing as long as this condition is true.
**Update:** Updates the loop variable at the end of each iteration.

Example:
```java
	for(int i = 0; i < 5; i++) {
	    System.out.println("i is: " + i);
	}
```

## While Loop

The `while` loop is used to execute a block of code repeatedly as long as a specified condition is true. It is ideal when the number of iterations is not known before entering the loop. The syntax of the `while` loop is:
```java
	while (condition) { 
		// block of code to be executed 
	}
```
Example:
```java
	int i = 0;
	while (i < 5) {
	    System.out.println("i is: " + i);
	    i++;
	}
```
## Do-While Loop

The `do-while` loop is similar to the `while` loop, with the key difference being that the `do-while` loop will execute the block of code once before checking the condition. This ensures that the block of code is executed at least once. The syntax of the `do-while` loop is:

```java
	do {
	    // block of code to be executed
	} while (condition);

```
Example:
```java
	int i = 0;
	do {
	    System.out.println("i is: " + i);
	    i++;
	} while (i < 5);
```



