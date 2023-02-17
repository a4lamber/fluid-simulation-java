# Neat Java notes
---
My current main skill is Python and my goal the project is to learn:
- learn `java` syntax
- compare the difference between dynamic language (`python`) and static language (`java`).
- cleaner and neater code structure.

In this note, I will summarize what i have learnt while coding in `java` following the U of Helsinki tutorial.


**Table of contents:**
- [Neat Java notes](#neat-java-notes)
- [Part 1](#part-1)
  - [Type conversion](#type-conversion)
  - [Comparision operation](#comparision-operation)
  - [logical operator](#logical-operator)
- [Part 2](#part-2)
  - [cleaner java](#cleaner-java)
    - [For `if` statements](#for-if-statements)
    - [For loop structure](#for-loop-structure)
  - [Statements in java](#statements-in-java)
- [Part 3](#part-3)
  - [ArrayList](#arraylist)
    - [General use case](#general-use-case)
    - [reference type vs primitive type](#reference-type-vs-primitive-type)
  - [Arrays](#arrays)
  - [Using strings](#using-strings)
    - [Splitting a string](#splitting-a-string)
  - [Summary](#summary)
- [Part 4](#part-4)
  - [Introduction to object-oriented programming](#introduction-to-object-oriented-programming)
    - [A string representation of an object and the toString-method](#a-string-representation-of-an-object-and-the-tostring-method)
    - [Method parameter](#method-parameter)
  - [Objects in a list](#objects-in-a-list)
    - [Adding objext to a list](#adding-objext-to-a-list)
  - [Files and reading data](#files-and-reading-data)
    - [Files and Filesystem](#files-and-filesystem)
- [Reference](#reference)



# Part 1
这一部分比较基础, part I, 通过比较两种语言的difference, `java` vs `python`主要讨论两点:
- type conversion (narrowing and widening concept) 
- comparision operatoin 


## Type conversion
Type conversion in java has
```
double
float
long
int
char
short
byte
``` 

- `narrowing`: manually handled with `(long) someRandomDouble` 
- `widening`: automatically handled


> `Auto-indentation`: ctro + shift + f


## Comparision operation

Also in java string comparision can't be done directly like in python
```python 
if "hello" == "hello":
    print(100)
```
In java
```java
Scanner reader = new Scanner(System.in);

System.out.println("Enter a string");
String input = reader.nextLine();

if (input.equals("a string")) {
    System.out.println("Great! You read the instructions correctly.");
} else {
    System.out.println("Missed the mark!");
}
```


## logical operator

expression可能是multi-part的，这样的话就需要用logical operator连接; 

|-|python|java|
|-|-|-|
|-|and|`&&`|
|-|or|-|
|-|!|`!`|

> 学到了一个新词, `fizzbuzz`这样的经典题目中，有`if eles if `statement, 由于这个`if`会在first met condition跳出，所以排序的话要先排`most demanding conditon`.

# Part 2
主要熟悉一下:
- define method
- loop structure 

## cleaner java


### For `if` statements

> For a neater code, 就书写格式来说, 强调`single clear task` 能写if if if, 就不写if else if else



### For loop structure
For a loop structure, iet's see the code below.
```java
Scanner reader = new Scanner(System.in);

System.out.print("Write numbers, negative numbers are invalid: ");
int sum = 0;
int validNumbers = 0;
int invalidNumbers = 0;

while (true) {
    int input = Integer.valueOf(reader.nextLine());

    if (input == 0) {
        System.out.println("Sum of valid numbers: " + sum);
        System.out.println("Valid numbers: " + validNumbers);
        System.out.println("Invalid numbers: " + invalidNumbers);
        break;
    }

    if (input < 0) {
        invalidNumbers++;
        continue;
    }

    sum += input;
    validNumbers++;
}
```
由于loop后执行的语句block, 被嵌入在loop structure之中了，这样减少了readability, 同时当语句越来越多时，会变的更难看懂. 现在再来看以下template, 
- 在loop内
  - check break condition
  - check invalid input
  - handle valid input
- 在loop外
  - 统一执行



```java
Scanner reader = new Scanner(System.in);

// Create variables needed for the loop

while (true) {
    // read input

    // end the loop -- break

    // check for invalid input -- continue

    // handle valid input
}

// functionality to execute after the loop ends
```

所以更改后的代码如下
```java
Scanner reader = new Scanner(System.in);

System.out.print("Write numbers, negative numbers are invalid: ");
int sum = 0;
int validNumbers = 0;
int invalidNumbers = 0;

while (true) {
    int input = Integer.valueOf(reader.nextLine());

    if (input == 0) {
        break;
    }

    if (input < 0) {
        invalidNumbers++;
        continue;
    }

    sum += input;
    validNumbers++;
}

System.out.println("Sum of valid numbers: " + sum);
System.out.println("Valid numbers: " + validNumbers);
System.out.println("Invalid numbers: " + invalidNumbers);
```





## Statements in java
Java 中有三种statement
- expression statement
- declaration statement
- control-flow statement

由于是complie language, 如果哪些statement是永远无法到达的, 比如:
- statement after `return`, `break`, `continue`



# Part 3
这一章开始比较重要的syntax了，毕竟刷LC常用,
- discovering errors
- lists
- arrays
- using strings




## ArrayList
这里介绍`class ArrayList<>()`, 其实implementation和pyton list很像，只不过只能装一种类型的数据罢了;

### General use case




### reference type vs primitive type 
VALUE TYPE (primitive) and reference type (ArrayList) 是两种不同的数据类型, 在java中要注意的是, 如果你创建一个method, input是被copy over to the method scope的:
- for primitive type like `int`, a copy has been made in the method. whatever you do to it inside the method, it's not gonna affect the value in main.
- for reference type like `ArrayList`, a reference copy has been passed into the method. So these values are synced.



## Arrays

Arrays is the ancestor of ArrayList, you create it like this in Java:
- 创建一个capacity为3的array, `int[] numbers = new int[3];`
- `String[] strings = new String[5];`


There are shorter ways to craete array
- `int[] numbres = {100, 1, 42}` 这样就不需要specify size和大小了；

```java
String[] arrayOfStrings = {"Matti L.", "Matti P.", "Matti V."};
double[] arrayOfFloatingpoints = {1.20, 3.14, 100.0, 0.6666666667};
```


## Using strings
Learning objectives 
- Revising reading, printing and comparing Strings
- Knowing how to split a string into several pieces

### Splitting a string
```java
String text = "first second third fourth";
String[] pieces = text.split(" ");
System.out.println(pieces[0]);
System.out.println(pieces[1]);
System.out.println(pieces[2]);
System.out.println(pieces[3]);

System.out.println();

for (int i = 0; i < pieces.length; i++) {
    System.out.println(pieces[i]);
}
```

## Summary

In this section, we have learnt Array, ArrayList. Now, we need to compare it with Python for better understanding.

|Method|Python `List`|Java `ArrayList`|Java `Array`|Description|
|-|-|-|-|-|
|Create array `a`|`a = []` or `ll = list()`|`ArrayList<Integer> ll = new ArrayList<>();`|`Integer[] a = new int[3]` or `String[] arrayOfStrings = {"Matti L.", "Matti P.", "Matti V."}`|python list stores different type while arraylist and array only stores the type you specify. Array就是static array, 更基础的类型;|
|find the length|`len(a)`|`a.size()`|`a.length`|-|
|indexing|`a[0]`|`a.get(0)`|`a[0]`|-|
|for-each loop|`for teacher in teachers:`|`for (String teacher : teachers)`|`for (String teacher : teachers)`|Need to specify the type for the iterator|
|append elements|`a.append()`|`a.add()`|-|-|
|remove element by value|-|-|-|-|




# Part 4
Learning objective:
- intro to OOP
- objects as a list
- Files and reading data
- Summary

## Introduction to object-oriented programming

Recall last part where we create an `ArrayList` class
```java
ArrayList<Integer> integers = new ArrayListM<>();
```

一个class主要有以下几个步骤完成：
- The **object's variables (instance variables)** specify the internal state of the object.
- **Constructor** to initialize the attributes
- The **object's methods** specify what the object does




```java
public class Person {
    // attributes
    private String name;
    private int age;

    /* constructor
    1. 必须named after the class
    2. 如果不设construvtor, java内部会创造一个default constructor, 那么reference type points to Null, primitive be zero
    */
    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }
}
```

### A string representation of an object and the toString-method
实际上就是python的`__str__`

|java|python|
|-|-|
|`toString`|`__str__`|

每当程序运行的时候，at runtime

```java
System.out.println(antti);
```
system.out.println都会向antti这个instance所属于的class找它的string representation, defined as `ClassName.toString()`;

### Method parameter
几个小习惯:
- in java, 如果一个method的only purpose is to set a value to an attribute (instance variable), it should be called `setVariableName()`. 这些叫做valueSetting methods, 也叫setter



## Objects in a list
> Learning Objective: 
> - You can add objects to a list;
> - you can go through objects in a list;



### Adding objext to a list



## Files and reading data
这一章重点讲file and file system

### Files and Filesystem







# Reference
- [介绍java statement and unreachable statement error](https://rollbar.com/blog/handling-the-unreachable-statement-error-in-java/#:~:text=1(a)%20is%20compiled%2C,block%2C%20as%20shown%20in%20Fig.)
- [java documentation by washington edu拿来对照着学挺好的](https://courses.cs.washington.edu/courses/cse341/98au/java/jdk1.2beta4/docs/api/java/lang/String.html)



