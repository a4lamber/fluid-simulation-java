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









# Reference
- [介绍java statement and unreachable statement error](https://rollbar.com/blog/handling-the-unreachable-statement-error-in-java/#:~:text=1(a)%20is%20compiled%2C,block%2C%20as%20shown%20in%20Fig.)




