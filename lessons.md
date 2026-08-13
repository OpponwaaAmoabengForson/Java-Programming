# ☕ Java Notes

These are my personal notes from going back to Java to build a stronger foundation for DSA and programming.

The goal is not just to memorize syntax. I want to understand what the code is doing, make mistakes, debug them, and gradually build bigger programs.

---

## 📌 1. Variables

A variable is a named place where we store information.

### Example: Variable Declaration

int age = 18;
String name = "Kofi";
double price = 25.5;
char grade = 'A';

Think of it like a labelled box:

age  → 18
name → "Kofi"

Different data types are used for different kinds of information.

- int → whole numbers
- double → decimal numbers
- String → text
- char → one character
- boolean → true or false

---

## 🧮 2. Data Types

Java has different data types for different kinds of information.

### Common Data Types

| Data Type | Used For | Example |
| --- | --- | --- |
| int | Whole numbers | int age = 18; |
| double | Decimal numbers | double price = 25.5; |
| char | One character | char grade = 'A'; |
| boolean | True or false | boolean passed = true; |
| String | Text | String name = "Kofi"; |

The data type tells Java what kind of information the variable is going to store.

---

## 🖨️ 3. Printing Output

Java uses System.out.println() to print information.

### Example: Printing a Line

System.out.println("Hello");

It prints the message and moves to the next line.

There is also System.out.print().

System.out.print("Hello");
System.out.print("World");

### Output: No Newline

HelloWorld

With println():

System.out.println("Hello");
System.out.println("World");

### Output: With Newline

Hello
World

---

## 🎤 4. Scanner

Scanner allows the program to receive input from the user.

### First

import java.util.Scanner;

Then create a Scanner object:

Scanner sc = new Scanner(System.in);

The name sc is the name given to the Scanner object.

It could also be:

Scanner input = new Scanner(System.in);

or:

Scanner shoe = new Scanner(System.in);

If I create:

Scanner shoe = new Scanner(System.in);

then I have to use:

shoe.nextInt();
shoe.nextLine();

I cannot suddenly use:

input.nextLine();

unless I actually created a Scanner called input.

---

## ⌨️ 5. Scanner Input Methods

### nextInt()

Used to receive a whole number.

int age = sc.nextInt();

### nextDouble()

Used to receive a decimal number.

double price = sc.nextDouble();

### next()

Reads one word.

If the user enters:

Godwin Jess

then:

String name = sc.next();

only reads:

Godwin

### nextLine()

Reads the whole line.

String name = sc.nextLine();

So if the user enters:

Godwin Jess

nextLine() can read the entire:

Godwin Jess

---

## 🧹 6. The nextInt() + nextLine() Cleanup

This was one of the things that confused me.

If I do:

int age = sc.nextInt();
String name = sc.nextLine();

the nextLine() may appear to be skipped.

This is because nextInt() reads the number but leaves the newline from pressing Enter.

So I can use:

sc.nextLine();

as a cleanup.

### Example: Scanner Cleanup

int age = sc.nextInt();
sc.nextLine();

String name = sc.nextLine();

The standalone sc.nextLine() consumes the leftover newline.

But if I am already using nextLine():

String name = sc.nextLine();
String school = sc.nextLine();
String food = sc.nextLine();

I do not need a cleanup between them.

> **The cleanup is mainly needed when moving from methods like nextInt() or nextDouble() to nextLine().**

---

## 🔀 7. if Statements

An if statement allows the program to make a decision.

if (age >= 18) {
    System.out.println("You can enter");
}

If the condition is true, the code inside the if runs.

---

## 🔀 8. if / else

An else gives the program another option.

if (age >= 18) {
    System.out.println("You can enter");
} else {
    System.out.println("Sorry, you cannot enter");
}

If the condition is false, the else code runs.

---

## 🔀 9. else if

else if allows the program to check more than two possibilities.

### Example: Ticket Rule

if (age < 13) {
    System.out.println("Child Ticket");
} else if (age >= 13 && age <= 17) {
    System.out.println("Teen Ticket");
} else {
    System.out.println("Adult Ticket");
}

This gives:

| Age | Category |
|---|---|
| Below 13 | Child |
| 13–17 | Teen |
| 18+ | Adult |

I learned that the boundaries matter.

For example:

age > 13

does not include 13.

But:

age >= 13

does include 13.

---

## 🔢 10. Comparison Operators

These operators allow Java to compare values.

| Operator | Meaning |
|---|--- |
| < | Less than |
| > | Greater than |
| <= | Less than or equal to |
| >= | Greater than or equal to |
| == | Equal to |

### Example: Adult Check

if (age >= 18) {
    System.out.println("Adult");
}

---

## 🔗 11. Logical Operators

### && — AND

Both conditions must be true.

age >= 13 && age <= 17

