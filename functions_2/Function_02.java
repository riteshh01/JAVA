package functions_2;

public class Function_02 {

    // TYPE 1: No Parameter and No Return Type
    // Na ye kuch input leta hai, na kuch return karta hai. Bas call hote hi apna kaam karta hai.
    public void printGreeting() {
        System.out.println("Hello! Welcome to Java Programming.");
    }

    // TYPE 2: With Parameter but No Return Type
    // Ye input toh leta hai, lekin output waapas nahi bheja (void hai). Bas andar hi use kar leta hai.
    public void printSquare(int number) {
        int result = number * number;
        System.out.println("Square of " + number + " is: " + result);
    }

    // TYPE 3: No Parameter but With Return Type
    // Ye input kuch nahi leta, lekin call karne wale ko ek value return karta hai.
    public double getPiValue() {
        return 3.14159; // returns a double value
    }

    // TYPE 4: With Parameter and With Return Type
    // Ye input bhi leta hai aur process karne ke baad result waapas (return) bhi karta hai.
    public int addNumbers(int a, int b) {
        return a + b; 
    }

    public static void main(String[] args) {
        // Object banana padega non-static functions ko call karne ke liye
        Function_02 demo = new Function_02();

        // Calling Type 1
        demo.printGreeting();

        // Calling Type 2 (Passing 5 as an argument)
        demo.printSquare(5);

        // Calling Type 3 (Storing the returned value)
        double pi = demo.getPiValue();
        System.out.println("Pi value received: " + pi);

        // Calling Type 4
        int sum = demo.addNumbers(10, 20);
        System.out.println("Sum received: " + sum);
    }
}
