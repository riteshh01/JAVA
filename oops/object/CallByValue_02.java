package oops.object;

public class CallByValue_02 {

    /*
    
    ==========================================
    CALL BY VALUE vs CALL BY REFERENCE
    ==========================================

    FIRST IMPORTANT THING:

    JAVA IS ONLY CALL BY VALUE.
    
    There is NO real call by reference in Java.

    This confuses many people because objects behave
    differently from primitive types.

    --------------------------------------------------
    WHAT IS CALL BY VALUE?
    --------------------------------------------------

    In call by value:
        A COPY of variable is passed to method.

    Original variable is NOT directly passed.

    Example:

        int x = 10;

        change(x);

    Here:
        copy of x is passed.

    --------------------------------------------------
    PRIMITIVE EXAMPLE
    --------------------------------------------------

    */

    static void changePrimitive(int x) {

        x = 100;

        System.out.println("Inside method: " + x);
    }

    /*
    
    // MAIN MEMORY FLOW:

        int a = 10;

        changePrimitive(a);

    STEP 1:
        a = 10

    STEP 2:
        copy of a is passed

            x = 10

    STEP 3:
        x changes to 100

    BUT:
        original a still remains 10

    because only COPY was modified.

    --------------------------------------------------
    OUTPUT:

        Inside method: 100
        Outside method: 10

    --------------------------------------------------
    NOW THE CONFUSING PART:
    OBJECTS
    --------------------------------------------------

    */

    static class Student {

        String name;

        Student(String name) {
            this.name = name;
        }
    }

    static void changeObject(Student s) {

        s.name = "Rohit";

        System.out.println("Inside method: " + s.name);
    }

    /*
    
    PEOPLE THINK:
        "Java passed object by reference"

    BUT THAT IS WRONG.

    WHAT ACTUALLY HAPPENS?

    --------------------------------------------------
    VERY IMPORTANT:
    OBJECT VARIABLES STORE REFERENCES
    --------------------------------------------------

    Student s1 = new Student("Ritesh");

    s1 does NOT store actual object.

    s1 stores:
        ADDRESS / REFERENCE of object

    Example:

        s1 -> 0xABCD

    --------------------------------------------------
    WHEN METHOD IS CALLED:

        changeObject(s1);

    JVM DOES:

        copy of reference is passed

    So:

        s1 -----> Student Object

        copied reference s -----> SAME Student Object

    BOTH references point to SAME object.

    --------------------------------------------------
    MEMORY DIAGRAM
    --------------------------------------------------

    STACK:

        s1 = 0x100

        s  = 0x100   (copied reference)

    HEAP:

        Object:
            name = "Ritesh"

    --------------------------------------------------
    NOW:

        s.name = "Rohit";

    modifies SAME heap object.

    Therefore original object changes.

    --------------------------------------------------
    THIS IS WHY JAVA LOOKS LIKE
    CALL BY REFERENCE
    --------------------------------------------------

    But actually:

        COPY OF REFERENCE
    was passed.

    NOT actual reference variable itself.

    --------------------------------------------------
    PROOF THAT JAVA IS NOT CALL BY REFERENCE
    --------------------------------------------------

    */

    static void reassignObject(Student s) {

        s = new Student("Aman");

        System.out.println("Inside method: " + s.name);
    }

    /*
    
    MAIN:

        Student s1 = new Student("Ritesh");

        reassignObject(s1);

    WHAT HAPPENS?

    STEP 1:
        s1 stores:
            0x100

    STEP 2:
        copy passed:
            s = 0x100

    STEP 3:
        inside method:

            s = new Student("Aman");

    NOW:
        s points to NEW object:
            0x200

    BUT:
        s1 still points to:
            0x100

    Therefore original reference DOES NOT change.

    --------------------------------------------------
    OUTPUT:

        Inside method: Aman
        Outside method: Ritesh

    --------------------------------------------------
    IF JAVA WERE TRUE CALL BY REFERENCE:
    --------------------------------------------------

    then changing s would also change s1.

    But it does NOT.

    Hence:
        Java is NOT call by reference.

    --------------------------------------------------
    SO FINAL CONCLUSION
    --------------------------------------------------

    JAVA HAS:

        1. Call by value for primitives
        2. Call by value for object references

    Java NEVER passes actual references directly.

    It passes:
        COPY OF REFERENCE

    --------------------------------------------------
    SIMPLE LINE TO REMEMBER
    --------------------------------------------------

    Java is:
        "Pass by value"

    For objects:
        "Value = reference address"

    --------------------------------------------------
    QUICK COMPARISON
    --------------------------------------------------

    Primitive:

        int a = 10;

        copy of 10 passed

    Object:

        Student s = obj;

        copy of object's address passed

    --------------------------------------------------
    WHY JAVA CHOSE THIS DESIGN?
    --------------------------------------------------

    Because:
        - safer
        - simpler memory model
        - easier garbage collection
        - avoids dangerous pointer manipulation like C++

    --------------------------------------------------
    C++ DIFFERENCE
    --------------------------------------------------

    C++ supports true references:

        void fun(int &x)

    Java has NO equivalent feature.

    --------------------------------------------------

    */

    public static void main(String[] args) {

        // =========================
        // PRIMITIVE EXAMPLE
        // =========================

        int a = 10;

        changePrimitive(a);

        System.out.println("Outside method: " + a);

        System.out.println();

        // =========================
        // OBJECT EXAMPLE
        // =========================

        Student s1 = new Student("Ritesh");

        changeObject(s1);

        System.out.println("Outside method: " + s1.name);

        System.out.println();

        // =========================
        // REASSIGNMENT EXAMPLE
        // =========================

        Student s2 = new Student("Ritesh");

        reassignObject(s2);

        System.out.println("Outside method: " + s2.name);
    }
}