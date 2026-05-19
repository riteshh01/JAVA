package oops;

// Student class
class Student {

    // Class → A blueprint/template used to create objects.
    // Object → A real instance of a class that contains data and behaviour.

    // =========================
    // Properties (Data / State)
    // =========================
    String name;
    int age;
    String course;

    // =========================
    // Behaviours (Methods / Actions)
    // =========================

    // Method to study
    void study() {
        System.out.println(name + " is studying " + course);
    }

    // Method to introduce
    void introduce() {
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("My course is " + course);
    }
}

public class Basics_02 {

    public static void main(String[] args) {

        // Creating Student object
        Student s1 = new Student();

        // Assigning values to properties
        s1.name = "Ritesh";
        s1.age = 22;
        s1.course = "MCA";

        // Calling behaviours
        s1.introduce();
        s1.study();
    }
}