This means the age must be 13 or above and 17 or below.

### || — OR

At least one condition must be true.

---

## 🔁 12. for Loops

A for loop repeats code.

### Basic Structure

for (start; condition; update) {

}

### Example: Counting to Five

for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

The three parts are:

starting point → condition → update

### Starting Point

int i = 1;

The loop starts at 1.

### Condition

i <= 5;

The loop continues while this is true.

### Update

i++;

After each repetition, i increases by 1.

So the loop goes:

1
2
3
4
5

Then it stops.

---

## 🔄 13. What Happens Inside a Loop?

Anything inside the loop repeats.

for (int i = 1; i <= 3; i++) {
    System.out.println("Hello");
}

### Output: Loop Repetition

Hello
Hello
Hello

But something outside the loop runs after the loop finishes.

for (int i = 1; i <= 3; i++) {
    System.out.println("Hello");
}

System.out.println("Bye");

### Output: After the Loop

Hello
Hello
Hello
Bye

So:

Inside the loop  → repeats
Outside the loop → happens after the loop

---

## ⚠️ 14. Loop Conditions Matter

I learned that the condition and update have to work together.

For example:

for (int i = 1; i >= 1; i++) {

}

This can keep going because:

i = 1
i = 2
i = 3
i = 4
...

The condition:

i >= 1

continues to be true.

So the loop does not know when to stop.

A better example for counting students is:

for (int i = 1; i <= students; i++) {

}

If:

students = 3;

then the loop runs three times.

---

## 🧑‍🎓 15. Using a Loop for Multiple Students

A loop can repeat the process of entering student information.

System.out.println("How many students do you want to register?");
int students = sc.nextInt();

sc.nextLine();

for (int i = 1; i <= students; i++) {

    System.out.println("Enter student name:");
    String name = sc.nextLine();

    System.out.println("Enter student age:");
    int age = sc.nextInt();

    sc.nextLine();
}

If the user enters 3, the program processes three students.

---

## 🛠️ 16. Methods

A method is a block of code with its own name.

### Example: Declaring a Method

static void welcome() {
    System.out.println("Welcome to my program");
}

Creating the method does not automatically run it.

I have to call it:

welcome();

---

## 🏁 17. main() and Other Methods

Java starts execution from:

public static void main(String[] args)

Other methods can be created outside main().

### Example: main() Calling a Method

public class Program {

    public static void main(String[] args) {

        welcome();

    }

    static void welcome() {
        System.out.println("Welcome to my program");
    }
}

The important idea is:

main()
  ↓
calls welcome()
  ↓
welcome() runs

The method does not have to be written before main().

Java follows the order in which the methods are called, not the order in which they appear in the class.

---

## 📞 18. Calling Multiple Methods

I can call more than one method from main().

public static void main(String[] args) {

    welcome();
    greet();

}

Java runs:

welcome()
   ↓
greet()

Even if greet() was written before welcome() in the class, welcome() still runs first because it was called first.

---

## 👋 19. Methods with Parameters

A method can receive information.

### Example: Greet with a Name

static void greet(String name) {
    System.out.println("Welcome " + name);
}

Then:

greet("Kofi");

The value "Kofi" is passed into the parameter name.

So:

greet("Kofi")
      ↓
name = "Kofi"
      ↓
method uses name

---## 🚪 20. Closing the Scanner

When the program is finished using the Scanner, it can be closed.

sc.close();

Usually, this is done near the end of main() after all input has been collected.

### Example: Closing a Scanner

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Program

    sc.close();
}

The basic idea is:

Create Scanner
      ↓
Use Scanner
      ↓
Finish input
      ↓
Close Scanner
      ↓
Finish program

---
# 🔢 21. Counters

A counter is a variable used to keep track of how many times something happens.

Think of it like a container that stores a number.

int count = 0;

At this point:

count = 0

Nothing has been counted yet.

---

## ➕ Increasing the Counter

To increase the counter by 1:

count++;

This is the short form of:

count = count + 1;

So:

int count = 0;

count++;

gives:

count = 1

If I do it again:

count++;

then:

count = 2

Again:

count++;

Now:

count = 3

---

## 🧠 What Does count++ Actually Mean?

count++ means:

> Take whatever is currently inside count and add 1.

Example:

count = 0
count++ → 1
count++ → 2
count++ → 3

The counter does not store the actual people or objects.

It only stores the number.

If 5 students have been counted:

count = 5

---

## 📍 Where Do I Create the Counter?

Usually, the counter is created before the loop when I want it to keep accumulating while the loop runs.

int count = 0;

for (int i = 1; i <= 5; i++) {

    count++;

}

At the end:

count = 5

If I created the counter inside the loop:

for (int i = 1; i <= 5; i++) {

    int count = 0;
    count++;

}

I would keep creating a new counter instead of keeping one counter that accumulates.

