package Basics;

/*

+----------------------+-------------------------+-------------------------+
| Operator Type        | Operators               | Example                 |
+----------------------+-------------------------+-------------------------+
| Arithmetic           | +  -  *  /  %           | a + b                   |
+----------------------+-------------------------+-------------------------+
| Relational           | ==  !=  >  <  >=  <=    | a > b                   |
+----------------------+-------------------------+-------------------------+
| Logical              | &&  ||  !               | a > b && b < c          |
+----------------------+-------------------------+-------------------------+
| Assignment           | =  +=  -=  *=  /=  %=   | a += 5                  |
+----------------------+-------------------------+-------------------------+
| Increment/Decrement  | ++  --                  | a++                     |
+----------------------+-------------------------+-------------------------+
| Bitwise              | &  |  ^  ~              | a & b                   |
+----------------------+-------------------------+-------------------------+
| Shift                | <<  >>  >>>             | a << 2                  |
+----------------------+-------------------------+-------------------------+
| Conditional (Ternary)| ? :                     | (a > b) ? a : b         |
+----------------------+-------------------------+-------------------------+
| instanceof           | instanceof              | obj instanceof String   |
+----------------------+-------------------------+-------------------------+


+------------+--------------------------------------+---------------------------+
| Precedence | Operators                            | Associativity             |
+------------+--------------------------------------+---------------------------+
| Highest    | ()  []  .                            | Left to Right             |
+------------+--------------------------------------+---------------------------+
| 2          | ++  --  !  ~  +  -                   | Right to Left             |
|            | (Unary operators)                    |                           |
+------------+--------------------------------------+---------------------------+
| 3          | *  /  %                              | Left to Right             |
+------------+--------------------------------------+---------------------------+
| 4          | +  -                                 | Left to Right             |
+------------+--------------------------------------+---------------------------+
| 5          | <<  >>  >>>                          | Left to Right             |
+------------+--------------------------------------+---------------------------+
| 6          | <  <=  >  >=  instanceof             | Left to Right             |
+------------+--------------------------------------+---------------------------+
| 7          | ==  !=                               | Left to Right             |
+------------+--------------------------------------+---------------------------+
| 8          | &                                    | Left to Right             |
+------------+--------------------------------------+---------------------------+
| 9          | ^                                    | Left to Right             |
+------------+--------------------------------------+---------------------------+
| 10         | |                                    | Left to Right             |
+------------+--------------------------------------+---------------------------+
| 11         | &&                                   | Left to Right             |
+------------+--------------------------------------+---------------------------+
| 12         | ||                                   | Left to Right             |
+------------+--------------------------------------+---------------------------+
| 13         | ? :                                  | Right to Left             |
+------------+--------------------------------------+---------------------------+
| Lowest     | =  +=  -=  *=  /=  %=                | Right to Left             |
|            | &=  ^=  |=  <<=  >>=  >>>=           |                           |
+------------+--------------------------------------+---------------------------+

*/

