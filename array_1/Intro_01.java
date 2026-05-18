package array_1;

import java.util.Scanner;

public class Intro_01 {
    public static void main(String[] args) {

        // ==========================================
        // 1. STATIC INITIALIZATION (Literal Method)
        // ==========================================
        // Kab use karein: Jab aapko compile-time par hi pata ho ki array me kya data jayega.
        // Isme size explicitly batane ki zaroorat nahi hoti, compiler elements count karke khud size assign kar deta hai.
        
        System.out.println("--- 1. STATIC ARRAY INITIALIZATION ---");

        // Syntax: DataType[] arrayName = {val1, val2, val3, ...};
        int[] staticArray = {10, 20, 30, 40, 50}; 
        
        // Memory me yeh ek 5-size ka array create karega. Indices: 0 to 4.
        System.out.println("Static Array ki length: " + staticArray.length);
        
        // Accessing elements using indexes
        System.out.println("Element at index 0: " + staticArray[0]); // Output: 10
        System.out.println("Element at index 4: " + staticArray[4]); // Output: 50

        // Modifying an element
        staticArray[2] = 99; // 30 ki jagah 99 ho jayega
        System.out.println("Modified element at index 2: " + staticArray[2]);


        // ==========================================
        // 2. DYNAMIC INITIALIZATION (Using 'new' keyword)
        // ==========================================
        // Kab use karein: Jab aapko size pata ho (ya size run-time par user se lena ho),
        // par elements bad me program execution ke dauran calculate ya insert karne hon.
        
        System.out.println("\n--- 2. DYNAMIC ARRAY INITIALIZATION ---");

        // Syntax: DataType[] arrayName = new DataType[size];
        int size = 4;
        int[] dynamicArray = new int[size]; // Memory allocate ho gayi par elements abhi empty hain.

        // NOTE: Java me jab hum 'new' se array banate hain, toh saare elements 
        // automatic unki DEFAULT VALUES se initialize ho jaate hain (int ke liye 0, boolean ke liye false, objects ke liye null).
        System.out.println("Default value check (before inserting data): " + dynamicArray[0]); // Output: 0

        // Elements manually insert karna
        dynamicArray[0] = 100;
        dynamicArray[1] = 200;
        dynamicArray[2] = 300;
        dynamicArray[3] = 400;

        // Traversing dynamic array using a standard for loop
        System.out.print("Dynamic Array Elements: ");
        for (int i = 0; i < dynamicArray.length; i++) {
            System.out.print(dynamicArray[i] + " ");
        }
        System.out.println();


        // ==========================================
        // 3. RUN-TIME USER INPUT DYNAMIC ARRAY
        // ==========================================
        // Jab array ka size aur data dono run-time par user decide karta hai.
        
        System.out.println("\n--- 3. USER INPUT DYNAMIC ARRAY ---");
        Scanner sc = new Scanner(System.in);

        // Mocking user input for demonstration
        System.out.println("Enter the size of the array: (Assume user enters 3)");
        int uSize = 3; 
        
        // Runtime par size define hua
        String[] usernames = new String[uSize]; 

        // Hardcoding the loop input values for presentation instead of blocking execution
        usernames[0] = "Ritesh";
        usernames[1] = "Amit";
        usernames[2] = "Vikram";
        
        System.out.println("Data successfully inserted at runtime.");

        // Printing using Enhanced For Loop (For-Each)
        System.out.print("Usernames Array: ");
        for (String user : usernames) {
            System.out.print("[" + user + "] ");
        }
        System.out.println("\n");


        // ==========================================
        // 4. CRITICAL ARRAY EXCEPTIONS (Common Mistakes)
        // ==========================================
        System.out.println("--- 4. COMMON ARRAY PITFALLS ---");
        
        try {
            // Humare staticArray ki length 5 hai (indices 0 se 4). 
            // Agar hum index 5 access karne ki koshish karenge:
            System.out.println(staticArray[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.toString());
            System.out.println("Explanation: Aap array ki boundary (0 to length-1) ke bahar access nahi kar sakte.");
        }
        
        sc.close();
    }
}