# Programming

**IT - Information Technology**

All technology involved in information management and processing. Including: hardware, software, operating systems and
infrastructure.

**What is programming?**

Creating a set of instructions that can be executed by a computer in order to perform a specific task.

**How does a computer think?**

Computers don't think, they do what they are told.

**Frontend:**

- Visual interface
- No communication with the database
- Clientside

**Backend:**

- Logic
- Direct communication with the database
- Server side

# Java

Java is an **object-oriented programming** language. It got successful because of the **write once, run anywhere** principle.
This means that the same code can run on different devices. This works, because the Java code gets interpreted by a
special piece of software (JRE, Java Runtime Environment) that should be installed on devices that run Java. This is not
so special nowadays.

However, Java is still used a lot. Mainly for backend purposes (logic of applications that you can't see as an end
user). You can write APIs and other pieces of backend logic in Java.

Java Editions:

- Java SE
- Java EE
- Java ME
- Java Card

Java creates an object from a class when you instantiate it using the new keyword. Instantiating happens in a fixed
order, you need to know this order for the exam and it's actually useful in your day to day work as well.

This is the order:

- static initializers (blocks like these: static { } ) and static fields in the order they appear in the file

- instance variables and instance initializers (blocks like this: { } )

- constructor goes last

When there are no references to the object anymore, the object becomes eligible for garbage collection. The garbage
collector frees up the space on the heap once it runs. The garbage collector is controlled by the JVM (Java Virtual
Machine). You can suggest to the JVM it should garbage collect, but you cannot force it.

## What is OOP?

Objects Oriented Programming. Program consists of objects that contain data and functions and logic.

- **Encapsulation** - Classes have private fields and public methods to access the fields.
- **Inheritance** - A class can get properties and methods from a parent class
- **Polymorphism** - You can refer to a class by its parent

### Inheritance

Classes can inherit from a parent class. They can only have one direct parent.

This child class inherits all fields and methods from the parent class that are visible (access modifiers)
inside the child class.

Why inheritance:

- Avoids duplicate code
- Better structure and better maintenance
- Option to bundle different classes as the same kind (which again avoids duplicate code)

### Polymorphism

Referring to a class not with the class types exactly, but with another type that also represents the class

Non code example:

- I will bring my animal to next week's class
- I will bring my buddy to next week's class
- I will bring my dog to next week's class
- I will bring my Labrador to next week's class

Animal, buddy, dog and Labrador are all valid ways to address the labrador.

## Data Types

- Primitive
    - Integer (Byte, Short, Int, Long)
    - Floating Point (Float, Double)
    - Boolean (True, False)
    - Character
- Non-Primitive (Reference)
    - String
    - Array
    - Objects
    - Etc...

## Arrays

Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

- An array is **an object containing a fixed number of values of the same type**.
- The elements of an array are indexed, which means we can access them with numbers (called **indices**).
- There are primitive type arrays and object type arrays. This means we can use arrays of int, float, boolean, ...
  but also arrays of String, Object and custom types as well.

## Constructor

Constructors simply initializes all fields of the object with their default values.
Strings are initialized to null and integers to zero.

## Packages

A package in Java is used to group related classes. Think of it as a folder in a file directory.
We use packages to avoid name conflicts, and to write a better maintainable code.

Packages are divided into two categories:

- **Built-in Packages** (packages from the Java API)
- **User-defined Packages** (create your own packages)

## Types of Variables

There are three types of variables in Java:

- Local (non-static)
- Instance (non-static)
- Static

When a variable is declared as static, then a single copy of the variable is created and shared among all objects at a
class level.

### Static Variable

- Static variables can be accessed using class name
- Static variables can be accessed by static and non-static methods
- Static variables are shared among all instances of a class
- Static variables are like a global variable and are available to all methods

### Non-Static Variable

- Non-static variables can be accessed using instance of a class
- Non-static variables cannot be accessed inside a static method
- Non-static variables are specific to that instance of a class
- Non-static variables are like a local variable, and they can be accessed through only instance of a class

## Access Modifiers

- **private**
    - class
- **default** (no modifier)
    - class, package
- **protected**
    - class, package, subclasses in different packages
- **public**
    - world

## Non-access Modifiers

For classes:

- **final** - The class cannot be inherited by other classes
- **abstract** - The class cannot be instantiated (must be inherited from another class)

For **attributes** and **methods**:

- **final** - Attributes and methods cannot be overridden/modified
- **abstract** - Attributes and methods belong to the class, rather than an object
- **static** - Can only be used in an abstract class, and can only be used on methods. The methods do not have a body.
  The body is provided by the subclass (inherited from).
- **transient** - Attributes and methods are skipped when serializing the object containing them
- **synchronized** - Methods can only be accessed by one thread at a time
- **volatile** - The value of an attribute is not cached thread-locally, and is always read from the "main memory"

## Abstract Class vs. Interface

An abstract class is a class that is declared abstract - it may or may not include abstract methods.
Abstract classes cannot be instantiated, but they can be subclassed.
**If a class includes abstract methods, then the class itself must be declared abstract.**

- **Abstract Class and Interface:** Abstract classes are similar to interfaces. You cannot instantiate them, and they
  may contain a mix of methods
  declared with or without an implementation.
- **Abstract Class:** You can declare fields that are not fields that are not static and final, and define public,
  protected, and private
  concrete methods.
- **Interface:** All fields are automatically public, static, and final, and all methods that you declare or define (as
  default methods) are public.

**Which should we use, abstract classes or interfaces?**

**Abstract Class:**

- You want to share code among several closely related classes.
- Have many common methods or fields, or require access modifiers other than public
- You want to declare non-static or non-final fields.

**Interface:**

- Unrelated classes would implement your interface
- You want to specify the behavior of a particular data type, but not concerned about who implements it behavior
- You want to take advantage or multiple inheritance of type

## Collections Framework

The Java Collections Framework is a set of interfaces in the packages java.util and java.util.concurrent.
They provide client programs with various models of how to organize their objects, and various implementations of each
model

These models are sometimes called abstract data types, and we need them because different programs need different ways
of organizing their objects.