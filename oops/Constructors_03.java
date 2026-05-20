package oops;

public class Constructors_03 {

    // Properties (Instance Variables)
    String name;
    int age;

    /*
        =========================
           DEFAULT CONSTRUCTOR
        =========================

        A constructor that does NOT take any parameters.

        Java automatically creates a default constructor
        if you do not create any constructor yourself.

        But here we are making our own default constructor
        to understand how it works.
    */

    Constructors_03() {

        // This constructor runs automatically
        // when object is created.

        System.out.println("Default Constructor Called");

        // Setting default values manually
        name = "Unknown";
        age = 0;
    }

    /*
        ==============================
          PARAMETERIZED CONSTRUCTOR
        ==============================

        A constructor that takes parameters.

        It is used when we want to initialize
        object values at the time of object creation.
    */

    Constructors_03(String n, int a) {

        System.out.println("Parameterized Constructor Called");

        /*
            this.name -> object's variable
            n         -> local parameter

            "this" keyword is used to refer
            to current object's variables.
        */

        this.name = n;
        this.age = a;
    }

    // Method to display object data
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    public static void main(String[] args) {

        /*
            ====================================
               OBJECT USING DEFAULT CONSTRUCTOR
            ====================================
        */

        /*
            Constructor automatically call hota hai
            jab object create hota hai.
        */

        Constructors_03 s1 = new Constructors_03();

        s1.display();

        System.out.println();

        /*
            ==========================================
               OBJECT USING PARAMETERIZED CONSTRUCTOR
            ==========================================
        */

        /*
            Yaha values directly pass ki ja rahi hain.
        */

        Constructors_03 s2 = new Constructors_03("Ritesh", 22);

        s2.display();
    }
} 