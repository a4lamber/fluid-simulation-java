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
- [Part 8](#part-8)
  - [8.1 short recap](#81-short-recap)
  - [8.2 Hash Map](#82-hash-map)
    - [Objects as a HashMap value](#objects-as-a-hashmap-value)
  - [8.3](#83)
- [Reference](#reference)



# Part 1
????????????????????????, part I, ???????????????????????????difference, `java` vs `python`??????????????????:
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

expression?????????multi-part??????????????????????????????logical operator??????; 

|-|python|java|
|-|-|-|
|-|and|`&&`|
|-|or|-|
|-|!|`!`|

> ?????????????????????, `fizzbuzz`??????????????????????????????`if eles if `statement, ????????????`if`??????first met condition????????????????????????????????????`most demanding conditon`.

# Part 2
??????????????????:
- define method
- loop structure 

## cleaner java


### For `if` statements

> For a neater code, ?????????????????????, ??????`single clear task` ??????if if if, ?????????if else if else



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
??????loop??????????????????block, ????????????loop structure???????????????????????????readability, ??????????????????????????????????????????????????????. ?????????????????????template, 
- ???loop???
  - check break condition
  - check invalid input
  - handle valid input
- ???loop???
  - ????????????



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

??????????????????????????????
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
Java ????????????statement
- expression statement
- declaration statement
- control-flow statement

?????????complie language, ????????????statement????????????????????????, ??????:
- statement after `return`, `break`, `continue`



# Part 3
??????????????????????????????syntax???????????????LC??????,
- discovering errors
- lists
- arrays
- using strings




## ArrayList
????????????`class ArrayList<>()`, ??????implementation???pyton list??????????????????????????????????????????????????????;

### General use case




### reference type vs primitive type 
VALUE TYPE (primitive) and reference type (ArrayList) ??????????????????????????????, ???java??????????????????, ?????????????????????method, input??????copy over to the method scope???:
- for primitive type like `int`, a copy has been made in the method. whatever you do to it inside the method, it's not gonna affect the value in main.
- for reference type like `ArrayList`, a reference copy has been passed into the method. So these values are synced.



## Arrays

Arrays is the ancestor of ArrayList, you create it like this in Java:
- ????????????capacity???3???array, `int[] numbers = new int[3];`
- `String[] strings = new String[5];`


There are shorter ways to craete array
- `int[] numbres = {100, 1, 42}` ??????????????????specify size???????????????

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
|Create array `a`|`a = []` or `ll = list()`|`ArrayList<Integer> ll = new ArrayList<>();`|`Integer[] a = new int[3]` or `String[] arrayOfStrings = {"Matti L.", "Matti P.", "Matti V."}`|python list stores different type while arraylist and array only stores the type you specify. Array??????static array, ??????????????????;|
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

??????class????????????????????????????????????
- The **object's variables (instance variables)** specify the internal state of the object.
- **Constructor** to initialize the attributes
- The **object's methods** specify what the object does




```java
public class Person {
    // attributes
    private String name;
    private int age;

    /* constructor
    1. ??????named after the class
    2. ????????????construvtor, java?????????????????????default constructor, ??????reference type points to Null, primitive be zero
    */
    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }
}
```

### A string representation of an object and the toString-method
???????????????python???`__str__`

|java|python|
|-|-|
|`toString`|`__str__`|

??????????????????????????????at runtime

```java
System.out.println(antti);
```
system.out.println?????????antti??????instance????????????class?????????string representation, defined as `ClassName.toString()`;

### Method parameter
???????????????:
- in java, ????????????method???only purpose is to set a value to an attribute (instance variable), it should be called `setVariableName()`. ????????????valueSetting methods, ??????setter



## Objects in a list
> Learning Objective: 
> - You can add objects to a list;
> - you can go through objects in a list;



### Adding objext to a list



## Files and reading data
??????????????????file and file system

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

???????????????
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
?????????class???
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
?????????????????????
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
??????`ClockHand`?????????`Clock`, 
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
???????????????, ??????layer of abstraction;
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
????????????????????????user??????????????????????????????????????????????????????input, ????????????????????????overloading



?????????????????????:
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
????????????????????????constructor to set both age and name variables, we do this
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

??????????????????????????????construcotr????????????????????????pass in differnt number of variables? ????????????redundacy.

### Calling your constructor

???????????????lazy???????????????????????????
- constructors??????????????????copy paste (flag flag flag) 

?????????constructor overloading???case, ????????????for the `Person` class, it has four attributes `name`, `age`, `weight` and `height`. ?????????construcotr, ??????????????????parameter, ???????????????????????????????????????construtor????????????special case of the most genereal constructor that has four inputs.

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
?????????method overloading??????????????????????????????????????????;


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
?????????????????????????????????:
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

Example 2 (?????????variable scope)

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

??????????????????????????????`{}`
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

???????????????:
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
Java??????`date` class, ????????????????????????????????????????????????????????????`SimpleDate` class

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
???????????????`public boolean olderThan(Person compared)` ?????????

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
???????????????????????????????????????????????????`this.getBirthday()` ???????????????`SimpleDate` class, ??????????????????????????????????????????`SimpleDate` class??????implement????
?????????`SimpleDate`?????????????????????OOP??????????????????class, ???????????????????????????, ??????????????????????????????????????????.

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

??????????????????variable `a` and `b` ????????????????????????????????????????????????:
- ?????????primitive type, ?????????????????????variable `a` and `b`???????????????;
- ?????????reference type, ??????reference?????????memory???????????????????????????


#### a.equals(b)

`eqauls`, ???`toString`???????????????????????????class?????????implement `equals` ???????????????equals template.???????????????variable??????memory???location????????????????????????;

```java
SimpleDate first = new SimpleDate(1, 1, 2000);
SimpleDate second = new SimpleDate(1, 1, 2000);
SimpleDate third = new SimpleDate(12, 12, 2012);
SimpleDate fourth = first;
```

#### `new` keyword



### Object as a method's return value

???????????????
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

???????????????`Factory()`?????????`Car()`

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
???????????????????????????
- OOP??????????????????????????????;




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
?????????section???????????????, ArrayList as instance attributes



### Object in an Instanct variable List

????????????object in a array `ArrayList<Person>` as a class attribute `private ArrayList<Person> riding;`

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

??????user interface???program logic???????????????????????????, ?????????????????????program, ?????????????????????????????????????????????????????????string, ????????????????????????????????????:
- ?????????????????????????????????????????????
- ????????????????????????break condition, ???????????????????????????????????????
- ???????????????????????????????????????

????????????????????????????????????implement??????`UserInterface` class

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
?????????????????????????????????????????????:
- ??????????????????????????????, `while (true)`
- ?????????break condition, `public boolean alreadyEntered`
- ?????????????????????????????????, `private ArrayList<String> words;`

???????????????? ?????????break condition??????????????????arraylist???????????????????????????????????????????????????arraylist?????????????????????????????????????????????????????????????????????class, ??????????????????. `wordSet`, implemented below.

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

???????????????`UserInterface` ????????????

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

?????????????????????:
- ?????????`WordSet`?????????????????????acutal user interface.
- ???????????????????????????????????????????????????method?????????, ???`check Palindromes`


### Programming tips
- proceed with small steps
  - try to seprate the problem into several sub-problems and **work on only one sub-problem at a time**

- write clean code
  - **remove all copy-paste code**

### From one entity to many parts


## 6.3 Introduction to testing
???; ?????????unit testing

## 6.4 Complex program

???????????????OOP?????????, it's called `single responsibility principle`

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

????????????????????????????????????[????????????](https://www.google.com/search?q=programming+paradigms&oq=programming+para&aqs=chrome.0.0i512j69i57j0i512l3j0i20i263i512j69i60l2.3366j0j7&sourceid=chrome&ie=UTF-8).

??????????????????,OOP vs Procedural programming

|-|OOP|Procedural Programming|
|-|-|-|
|-|-|-|




## 7.2 Algorithms
> Learning Objective:
> Understand the concepts of algorithms
> Explain how selection sort works
> You can explain how the linear and binary search algorithms work

?????????????????????????????????



## 7.3 Larger programming exercises
????????????OOP, ?????????????????????????????????????????????????????????????????????
- `main`
- `UserInterface`: inputs are `recipes` and `scanner`, ?????????sql???briding table;
- `recipe` or `bird`: method for a single object
- `recipes` or `birds`: method for an array of object 



## 7.4 Conclusion




# Part 8
> In this part:
> - short recap
> - hash map
> - similarity of objects
> - grouping data using hash maps
> - fast data fetching and grouping information


## 8.1 short recap
Almost used exactly the same problem as previous problem. Not satisfied


## 8.2 Hash Map



```java
import java.util.HashMap

Hashmap<String,String> numbers = new HashMap<>();
//
numbers.put("One","Uno");
numbers.put("Two","Dos");

number.get("One");

// check whether key in key space of the hash
numbers.containsKey("Uno");


```

### Objects as a HashMap value



## 8.3 





# Reference
- [??????java statement and unreachable statement error](https://rollbar.com/blog/handling-the-unreachable-statement-error-in-java/#:~:text=1(a)%20is%20compiled%2C,block%2C%20as%20shown%20in%20Fig.)
- [java documentation by washington edu???????????????????????????](https://courses.cs.washington.edu/courses/cse341/98au/java/jdk1.2beta4/docs/api/java/lang/String.html)



