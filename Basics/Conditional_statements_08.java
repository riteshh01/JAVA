package Basics;

public class Conditional_statements_08 {
    public static void main(String[] args) {
        
        // ==========================================
        // 1. IF STATEMENT (Simple Check)
        // ==========================================
        // Isme code tabhi chalta hai jab condition true ho.
        int speed = 90;
        if (speed > 80) {
            // Agar speed 80 se upar hai, toh ye block chalega
            System.out.println("1. IF: Overspeeding Alert! Please slow down.");
        }


        // ==========================================
        // 2. IF-ELSE STATEMENT (Two Choices)
        // ==========================================
        // Agar condition true hai toh 'if' block, nahi toh 'else' block chalega.
        int age = 16;
        if (age >= 18) {
            System.out.println("2. IF-ELSE: You are eligible to vote.");
        } else {
            // Kyunki age 16 hai (condition false), toh ye execute hoga
            System.out.println("2. IF-ELSE: Not eligible to vote. Wait for " + (18 - age) + " more years.");
        }


        // ==========================================
        // 3. IF-ELSE-IF LADDER (Multiple Exclusive Conditions)
        // ==========================================
        // Jab bohot saari conditions me se koi EK select karni ho.
        // Jo condition pehle true hogi, sirf uska block chalega. Baki skip ho jayenge.
        int marks = 75;
        System.out.print("3. IF-ELSE-IF: ");
        
        if (marks >= 90) {
            System.out.println("Grade A+");
        } else if (marks >= 80) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            // Ye condition true hai (75 >= 70), toh ye execute hoga
            System.out.println("Grade B"); 
        } else {
            // Agar upar ki koi condition true nahi hoti, toh else chalta
            System.out.println("Grade C");
        }


        // ==========================================
        // 4. TERNARY OPERATOR (Short-hand IF-ELSE)
        // ==========================================
        // Ye Single Line me condition check karke value assign karne ke kaam aata hai.
        // Syntax: (Condition) ? (Value if True) : (Value if False);
        int number = 15;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("4. TERNARY: The number " + number + " is " + result + ".");


        // ==========================================
        // 5. SWITCH STATEMENT (Menu/Value Based Selection)
        // ==========================================
        // Jab kisi single variable ki exact value par decision lena ho.
        // Ye performance wise if-else ladder se behtar hota hai large choices ke liye.
        int dayNumber = 3;
        System.out.print("5. SWITCH CASE: ");
        
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                // dayNumber ki value 3 hai, toh direct control yahan aayega
                System.out.println("Wednesday"); 
                break; // break se compiler switch block se bahar nikal jata hai
            case 4:
                System.out.println("Thursday");
                break;
            default:
                // Agar koi bhi case match nahi hua, toh default chalta hai
                System.out.println("Invalid Day Number!");
                break;
        }
        
    }
}
