package functions_2;

public class MethodOverloading_03 {

    /*
        METHOD OVERLOADING
        ------------------
        Java me ek hi class ke andar same method name ko multiple times
        use kar sakte hain, bas parameters different hone chahiye.

        Difference ho sakta hai:
        1. Number of parameters
        2. Type of parameters
        3. Order of parameters

        Java method ko identify karta hai:
        -> Method Name + Parameter List ke basis par

        Isko hi "Method Signature" bolte hain.

        NOTE:
        Return type ko Java method overloading ke liye consider nahi karta.
    */


    // ---------------------------------------------------
    // Same method name -> printInfo
    // But parameter list different hai
    // ---------------------------------------------------


    // Method 1
    static void printInfo() {

        /*
            No parameter method

            Jab hum:
            printInfo();

            call karenge to Java is method ko choose karega
            kyunki isme koi parameter nahi hai.
        */

        System.out.println("Hello from method with no parameters");
    }


    // Method 2
    static void printInfo(String name) {

        /*
            Is method me 1 String parameter hai

            Jab hum:
            printInfo("Ritesh");

            call karenge to Java check karega:
            -> Method name same hai
            -> Kaunsa method String accept kar raha hai

            Fir ye method execute hoga.
        */

        System.out.println("Name = " + name);
    }


    // Method 3
    static void printInfo(int age) {

        /*
            Is method me int parameter hai

            Jab hum:
            printInfo(21);

            call karenge to Java int wala method choose karega.
        */

        System.out.println("Age = " + age);
    }


    // Method 4
    static void printInfo(String name, int age) {

        /*
            Is method me:
            -> pehla parameter String
            -> doosra parameter int

            Jab hum:
            printInfo("Ritesh", 21);

            call karenge to Java exact matching parameter list dhundega.
        */

        System.out.println("Name = " + name + " | Age = " + age);
    }


    // ---------------------------------------------------
    // MAIN METHOD
    // ---------------------------------------------------

    public static void main(String[] args) {

        /*
            Java method call ke time arguments ko dekhta hai
            aur matching method find karta hai.
        */


        // No argument
        printInfo();

        // String argument
        printInfo("Ritesh");

        // int argument
        printInfo(21);

        // String + int
        printInfo("Ritesh", 21);
    }
}