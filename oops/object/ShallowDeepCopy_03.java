package oops.object;

class Address {

    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student {

    String name;
    Address address;

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Deep Copy Constructor
    Student(Student other) {

        // primitive/string copy
        this.name = other.name;

        // NEW object create kiya
        this.address = new Address(other.address.city);
    }
}

public class ShallowDeepCopy_03 {

    public static void main(String[] args) {

        // ==============================
        // ORIGINAL OBJECT
        // ==============================

        Address a1 = new Address("Lucknow");

        Student s1 = new Student("Ritesh", a1);




        // ==============================
        // SHALLOW COPY
        // ==============================

        Student s2 = s1;

        System.out.println("Before Changing:");
        System.out.println("s1 city : " + s1.address.city);
        System.out.println("s2 city : " + s2.address.city);

        // changing through s2
        s2.address.city = "Delhi";

        System.out.println("\nAfter Changing:");
        System.out.println("s1 city : " + s1.address.city);
        System.out.println("s2 city : " + s2.address.city);




        // ==============================
        // DEEP COPY
        // ==============================

        Student s3 = new Student(s1);

        System.out.println("\nBefore Deep Copy Change:");
        System.out.println("s1 city : " + s1.address.city);
        System.out.println("s3 city : " + s3.address.city);

        // changing s3 object
        s3.address.city = "Mumbai";

        System.out.println("\nAfter Deep Copy Change:");
        System.out.println("s1 city : " + s1.address.city);
        System.out.println("s3 city : " + s3.address.city);
    }
}


// +----------------------+--------------------------+--------------------------+
// | Feature              | Shallow Copy             | Deep Copy                |
// +----------------------+--------------------------+--------------------------+
// | New Object           | No                       | Yes                      |
// | Reference Shared     | Yes                      | No                       |
// | Nested Objects       | Same                     | Separate                 |
// | Changes Reflect      | Yes                      | No                       |
// | Memory Usage         | Less                     | More                     |
// | Performance          | Faster                   | Slower                   |
// | Safety               | Less                     | More                     |
// +----------------------+--------------------------+--------------------------+