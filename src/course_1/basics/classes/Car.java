package course_1.basics.classes;

public class Car {
    // Variables inside a class:
    // A class has a "has-a" relationship with a field
    // Different type of fields
    // Class can be field of another class

    String color; // a car has a color
    int doors; // a car has a number of doors
    double weight; // a car has a weight
    Engine engine; // a car has an engine  (a car is not an engine) this is Composition in practice - not Inheritance
}
