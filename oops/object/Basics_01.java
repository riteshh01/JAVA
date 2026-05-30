package oops.object;

public class Basics_01 {

    /*
    
    ============================
    WHAT IS AN OBJECT IN JAVA?
    ============================

    Object = Runtime instance of a class.

    Example:
        Car c = new Car();

    Here:
        - Car = class blueprint
        - c   = reference variable
        - new Car() = actual object created in Heap Memory

    ---------------------------------------------------

    Every object in Java contains mainly 2 things:

    1. Object Header
    2. Instance Variables (fields/data)

    ---------------------------------------------------

    INTERNAL MEMORY LAYOUT (SIMPLIFIED)

    Suppose:

        class Student {
            int age;
            double marks;
        }

    Object memory may look like:

        -------------------------
        | Object Header        |
        -------------------------
        | int age      (4B)    |
        -------------------------
        | double marks (8B)    |
        -------------------------
        | Padding              |
        -------------------------

    ---------------------------------------------------

    WHY DOES JAVA STORE OBJECTS IN MULTIPLE OF 8?

    Modern CPUs work faster when memory is aligned properly.

    JVM aligns object size to 8-byte boundaries for:
        - Faster memory access
        - Better CPU optimization
        - Efficient garbage collection

    This is called:
        OBJECT ALIGNMENT

    So even if object size becomes:
        10 bytes
    JVM may make it:
        16 bytes

    because nearest multiple of 8 after 10 is 16.

    ---------------------------------------------------

    OBJECT HEADER DETAILS

    Normally object header contains:

    1. Mark Word
       - hashcode
       - lock info
       - GC info

    2. Class Metadata Pointer
       - points to class definition

    In 64-bit JVM:

        Mark Word            -> 8 bytes
        Class Pointer        -> 4 bytes
        Padding              -> 4 bytes

    Total Header ≈ 16 bytes

    (Can vary JVM to JVM)

    ---------------------------------------------------

    EXAMPLE 1

    class Test {
        int x;
    }

    int x = 4 bytes

    But object size is NOT 4 bytes.

    Why?

    Because header also exists.

    Approx:

        Header = 12 or 16 bytes
        int    = 4 bytes

    Total = 16 or 20 bytes

    JVM aligns to nearest multiple of 8:

        Final size = 16 or 24 bytes

    ---------------------------------------------------

    EXAMPLE 2

    class Demo {
        int a;      // 4 bytes
        int b;      // 4 bytes
    }

    Data = 8 bytes

    Suppose header = 16 bytes

    Total = 24 bytes

    Already multiple of 8.
    So JVM keeps 24 bytes.

    ---------------------------------------------------

    EXAMPLE 3

    class Example {
        byte b;     // 1 byte
    }

    Header = 16 bytes
    byte   = 1 byte

    Total = 17 bytes

    JVM adds padding.

    Final:
        24 bytes

    because:
        nearest multiple of 8 after 17 = 24

    ---------------------------------------------------

    IMPORTANT CONCEPT:
    REFERENCE VARIABLE SIZE

    Student s = new Student();

    Here:
        s is NOT actual object.

    s stores ADDRESS of object.

    On 64-bit JVM:
        reference size usually:
            4 bytes (compressed oops)
        or
            8 bytes

    "oops" here means:
        Ordinary Object Pointers

    ---------------------------------------------------

    STACK VS HEAP

    Student s = new Student();

    STACK MEMORY:
        s (reference variable)

    HEAP MEMORY:
        actual Student object

    ---------------------------------------------------

    WHY OBJECT SIZE CONFUSES PEOPLE?

    Because:

        Primitive size != Actual object size

    Example:

        int = 4 bytes

    But:
        class A {
            int x;
        }

    object of A is MUCH larger due to:
        - header
        - alignment
        - padding

    ---------------------------------------------------

    REAL JVM TOOL

    To see actual object size, Java engineers use:

        JOL (Java Object Layout)

    Maven dependency:
        org.openjdk.jol

    Example:

        System.out.println(
            ClassLayout.parseInstance(obj).toPrintable()
        );

    This prints exact JVM memory layout.

    ---------------------------------------------------

    SIMPLE SUMMARY

    Every object contains:
        1. Header
        2. Fields
        3. Padding

    JVM aligns objects to:
        MULTIPLE OF 8 bytes

    for:
        - performance
        - CPU efficiency
        - memory optimization

    */

}