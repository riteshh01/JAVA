package functions_2;

// Student class
class Student {

    // Instance variables
    String name;
    int age;

    // Method to set name
    Student setName(String name) {

        // 'this.name' => instance variable
        // 'name' => parameter variable
        // current object ke name me parameter value store ho rahi hai
        this.name = name;

        // current object return kar rahe hain
        // taaki next method chaining ho sake
        return this;
    }

    // Method to set age
    Student setAge(int age) {

        // current object ke age variable me value assign
        this.age = age;

        // again same object return
        // so next method call possible hoga
        return this;
    }

    // Display method
    void display() {

        // object ki final values print hongi
        System.out.println(name + " " + age);
    }
}

public class MethodChaining_04 {

    public static void main(String[] args) {

        // Student object create hua
        Student s = new Student();

        /*
        
            YE METHOD CHAINING HAI

            Step by step internally ye aise work karta hai:

            Step 1:
            s.setName("Ritesh")

            -> name set hoga
            -> ye current object return karega

            Step 2:
            returned object pe .setAge(22) chalega

            -> age set hoga
            -> fir se same object return hoga

            Step 3:
            returned object pe .display() chalega

        */

        s.setName("Ritesh")
         .setAge(22)
         .display();


        /*
        
        Internally compiler ise almost aise samajh sakta hai:

        Student temp1 = s.setName("Ritesh");

        Student temp2 = temp1.setAge(22);

        temp2.display();

        */


        /*
        
        IMPORTANT POINT:

        Agar setName() aur setAge() methods
        'return this' na karte,
        to chaining possible nahi hoti.

        Example:

        void setName(String name)

        Fir ye error deta:

        s.setName("Ritesh").setAge(22);

        Kyuki void kuch return nahi karta.

        */
    }
}