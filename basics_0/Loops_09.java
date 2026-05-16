package basics_0;

public class Loops_09 {
    public static void main(String[] args) {

        // ==========================================
        // 1. ⁡⁣⁣⁢FOR LOOP⁡ (Fixed Iterations)
        // ==========================================
        // Use case: Jab pehle se pata ho ki loop kitni baar chalega.
        // Structure: (initialization; condition; increment/decrement)
        System.out.println("--- 1. FOR LOOP ---");
        
        for (int i = 1; i <= 5; i++) {
            // Step 1: i=1 se shuru hua
            // Step 2: Check kiya kya 1 <= 5 hai? (True)
            // Step 3: Body execute hui
            // Step 4: i++ hua (i ban gaya 2) -> Fir se check hua...
            System.out.println("For Loop Iteration: " + i);
        }
        System.out.println(); // New line for clean output


        // ==========================================
        // 2. ⁡⁣⁣⁢WHILE LOOP⁡ (Condition-Based / Entry-Controlled)
        // ==========================================
        // Use case: Jab exact iterations na pata hon, bas ek termination condition pata ho.
        // Yeh loop chalne se pehle hi condition check kar leta hai.
        System.out.println("--- 2. WHILE LOOP ---");
        
        int count = 1; // Initialization loop ke bahar hoti hai
        
        while (count <= 5) { // Entry point par condition check
            System.out.println("While Loop Count: " + count);
            
            count++; // UPDATE STEP: Agar ye nahi likhenge toh 'count' humesha 1 rahega 
                     // aur loop Infinite ho jayega.
        }
        System.out.println();


        // ==========================================
        // 3. ⁡⁣⁣⁢DO-WHILE LOOP⁡ (Exit-Controlled / Guaranteed Execution)
        // ==========================================
        // Use case: Jab code ko kam se kam EK baar zaroor chalana ho, 
        // chahe condition starting me hi false kyun na ho.
        System.out.println("--- 3. DO-WHILE LOOP ---");
        
        int x = 10; // Initialization
        
        do {
            // Yeh block PEHLE chalega, bina condition check kiye.
            System.out.println("Do-While execution standalone value: " + x);
            x++; // x ki value 11 ho gayi
        } while (x < 5); // Exit par condition check hui (11 < 5 is FALSE). Loop yahin ruk gaya.
        
        // Note: do-while ke end me semicolon (;) mandatory hota hai.
        System.out.println();


        // ==========================================
        // 4. ⁡⁣⁣⁢ENHANCED FOR LOOP (For-Each - Traversing Arrays)⁡
        // ==========================================
        // Use case: Array ya Collection ke elements ko sequentially read karne ke liye.
        // Isme index ka jhanjhat nahi hota, na hi Out of Bounds ka darr hota hai.
        System.out.println("--- 4. ENHANCED FOR (FOR-EACH) LOOP ---");
        
        // Ek simple string array banaya
        String[] technologies = {"Java", "Python", "MERN", "Next.js"};
        
        // Read as: "For each 'tech' string inside 'technologies' array"
        for (String tech : technologies) {
            // Yeh automatic har iteration me agla element uthata hai
            System.out.println("Tech Stack Element: " + tech);
        }
        System.out.println();


        // ==========================================
        // BONUS: ⁡⁣⁣⁢LOOP CONTROL KEYWORDS⁡ (Break & Continue)
        // ==========================================
        System.out.println("--- BONUS: BREAK & CONTINUE IN ACTION ---");
        
        for (int k = 1; k <= 5; k++) {
            
            if (k == 2) {
                // Continue current iteration ko skip karke seedhe agle round (k=3) par bhej deta hai.
                System.out.println("   [Skipping iteration 2 using 'continue']");
                continue; 
            }
            
            if (k == 5) {
                // Break poore loop ko instant terminate kar deta hai.
                System.out.println("   [Breaking the loop entirely at 5]");
                break; 
            }
            
            System.out.println("Loop Keyword Demo, k = " + k);
        }
    }
}
