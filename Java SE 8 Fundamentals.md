# Java SE 8 Fundamentals

**JDK 8**: The Java SE Development Kit includes the command-line Java compiler (javac) and the Java Runtime
Environment (JRE),
which supplies the command needed to execute Java applications.

**Java API Documentation**: The API documentation is the application programming interface specification.

Objectives:

- Contrast the terms "platform-dependent" and "platform-independent"
- Describe the purpose of the JVM
- Explain the difference between a procedural program and an object-oriented program
- Describe the purpose of javac and java executables
- Verify the Java version on your system
- Run a Java program from the command line

**Purpose of a Computer Program**

A computer program is a set of instructions that run on a computer or other digital device.

- At the machine level, the program consists of binary instructions (1s and 0s) - machine code.
- Most programs are written in high-level code (readable) - must be translated to machine code.

Programs written in most languages usually require numerous modifications to run on more than one type of computing
platform, a combination (of a CPU and operating system).
This platform-dependence is because most languages require you to write code specific to the underlying platform.
Popular programming languages, such as C and C++, require programmers to compile and link their programs, resulting in
an executable program unique to the underlying platform.
A compiler is an application that converts a program that you write into a CPU-specific code called machine code.
These platform-specific files (binary files) are often combined with other files, such as libraries of pre-written code,
using a linker to create a platform-dependent program,
called an executable, which can be executed by an end user. Unlike C and C++, the Java programming language is
platform-independent.

**Key Features of the Java Language**
Some of the features that set Java apart from most other languages are that:

- it is platform-independent
- it is object-oriented

**Java Is Platform-Independent**

A Java program can run on several CPUs and operating system combinations, such as the Solaris OS on an SPARC chip,
Mac OS X on an Intel chip, and Microsoft Windows on an Intel chip, usually with few or no modifications.
Java programs are compiled using a Java compiler. The resulting format of a compiled Java program is
platform-independent Java bytecode instead of CPU-specific machine code.

**Java Programs Run In a Java Virtual Machine**

A virtual machine gets its name because it is a piece of software that runs code, a task usually accomplished by the CPU
or hardware machine.
For Java to be platform-independent, a virtual machine called the JVM is required on every platform where your program
will run.
The JVM is responsible for interpreting Java code, loading Java classes, and executing Java programs.

However, a Java program needs more than just a JVM to execute. A Java program also needs a set of standard Java class
libraries for the platform.
Java class libraries are libraries of pre-written code that can be combined with the code that your write to create
robust applications.

Combined, the JVM software and Java class libraries are referred to as the Java Runtime Environment (JRE). Java Runtime
Environment are available from Oracle for many common platforms.

**Procedural Programming Languages**

- Many early programming languages followed a paradigm called **Procedural Programming**.
- These languages use a **sequential pattern** of program execution.
- Drawbacks to procedural programming:
    - Difficult to translate real-world use cases to a sequential pattern
    - Difficult to maintain programs
    - Difficult to enhance as needed

**Java is an Object-Oriented Language**

Object-oriented programming differs from procedural programming, because procedural programming stresses the **sequence
** of coding steps required to solve a problem, whereas
object-oriented programming stresses the **interaction** of objects. Java is an object-oriented programming language.
One of the main goals of an OO language is to create
objects - pieces of autonomous code - that can interact with other objects to solve a problem. OO programming languages
began in 1967 and have led to popular programming languages as
C++, upon which Java is loosely based.

This provides many benefits:

- **Modularity**: The source code for an object can be written and maintained independently of the source code for other
  objects. After it is created, an object can be easily passed around inside the system.
- **Information hiding**: By interacting only with an object's methods, the details of its internal implementation
  remain hidden from the outside world.
- **Code reuse**: If an object already exists (perhaps written by another software developer) you can use that object in
  your program.
- **Maintainability**: If a particular object is found to be problematic, you can create another slightly modified one
  and simply replace the original one in your application.
  This is analogous to fixing mechanical problems in the real world. If a bolt breaks, you replace the bolt, not the
  entire machine.