The important idea is:

Create counter
      ↓
Before the loop
      ↓
Loop runs
      ↓
Counter keeps its value
      ↓
Final count is available after the loop

---

## 🔀 Counter With if

A counter does not have to be inside an if.

But an if is useful when I only want to count something that meets a condition.

### Example: Counting Adults

int adults = 0;

if (age >= 18) {
    adults++;
}

The counter increases only when the person is an adult.

---

## 👥 Multiple Counters

I can have different counters for different things.

For example:

int adults = 0;
int teens = 0;
int children = 0;

Then:

if (age < 13) {
    children++;
} else if (age >= 13 && age <= 17) {
    teens++;
} else {
    adults++;
}

Each counter keeps track of its own category.

For example:

Adults   → 3
Teens    → 2
Children → 4

---

## 🔁 Counter Inside a Loop

This is where counters become really useful.

int count = 0;

for (int i = 1; i <= 5; i++) {
    count++;
}

System.out.println(count);

### Output: Final Count after Loop

5

The loop runs 5 times, and each time it runs:

count++;

adds 1.

So:

Loop 1 → count = 1
Loop 2 → count = 2
Loop 3 → count = 3
Loop 4 → count = 4
Loop 5 → count = 5

---

## 📌 Counter Syntax

The basic pattern is:

int count = 0;

count++;

Or:

int count = 0;

count = count + 1;

Both do the same thing.

---

## 🧠 Counter vs Accumulator

A counter normally counts occurrences:

count++;

An accumulator normally adds values:

sum = sum + value;

So:

| Concept | Main Question |
|---|---|
| Counter | How many? |
| Accumulator | How much in total? |

### Example: Counter vs Accumulator

Counter:

How many adults?

adults++;

Accumulator:

What is the total of all the ages?

sum = sum + age;

---

## 🎯 Main Idea

The counter pattern is:

Create the counter
       ↓
Start at 0
       ↓
Something happens
       ↓
Increase the counter
       ↓
Keep going
       ↓
Use the final number


The most important syntax to remember is:

int count = 0;

count++;


That's the foundation of counters.

---

## ➕ 22. Accumulators

An accumulator keeps adding values together.

A common pattern is:

sum = sum + value;

For example:

int sum = 0;

sum = sum + 5;
sum = sum + 10;
sum = sum + 15;

The value stored in sum keeps increasing.

This is similar to the DSA idea:

sum = sum + something;

The difference is:| Counter | Accumulator |
|---|---|
| Usually counts occurrences | Usually adds values together |
| Asks "How many?" | Asks "How much in total?" |
| Often uses count++ | Often uses sum = sum + value |

---

## 🐛 23. Debugging Lessons

Some of the mistakes I made while learning Java taught me important things.

## Wrong Scanner Name

If I create:

Scanner shoe = new Scanner(System.in);

I have to use:

shoe.nextInt();

not:

input.nextInt();

unless input was actually created.

### nextLine() Being Skipped

When moving from:

nextInt()

to:

nextLine()

I may need the cleanup:

sc.nextLine();

### Code Running Only Once

If I want something to happen for every student, it must be inside the loop.

for (int i = 1; i <= students; i++) {

    // Student information goes here

}

### Code Running After Every Student

If I put something inside the loop, it runs for every student.

If I want it only once after all students are finished, I put it after the loop.

### Counter Resetting

If I create a counter inside a loop:

for (int i = 1; i <= students; i++) {

    int count = 0;
    count++;

}

the counter is recreated on each iteration.

If I want one counter to keep accumulating, I create it before the loop:

int count = 0;

for (int i = 1; i <= students; i++) {

    count++;

}

### Infinite Loop

The loop condition must eventually become false.

for (int i = 1; i <= students; i++)

works because i eventually becomes greater than students.

---

# 📚 24. What I Have Learned So Far

So far, I have worked with:

- Java program structure
- Variables
- Data types
- System.out.print()
- System.out.println()
- Scanner
- nextInt()
- nextDouble()
- next()
- nextLine()
- Scanner cleanup
- if
- else
- else if
- Comparison operators
- Logical operators
- for loops
- Methods
- Method calls
- Method parameters
- Scanner.close()
- Counters
- Multiple counters
- Counter syntax
- Accumulators
- Debugging
- Combining concepts into programs

---

# 🏗️ Java Projects

This section contains the actual Java programs I have built while learning.

The purpose of the projects is to take the concepts from the notes and use them in real programs.

---
# 🎯 Learning Approach

My learning process is:

Learn
  ↓
Think about it
  ↓
Try it myself
  ↓
Make mistakes
  ↓
Debug
  ↓
Understand
  ↓
Build something
  ↓
Build on it

The goal is to build a strong Java foundation before moving deeper into DSA and more advanced programming.