public class Operators_07 {
    public static void main(String[] args) {
        
        // ==========================================
        // 1. ASSIGNMENT OPERATORS
        // ==========================================
        // Assignment operator (`=`) right side ki value ko left side ke variable me store karta hai.
        int a = 10; // 10 assign kiya variable a ko
        int b = 3;  // 3 assign kiya variable b ko
        
        // Compound Assignment Operators: Ye short-hand hote hain
        a += 5; // Iska matlab hai: a = a + 5 -> (10 + 5 = 15)
        System.out.println("Compound Assignment (a += 5): " + a); // Output: 15
        
        // Re-assigning original values for next topics
        a = 10; 

        // ==========================================
        // 2. ARITHMETIC OPERATORS
        // ==========================================
        // Basic mathematical operations ke liye use hote hain.
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("Addition (a + b): " + (a + b));       // 10 + 3 = 13
        System.out.println("Subtraction (a - b): " + (a - b));    // 10 - 3 = 7
        System.out.println("Multiplication (a * b): " + (a * b)); // 10 * 3 = 30
        System.out.println("Division (a / b): " + (a / b));       // 10 / 3 = 3 (int division decimals drop kar deta hai)
        System.out.println("Modulus (a % b): " + (a % b));        // 10 ko 3 se divide karne par remainder = 1

        // ==========================================
        // 3. UNARY OPERATORS (Focused)
        // ==========================================
        // Unary operators ko kaam karne ke liye sirf EK operand ki zaroorat hoti hai.
        // Increment (++) aur Decrement (--) ke do roop hote hain: Pre aur Post.
        System.out.println("\n--- Unary Operators ---");
        
        int x = 5;
        
        // POST-INCREMENT (x++)
        // Rule: First Use, Then Change. (Pehle current value use hogi, fir memory me 1 badhegi)
        System.out.println("Post-Increment (x++): " + (x++)); // Output: 5 (Print pehle hua, fir x badhkar 6 ho gaya)
        System.out.println("Value after Post-Increment: " + x); // Output: 6
        
        // PRE-INCREMENT (++x)
        // Rule: First Change, Then Use. (Pehle memory me 1 badhegi, fir nayi value use hogi)
        System.out.println("Pre-Increment (++x): " + (++x)); // Output: 7 (6 se badhkar pehle 7 hua, fir print hua)

        // Logical NOT (!)
        // Ye boolean value to invert (ulta) kar deta hai.
        boolean isJavaFun = true;
        System.out.println("Logical NOT (!isJavaFun): " + (!isJavaFun)); // Output: false

        // ==========================================
        // 4. LOGICAL OPERATORS
        // ==========================================
        // Do ya do se zyada boolean expressions ko combine karne ke liye.
        System.out.println("\n--- Logical Operators ---");
        boolean condition1 = (a > 5);  // 10 > 5 -> true
        boolean condition2 = (b < 2);  // 3 < 2  -> false
        
        // Short-Circuit AND (&&): Agar pehli condition false ho, toh ye dusri check hi nahi karta. Both must be true.
        System.out.println("Logical AND (&&): " + (condition1 && condition2)); // true && false -> false
        
        // Short-Circuit OR (||): Agar pehli condition true ho, toh ye dusri check hi nahi karta. At least one must be true.
        System.out.println("Logical OR (||): " + (condition1 || condition2));  // true || false -> true

        // ==========================================
        // 5. BITWISE OPERATORS (Deep Dive)
        // ==========================================
        // Bitwise operators integer values ke individual BITS (0 aur 1) par kaam karte hain.
        // Samajhne ke liye hum n = 5 aur m = 6 lete hain.
        // Binary representation:
        // 5 = 0101 (in 4 bits)
        // 6 = 0110 (in 4 bits)
        System.out.println("\n--- Bitwise Operators (Detailed) ---");
        int n = 5; 
        int m = 6; 

        /* 
         * A) Bitwise AND (&)
         * Rule: Agar DONO bits 1 hain, toh result 1 hoga, nahi toh 0.
         *   0101  (5)
         * & 0110  (6)
         *  ------
         *   0100  -> Ye binary me 4 hota hai.
         */
        System.out.println("Bitwise AND (5 & 6): " + (n & m)); // Output: 4

        /* 
         * B) Bitwise OR (|)
         * Rule: Agar KOI EK bhi bit 1 hai, toh result 1 hoga.
         *   0101  (5)
         * | 0110  (6)
         *  ------
         *   0111  -> Ye binary me 7 hota hai.
         */
        System.out.println("Bitwise OR (5 | 6): " + (n | m)); // Output: 7

        /* 
         * C) Bitwise XOR (^)
         * Rule: Agar dono bits ALAG (different) hain toh 1, agar SAME hain toh 0.
         *   0101  (5)
         * ^ 0110  (6)
         *  ------
         *   0011  -> Ye binary me 3 hota hai.
         */
        System.out.println("Bitwise XOR (5 ^ 6): " + (n ^ m)); // Output: 3

        /* 
         * D) Bitwise Complement / NOT (~)
         * Rule: Ye saare bits ko flip (invert) kar deta hai (0 ko 1, 1 ko 0).
         * Java me numbers Two's Complement form me store hote hain, isliye formula hota hai: ~x = -(x + 1)
         * ~5 -> -(5 + 1) = -6
         */
        System.out.println("Bitwise Complement (~5): " + (~n)); // Output: -6

        /* 
         * E) Bitwise Left Shift (<<)
         * Rule: Bits ko left side shift karta hai aur right me 0 append karta hai.
         * Har ek shift se number 2 se multiply ho jata hai [ formula: x * (2^y) ]
         * 5 << 1  -> 5 * (2^1) = 10
         * Binary visualization: 0101 shifted left by 1 becomes 1010 (which is 10)
         */
        System.out.println("Left Shift (5 << 1): " + (n << 1)); // Output: 10

        /* 
         * F) Bitwise Right Shift (>>)
         * Rule: Bits ko right side shift karta hai aur sign bit (positive/negative) ko maintain rakhta hai.
         * Har ek shift se number 2 se divide ho jata hai [ formula: x / (2^y) ]
         * 6 >> 1  -> 6 / (2^1) = 3
         * Binary visualization: 0110 shifted right by 1 becomes 0011 (which is 3)
         */
        System.out.println("Right Shift (6 >> 1): " + (m >> 1)); // Output: 3


        // (Unsigned Right Shift): Ye sign bit ki parwah nahi karta. Chahe number positive ho ya negative, right shift karne ke baad left side me jo khali jagah bachti hai, wahan hamesha 0 hi bhara jata hai. Isliye isko "unsigned" kehte hain kyunki ye pure number ko hamesha ek positive number me convert kar deta hai (kyunki left-most bit yaani sign bit 0 ban jata hai).
    }
}
