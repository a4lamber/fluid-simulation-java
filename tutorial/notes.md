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
- [Part 5](#part-5)
  - [5.1 Learning OOP](#51-learning-oop)
    - [Object](#object)
  - [5.2 Overloading and constructors](#52-overloading-and-constructors)
    - [Constructor overloading](#constructor-overloading)
    - [Calling your constructor](#calling-your-constructor)
    - [Method Overloading](#method-overloading)
  - [5.3 Primitive and reference variables](#53-primitive-and-reference-variables)
    - [Primitive Variables](#primitive-variables)
    - [Reference Variables](#reference-variables)
    - [Primitive and Reference Variable as Methods Parameters](#primitive-and-reference-variable-as-methods-parameters)
  - [5.4 Objects and references](#54-objects-and-references)
    - [Assigning a reference type variable copies the reference](#assigning-a-reference-type-variable-copies-the-reference)
    - [`null` value of a reference variable](#null-value-of-a-reference-variable)
    - [Object as a method parameter](#object-as-a-method-parameter)
    - [Object of same type as method parameter](#object-of-same-type-as-method-parameter)
    - [Comparing equality of objects (equals)](#comparing-equality-of-objects-equals)
      - [`a == b`](#a--b)
      - [a.equals(b)](#aequalsb)
      - [`new` keyword](#new-keyword)
    - [Object as a method's return value](#object-as-a-methods-return-value)
  - [5.5 Conclusion](#55-conclusion)
- [Part 6](#part-6)
  - [6.1 Objects on a list](#61-objects-on-a-list)
    - [ArrayList in an object](#arraylist-in-an-object)
    - [Object in an Instanct variable List](#object-in-an-instanct-variable-list)
    - [Printing an Object from a list](#printing-an-object-from-a-list)
    - [Clearning an object's list](#clearning-an-objects-list)
  - [6.2 Separating the user interface from program logic](#62-separating-the-user-interface-from-program-logic)
    - [Programming tips](#programming-tips)
    - [From one entity to many parts](#from-one-entity-to-many-parts)
  - [6.3 Introduction to testing](#63-introduction-to-testing)
  - [6.4 Complex program](#64-complex-program)
- [Part 7](#part-7)
  - [7.1 Programming paradigms](#71-programming-paradigms)
  - [7.2 Algorithms](#72-algorithms)
  - [7.3 Larger programming exercises](#73-larger-programming-exercises)
  - [7.4 Conclusion](#74-conclusion)
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




# Part 5
> In this part:
> 1. learning OOP
> 2. removing repetitive code (overloading methods and constructors)
> 3. Primitive and reference variables
> 4. Objects and references
> 5. Conclusion


## 5.1 Learning OOP
idea is using layer of abstraction to hide details inside a class so the main code looks clean.

> OOP is primarily about isolating concepts into their own entities or, in other words, creating abstractions.

举一个例子
```java
int hours = 0;
int minutes = 0;
int seconds = 0;

while (true) {
    // 1. Printing the time
    if (hours < 10) {
        System.out.print("0");
    }
    System.out.print(hours);

    System.out.print(":");

    if (minutes < 10) {
        System.out.print("0");
    }
    System.out.print(minutes);

    System.out.print(":");

    if (seconds < 10) {
        System.out.print("0");
    }
    System.out.print(seconds);
    System.out.println();

    // 2. The second hand's progress
    seconds = seconds + 1;

    // 3. The other hand's progress when necessary
    if (seconds > 59) {
        minutes = minutes + 1;
        seconds = 0;

        if (minutes > 59) {
            hours = hours + 1;
            minutes = 0;

            if (hours > 23) {
                hours = 0;
            }
        }
    }
}
```
建一个class后
```java
public class ClockHand {
    private int value;
    private int limit;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void advance() {
        this.value = this.value + 1;

        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    public int value() {
        return this.value;
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }

        return "" + this.value;
    }
}
```
之后代码变这样
```java
ClockHand hours = new ClockHand(24);
ClockHand minutes = new ClockHand(60);
ClockHand seconds = new ClockHand(60);

while (true) {
    // 1. Printing the time
    System.out.println(hours + ":" + minutes + ":" + seconds);

    // 2. Advancing the second hand
    seconds.advance();

    // 3. Advancing the other hands when required
    if (seconds.value() == 0) {
        minutes.advance();

        if (minutes.value() == 0) {
            hours.advance();
        }
    }
}
```
基于`ClockHand`来构造`Clock`, 
```java
public class Clock {
    // 
    private ClockHand hours;
    private ClockHand minutes;
    private ClockHand seconds;

    // constructor
    public Clock() {
        this.hours = new ClockHand(24);
        this.minutes = new ClockHand(60);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.seconds.advance();

        if (this.seconds.value() == 0) {
            this.minutes.advance();

            if (this.minutes.value() == 0) {
                this.hours.advance();
            }
        }
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
```
最后变这样, 两层layer of abstraction;
```java
Clock clock = new Clock();

while (true) {
    System.out.println(clock);
    clock.advance();
}
```

### Object
`Object`, is an instance of `class` while `class` is the blueprint that we use to build `objects`.


## 5.2 Overloading and constructors
> Learning objective: 
> - Becoming familiar with the term overloading
> - Creating multiple constructors for a class;
> - Creating multiple methods with the same name in a class;

### Constructor overloading
有些时候，你希望user在使用这段代码的时候，支持不同数量的input, 这就是为什么需要overloading



看下面这段代码:
```java
public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public void printPerson() {
        System.out.println(this.name + " is " + this.age + " years old");
    }

    public void growOlder() {
        this.age++;
    }

    public boolean isAdult() {
        if (this.age < 18) {
            return false;
        }

        return true;
    }

    public double bodyMassIndex() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }

    public String toString() {
        return this.name + " is " + this.age + " years old, their BMI is " + this.bodyMassIndex();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }
}
```
假设你现在需要用constructor to set both age and name variables, we do this
```java
public Person(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

public Person(String name, int age) {
    this.name = name;
    this.age = age;
    this.weight = 0;
    this.height = 0;
}
```
Now we can,
```java
public static void main(String[] args) {
    Person paul = new Person("Paul", 24);
    Person ada = new Person("Ada");

    System.out.println(paul);
    System.out.println(ada);
}
```
This is called `constructor overloading`

> `constructor overloading: the technique of having two or more constructors in a class is known as constructor overloading.`

在主程序中区分不同的construcotr的方法仅仅只依靠pass in differnt number of variables? 怎么解决redundacy.

### Calling your constructor

程序员是很lazy的，我们现在发现：
- constructors很相似，可以copy paste (flag flag flag) 

所以在constructor overloading的case, 我们发现for the `Person` class, it has four attributes `name`, `age`, `weight` and `height`. 对一个construcotr, 最多设置四个parameter, 也就是说任何设置少于四个的construtor的，都是special case of the most genereal constructor that has four inputs.

Example like this
```java
public Person(String name) {
    this(name, 0);
    //here the code of the second constructor is run, and the age is set to 0
}

public Person(String name, int age) {
    this.name = name;
    this.age = age;
    this.weight = 0;
    this.height = 0;
}
```
### Method Overloading
同理，method overloading也被允许，也有同样的简化形式;


b4
```java
public void growOlder() {
    this.age = this.age + 1;
}

public void growOlder(int years) {
    this.age = this.age + years;
}
```
after
```java
public void growOlder() {
    this.growOlder(1);
}

public void growOlder(int years) {
    this.age = this.age + years;
}
```

## 5.3 Primitive and reference variables
> Learning Objective:
> You understand the terms primitive and reference variable.
> You know the types of primitive variables in Java, and also that there can be practicaly an infinite number of different reference variables.
> The difference in behavior between primitive and reference variables when values are assigned to them, or when they're used as method parameters.

Here is a map of data types in java

![](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20191105111644/Data-types-in-Java.jpg)

### Primitive Variables
就记住以下两点就可以了:
- declaring primitive variables, will always create a copy of it
- for primitive variable passed into a method as an argument, a copy of it has also been made 

Example 1:
```java
int first = 10;
int second = first;
int third = second;
System.out.println(first + " " + second + " " + third);
second = 5;
System.out.println(first + " " + second + " " + third);
```
output is 
```
10 10 10
10 5 10
```

Example 2 (所谓的variable scope)

```java
public class Example {
    public static void main(String[] args) {
        int number = 1;
        call(number);
       
        System.out.println("Number still: " + number);
    }
   
    public static void call(int number) {
        System.out.println("Number in the beginning: " + number);
        number = number + 1;
        System.out.println("Number in the end: " + number);
    }
}
```

Fore more information refers here
![](https://www.didattica.agentgroup.unimo.it/didattica/java/tutorial/figures/java/9parts.gif)

小知识点，为什么需要`{}`
|variable type|scope|lifetime|
|-|-|-|
|`instance variable (attributes)`|Troughout the class except in static methods|Until object is available in the memory.|
|`class variable`|Troughout the class|Until the end of the program|
|`local variable`|Within the block in which it is declared|Until the control leaves the block in which it is declared|


### Reference Variables

For the call of the following line
```java
Name leevi = new Name("Leevi);
```

Step1:
```java
Name
```

Step2:
```java
Name leevi
```

Step3:
```java
new Name("Leevi)
```

Step4:
```java
Name leevi = new Name("Leevi);
```

主要区别是:
- primitive type are all immutable while reference type, most of them at least (except String for example) are mutable.


### Primitive and Reference Variable as Methods Parameters
Consider `Person` class
```java
public class Person {
    private String name;
    private int birthYear;

    public Person(String name) {
        this.name = name;
        this.birthYear = 1970;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String toString() {
        return this.name + " (" + this.birthYear + ")";
    }
}
```
Consider
```java
public class Example {
    public static void main(String[] args) {
        Person first = new Person("First");

        System.out.println(first);
        youthen(first);
        System.out.println(first);

        Person second = first;
        youthen(second);

        System.out.println(first);
    }

    public static void youthen(Person person) {
        person.setBirthYear(person.getBirthYear() + 1);
    }
}
```

## 5.4 Objects and references
> Learning Objectives:
> - brush up on using classes and objects
> - You know what a `null` reference is, and what causes the `NullPointerException` error
> - Use an object as an object variable and a method parameter
> - create a method that returns an object
> - create the method equals, which can be used to check if two objects of the same type have the same contents or state.


> Tip: A constructor call returns a reference to an object.


### Assigning a reference type variable copies the reference



### `null` value of a reference variable

> Once a variable is referenced to `null`, then it will be automatically collected by the garbage collection in java. 


NullPointerException

```java
Person joan = new Person("Joan Ball");
System.out.println(joan);

joan = null;
joan.growOlder();
```


### Object as a method parameter
Java中有`date` class, 为了避免重复命名带来的困扰，我们创建一个`SimpleDate` class

```java
public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
```

### Object of same type as method parameter

Consider the Person class

```java
public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    // ...
}
```

If we want to compare the ages between two person, we could do
```java
Person muhammad = new Person("Muhammad ibn Musa al-Khwarizmi", 1, 1, 780);
Person pascal = new Person("Blaise Pascal", 19, 6, 1623);

if (muhammad.ageAsYears() > pascal.ageAsYears()) {
    System.out.println(muhammad.getName() + " is older than " + pascal.getName());
}
```
But there are more `OOP` way of comparing the ages of people.
```java
Person muhammad = new Person("Muhammad ibn Musa al-Khwarizmi", 1, 1, 780);
Person pascal = new Person("Blaise Pascal", 19, 6, 1623);

if (muhammad.olderThan(pascal)) {  //  same as muhammad.olderThan(pascal)==true
    System.out.println(muhammad.getName() + " is older than " + pascal.getName());
} else {
    System.out.println(muhammad.getName() + " is not older than " + pascal.getName());
}
```
下面是这个`public boolean olderThan(Person compared)` 的实现

```java
public class Person {
    // ...

    public boolean olderThan(Person compared) {
        // 1. First compare years
        int ownYear = this.getBirthday().getYear();
        int comparedYear = compared.getBirthday().getYear();

        if (ownYear < comparedYear) {
            return true;
        }

        if (ownYear > comparedYear) {
            return false;
        }

        // 2. Same birthyear, compare months
        int ownMonth = this.getBirthday().getMonth();
        int comparedMonth = compared.getBirthday().getMonth();

        if (ownMonth < comparedMonth) {
            return true;
        }

        if (ownMonth > comparedMonth) {
            return false;
        }

        // 3. Same birth year and month, compare days
        int ownDay = this.getBirthday().getDay();
        int comparedDay = compared.getBirthday().getDay();

        if (ownDay < comparedDay) {
            return true;
        }

        return false;
    }
}
```
如果你看看上述代码，你会发现有很多`this.getBirthday()` 都是来源于`SimpleDate` class, 那我们为什么不把比较，直接在`SimpleDate` class之中implement呢?
我们在`SimpleDate`这么做的用意是OOP的概念是一个class, 只负责做自己的职能, 彼此协同进行，不抢活反而更好.

```java
public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    // used to check if this date object (`this`) is before
    // the date object given as the parameter (`compared`)
    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        if (this.year > compared.year) {
            return false;
        }

        // years are same, compare months
        if (this.month < compared.month) {
            return true;
        }

        if (this.month > compared.month) {
            return false;
        }

        // years and months are same, compare days
        if (this.day < compared.day) {
            return true;
        }

        return false;
    }
}
```

### Comparing equality of objects (equals)

In java, comparing two variables has the following two options:
- `a == b`
- `a.equals(b)`

#### `a == b`

前者比较的是variable `a` and `b` 之中的内容是否相同，以下两种情况:
- 如果是primitive type, 比较数值，因为variable `a` and `b`中存的是值;
- 如果是reference type, 比较reference指向的memory中的内容是否一样。


#### a.equals(b)

`eqauls`, 和`toString`很像，如果任何一个class并没有implement `equals` 会有默认的equals template.默认会比较variable存的memory的location中的数据是否相同;

```java
SimpleDate first = new SimpleDate(1, 1, 2000);
SimpleDate second = new SimpleDate(1, 1, 2000);
SimpleDate third = new SimpleDate(12, 12, 2012);
SimpleDate fourth = first;
```

#### `new` keyword



### Object as a method's return value

我生我自己
```java
public class Counter {
    private int value;

    // example of using multiple constructors:
    // you can call another constructor from a constructor by calling this
    // notice that the this call must be on the first line of the constructor
    public Counter() {
        this(0);
    }

    public Counter(int initialValue) {
        this.value = initialValue;
    }

    public void increase() {
        this.value = this.value + 1;
    }

    public String toString() {
        return "value: " + value;
    }

    public Counter clone() {
        // create a new counter object that receives the value of the cloned counter as its initial value
        Counter clone = new Counter(this.value);

        // return the clone to the caller
        return clone;
    }
}
```

同时还可以`Factory()`来生成`Car()`

```java
public class Factory {
    private String make;

    public Factory(String make) {
        this.make = make;
    }

    public Car procuceCar() {
        return new Car(this.make);
    }
}
```




## 5.5 Conclusion
学了以下几个大类：
- OOP的核心概念，各司其职;




# Part 6
> In this part:
> 1. objects on a list and a list as part of an object
> 2. separating the user interface from the program logic
> 3. introducing to testing
> 4. complex programs


## 6.1 Objects on a list
> Learning Objectives:
> - You review the use of lists.
> - You know how to use a list as an instance variable;


### ArrayList in an object
这一个section没啥特别的, ArrayList as instance attributes



### Object in an Instanct variable List

这里就是object in a array `ArrayList<Person>` as a class attribute `private ArrayList<Person> riding;`

```java
public class AmusementParkRide {
    private String name;
    private int minimumHeight;
    private int visitors;
    private ArrayList<Person> riding;

    public AmusementParkRide(String name, int minimumHeight) {
        this.name = name;
        this.minimumHeight = minimumHeight;
        this.visitors = 0;
        this.riding = new ArrayList<>();
    }

    public boolean isAllowedOn(Person person) {
        if (person.getHeight() < this.minimumHeight) {
            return false;
        }

        this.visitors++;
        this.riding.add(person);
        return true;
    }

    public String toString() {
        return this.name + ", minimum height requirement: " + this.minimumHeight +
            ", visitors: " + this.visitors;
    }
}
```

### Printing an Object from a list


```java
public class AmusementParkRide {
    private String name;
    private int minimumHeight;
    private int visitors;
    private ArrayList<Person> riding;

    // ...

    // ArrayList
    public String toString() {
        // let's form a string from all the people on the list
        String onTheRide = "";
        for (Person person: riding) {
            onTheRide = onTheRide + person.getName() + "\n";
        }

        // we return a string describing the object
        // including the names of those on the ride
        return this.name + ", minimum height requirement: " + this.minimumHeight +
            ", visitors: " + this.visitors + "\n" +
            "riding:\n" + onTheRide;
    }
}
```

Now, let's look at main script


### Clearning an object's list



## 6.2 Separating the user interface from program logic
> Learning Objectives
> - understand creating programs so that the user interface and the application logic are separated
> - Can create a textual user interface, which takes program specifc application logic and a Scanner object as parameters;

要把user interface和program logic割离开，有点难理解, 假设现在有一个program, 需要用户输入信息直到用户输入两个相同的string, 由此我们知道以下几个条件:
- 需要有个循环，不断读取用户信息
- 这个循环需要有个break condition, 和先前用户输入的数进行判断
- 需要一个方式来储存这个信息

这时候可以根据以上要求来implement这个`UserInterface` class

```java
public class UserInterface {
    private Scanner scanner;
    private ArrayList<String> words;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.words = new ArrayList<String>();
    }

    public void start() {

        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (alreadyEntered(word)) {
                break;
            }

            // adding the word to the list of previous words
            this.words.add(word);

        }

        System.out.println("You gave the same word twice!");
    }

    public boolean alreadyEntered(String word) {
       if (word.equals("end")) {
            return true;
        }

        return false;
    }
}
```
我们逐字逐句的来解释每一个需求:
- 有一循环读取用户信息, `while (true)`
- 有一个break condition, `public boolean alreadyEntered`
- 有一个方式储存这个信息, `private ArrayList<String> words;`

注意到了吗? 不管是break condition判定，或者是arraylist判定，都和一种储存了用户输入信息的arraylist相关，这样的话，这两个功能又能被独立成一个新的class, 来做这项工作. `wordSet`, implemented below.

```java
import java.util.ArrayList;

public class WordSet {
    private ArrayList<String> words

    public WordSet() {
        this.words = new ArrayList<>();
    }

    public void add(String word) {
        this.words.add(word);
    }

    public boolean contains(String word) {
        return this.words.contains(word);
    }
}
```

这样的话，`UserInterface` 也简化成

```java
public class UserInterface {
    private WordSet wordSet;
    private Scanner scanner;

    public userInterface(WordSet wordSet, Scanner scanner) {
        this.wordSet = wordSet;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (this.wordSet.contains(word)) {
                break;
            }

            this.wordSet.add(word);
        }

        System.out.println("You gave the same word twice!");
    }
}
```

这么做的目的是:
- 在更改`WordSet`时，不需要更改acutal user interface.
- 以后对用户输入的信息，要加任何别的method的时候, 如`check Palindromes`


### Programming tips
- proceed with small steps
  - try to seprate the problem into several sub-problems and **work on only one sub-problem at a time**

- write clean code
  - **remove all copy-paste code**

### From one entity to many parts


## 6.3 Introduction to testing
略; 主要讲unit testing

## 6.4 Complex program

这一句总结OOP非常好, it's called `single responsibility principle`

> Gather together the things that change for the same reasons. Separate those things that change for difference reasons.



# Part 7
> In this part:
> - Programming paradigms
> - Algorithms
> - Larger programming exercises
> - Conclusion


## 7.1 Programming paradigms
> Learning objectives
> You know the concept of programming paradigm
> Procedural and OOP

看一下这里，学习下不同的[编程流派](https://www.google.com/search?q=programming+paradigms&oq=programming+para&aqs=chrome.0.0i512j69i57j0i512l3j0i20i263i512j69i60l2.3366j0j7&sourceid=chrome&ie=UTF-8).

这一章主要讲,OOP vs Procedural programming

|-|OOP|Procedural Programming|
|-|-|-|
|-|-|-|




## 7.2 Algorithms
> Learning Objective:
> Understand the concepts of algorithms
> Explain how selection sort works
> You can explain how the linear and binary search algorithms work

比较简单，节选着听吧；







## 7.3 Larger programming exercises


## 7.4 Conclusion




# Reference
- [介绍java statement and unreachable statement error](https://rollbar.com/blog/handling-the-unreachable-statement-error-in-java/#:~:text=1(a)%20is%20compiled%2C,block%2C%20as%20shown%20in%20Fig.)
- [java documentation by washington edu拿来对照着学挺好的](https://courses.cs.washington.edu/courses/cse341/98au/java/jdk1.2beta4/docs/api/java/lang/String.html)



