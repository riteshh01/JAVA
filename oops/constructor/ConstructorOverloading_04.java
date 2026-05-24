package oops.constructor;

class Student {

    String name;
    int age;

    // 1. Default Constructor
    Student() {
        System.out.println("Default Constructor Called");
    }

    // 2. Constructor with one parameter
    Student(String name) {
        this.name = name;

        System.out.println("Constructor with name called");
    }

    // 3. Constructor with two parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("Constructor with name and age called");
    }

    // Display Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorOverloading_04 {

    public static void main(String[] args) {

        // Calls default constructor
        Student s1 = new Student();

        System.out.println();

        // Calls constructor having one parameter
        Student s2 = new Student("Ritesh");
        s2.display();

        System.out.println();

        // Calls constructor having two parameters
        Student s3 = new Student("Rahul", 21);
        s3.display();
    }
}

/*

Without constructor:
Student s = new Student();

s.name = "Ritesh";
s.age = 21;
Yaha object pehle bana, fir manually values set ki.

With constructor:
Student s = new Student("Ritesh", 21);
Object create hote hi values initialize ho gayi.

⸻

Why constructors are needed?

1. Object Initialization
Object banate time values dene ke liye.

2. Code Reusability
Har baar alag se values set nahi karni padti.

⸻

3. Cleaner & Professional Code
Code readable aur organized lagta hai.

4. Force Important Data
Agar kuch fields mandatory hain, constructor ensure karta hai ki user un values ko de.

5. Automatic Execution
Constructor automatically call hota hai jab object create hota hai.
Student s = new Student();

*/