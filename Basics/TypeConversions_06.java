package Basics;

public class TypeConversions_06 {
    /*
     * TYPE CONVERSION AND CASTING IN JAVA
     * 
     * Java me Type Conversion aur Casting ka matlab hota hai ek data type ki 
     * value ko dusre data type me badalna (convert karna).
     * 
     * Java ek strongly-typed language hai, isliye primitive data types ke 
     * beech me conversion karne ke do main tareeqe hote hain:
     * 
     * 1. Widening Casting (Implicit Conversion)
     * -----------------------------------------
     * - Jab aap ek chote data type ko bade data type me convert karte hain.
     * - Kaise hota hai: Ye Java automatically kar deta hai (Implicit).
     * - Kyun safe hai: Kyunki bade data type me zyada memory hoti hai, 
     *   isliye data loss hone ka koi khatra nahi hota.
     * - Size Order: byte -> short -> char -> int -> long -> float -> double
     */

    public static void main(String[] args) {
        
        System.out.println("--- 1. Widening Casting ---");
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println("Integer Value: " + myInt);    // Output: 9
        System.out.println("Double Value: " + myDouble);  // Output: 9.0
        System.out.println();

        /*
         * 2. Narrowing Casting (Explicit Conversion / Type Casting)
         * ---------------------------------------------------------
         * - Jab aap ek bade data type ko chote data type me convert karte hain.
         * - Kaise hota hai: Ye Java automatically nahi karta. Aapko compiler ko 
         *   explicitly batana padta hai target type ko parentheses () me likh kar.
         * - Kyun dhyan rakhna padta hai: Kyunki bade type ki value agar chote type 
         *   ki capacity se zyada hui, toh Data Loss (ya truncation) ho sakta hai.
         */

        System.out.println("--- 2. Narrowing Casting ---");
        double myDoubleValue = 9.78d;
        int myIntValue = (int) myDoubleValue; // Manual casting: double to int

        System.out.println("Double Value: " + myDoubleValue); // Output: 9.78
        System.out.println("Integer Value: " + myIntValue);    // Output: 9 (Decimal part truncate ho gaya)
        System.out.println();

        /*
         * 3. Data Loss Ka Ek Real Example (Overflow)
         * ------------------------------------------
         * - Narrowing casting me overflow kaise hota hai, isko samajhna zaroori hai.
         * - Maan lo aap ek bade int (32-bit) ko byte (8-bit) me cast kar rahe ho.
         * - byte ki range sirf -128 se 127 tak hoti hai, aur 130 isse bada hai.
         * - Java sirf last ki 8 bits ko rakhta hai aur baaki bits ko discard kar deta hai.
         * - Wo bachi hui 8 bits binary me 2's complement ke mutabiq -126 ban jati hain.
         */

        System.out.println("--- 3. Data Loss / Overflow Example ---");
        int largeInt = 130;
        byte truncatedByte = (byte) largeInt; 
        
        System.out.println("Large Int Value: " + largeInt);       // Output: 130
        System.out.println("Truncated Byte Value: " + truncatedByte); // Output: -126


        /*
     * ⁡⁣⁣⁢AUTOMATIC TYPE PROMOTION IN EXPRESSIONS⁡
     * 
     * Jab Java kisi expression (jaise addition, subtraction, etc.) ko evaluate 
     * karta hai, toh wo expression ke andar use hone wale chote data types 
     * (`byte`, `short`, ya `char`) ko automatically **`int`** ya usse bade 
     * matching type me promote (convert) kar deta hai. 
     * 
     * Ise hi **Automatic Type Promotion** kehte hain.
     * 
     * Type Promotion ke Rules:
     * -------------------------
     * 1. Java automatic sabhi `byte`, `short`, aur `char` values ko `int` me 
     *    promote kar deta hai expression evaluate karte waqt.
     * 2. Agar expression me koi bhi operand `long` hai, toh poora expression 
     *    `long` me promote ho jata hai.
     * 3. Agar koi operand `float` hai, toh poora expression `float` me promote ho jata hai.
     * 4. Agar koi operand `double` hai, toh poora expression `double` me promote ho jata hai.
     */

    System.out.println("--- 1. Basic Byte To Int Promotion ---");
        byte a = 40;
        byte b = 50;
        byte c = 100;
        
        /*
         * Yahan dhyan dein: (a * b) karne par 40 * 50 = 2000 hota hai.
         * 2000 value `byte` ki range (-128 to 127) se bohot bahar hai.
         * 
         * Java back-end me `a` aur `b` ko automatically `int` me promote kar deta hai,
         * isliye (a * b) ka result 2000 safely hold ho jata hai. 
         * 
         * Lekin final result ko hum sirf `int` me hi store kar sakte hain.
         */
        int result = (a * b) / c; // Expression automatically computed in 'int'
        System.out.println("Result of (40 * 50) / 100 = " + result); // Output: 20
        System.out.println();


        System.out.println("--- 2. Common Compile-Time Error Example ---");
        byte b1 = 10;
        
        /*
         * AGAR HUM AISALIKHEIN:
         * byte b2 = b1 * 2; // COMPILE-TIME ERROR!
         * 
         * Kyun error aaya? Kyunki `b1 * 2` ek expression hai, jisme `b1` promote 
         * hokar `int` ban chuka hai. Ek `int` result ko aap bina cast kiye 
         * wapas `byte` me store nahi kar sakte.
         * 
         * Fix karne ke liye hume explicit casting karni padegi:
         */
        byte b2 = (byte) (b1 * 2); 
        System.out.println("Explicitly Casted Byte Value: " + b2); // Output: 20
        System.out.println();


        System.out.println("--- 3. Mixed Type Promotion (The Ultimate Rule) ---");
        /*
         * Jab alag-alag data types ek saath ek expression me aate hain, 
         * toh sabse bada data type dominate karta hai.
         */
        char charVal = 'a';     // Unicode value 97 (promotes to int)
        int intVal = 50_000;
        float floatVal = 5.67f;
        double doubleVal = 0.1234;
        
        /*
         * Expression Breakdown:
         * - (floatVal * charVal) -> `float` * `int` (97) -> result1 is `float`
         * - (intVal / b1)       -> `int` / `int` (promoted byte) -> result2 is `int`
         * - (doubleVal * floatVal) -> `double` * `float` -> result3 is `double`
         * 
         * Final Expression: `float` + `int` - `double` 
         * Sabse bada type `double` hai, isliye poora result `double` banega.
         */
        double finalOutput = (floatVal * charVal) + (intVal / b1) - (doubleVal * floatVal);
        
        System.out.println("Final Mixed Expression Output: " + finalOutput); 
        // Output: (5.67 * 97) + (50000 / 10) - (0.1234 * 5.67) = 5549.29...
    }
}