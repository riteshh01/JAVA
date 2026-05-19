package functions_2;

public class Function_01 {

    // 1. No Input, No Output
    static void greet() {
        System.out.println("Hello, Welcome to Java Functions!");
    }

    // 2. Input, No Output
    static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    // 3. No Input, With Output
    static int getNumber() {
        return 100;
    }

    // 4. Input, With Output
    static int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {

        // 1. Calling No Input, No Output function
        greet();

        // 2. Calling Input, No Output function
        addNumbers(10, 20);

        // 3. Calling No Input, With Output function
        System.out.println("Returned Number = " + getNumber());

        // 4. Calling Input, With Output function
        int result = multiply(5, 4);
        System.out.println("Multiplication = " + result);
    }
}