package oops;

class Student {

    String name;
    int age;

    // 1. Default constructor
    Student() {

        // Calls second constructor
        this("Unknown");

        System.out.println("Default Constructor");
    }

    // 2. Constructor with one parameter
    Student(String name) {

        // Calls third constructor
        this(name, 0);

        System.out.println("Constructor with name");
    }

    // 3. Constructor with two parameters
    Student(String name, int age) {

        this.name = name;
        this.age = age;

        System.out.println("Constructor with name and age");
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class ConstructorChaining_05 {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println();

        s1.display();
    }
}

/*

1. this.variable
⁡⁢⁣⁣Current object ke variable ko refer karta hai.⁡
this.name = name;

2. this()
Ye same class ke constructor ko call karta hai.
this("Unknown");
⁡⁣⁣⁢Current class ka wo constructor call karo jisme String parameter ho.⁡

*/