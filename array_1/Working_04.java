package array_1;

public class Working_04 {
    public static void main(String[] args) {
        
        // =========================================================================
        // 1. ARRAY CREATION & STORAGE (Memory Allocation)
        // =========================================================================
        
        /*
         * Jab hum ye line execute karte hain, toh do main cheezein hoti hain:
         * 
         * 1. STACK MEMORY: 
         *    - 'numbers' naam ka ek reference variable Stack me banta hai.
         *    - Ye variable actual data hold nahi karta, balki Heap memory ka address (reference) hold karta hai.
         * 
         * 2. HEAP MEMORY:
         *    - 'new int[3]' ki wajah se Heap me ek contiguous (continuous) memory block allocate hota hai.
         *    - JVM is block me do cheezein store karta hai:
         *         a) Object Header: Isme array ki 'length' (jo ki 3 hai) aur metadata hota hai.
         *         b) Actual Elements: [0, 0, 0] (Java primitive arrays ko default values se initialize karta hai).
         * 
         * [Stack]                                 [Heap Memory]
         * +---------+                             +-----------------------------------+
         * | numbers | --------(points to)-------> | Header (Length: 3)                |
         * +---------+ (e.g., Address: 0x001)      |-----------------------------------|
         *                                         | Index 0 | Index 1 | Index 2       |
         *                                         |   0     |   0     |   0           |
         *                                         +-----------------------------------+
         */
        int[] numbers = new int[3];

        
        // =========================================================================
        // 2. ASSIGNING VALUES (Memory Modification)
        // =========================================================================
        
        /*
         * JVM kaise values assign karta hai:
         * - JVM 'numbers' reference se Heap ka base address (0x001) dhoondhta hai.
         * - Kyunki ye 'int' array hai (har int 4 bytes ka hota hai), JVM calculation karta hai:
         *   Target Address = Base Address + (Index * Element Size)
         * 
         * For Index 1: 0x001 + (1 * 4 bytes) = JVM directly us memory slot par jaakar 50 write kar deta hai.
         */
        numbers[0] = 10;
        numbers[1] = 50;
        numbers[2] = 90;

        
        // =========================================================================
        // 3. HOW JVM ACCESSES THE VALUE (Under the Hood)
        // =========================================================================
        
        /*
         * Jab hum 'numbers[1]' likhte hain, toh JVM backend me ye steps follow karta hai:
         * 
         * Step A: Null Check
         *   - JVM check karta hai ki kya 'numbers' variable kisi valid Heap memory ko point kar raha hai?
         *   - Agar 'numbers == null' hota, toh JVM yahi par 'NullPointerException' throw kar deta.
         * 
         * Step B: Bounds Check (Security & Safety)
         *   - JVM array ke Object Header se uski 'length' read karta hai (jo ki 3 hai).
         *   - Wo check karta hai: Kya requested index (1) >= 0 hai aur < length (3) hai?
         *   - Agar index range se bahr ho (jaise numbers[5]), toh JVM 'ArrayIndexOutOfBoundsException' throw karta hai.
         * 
         * Step C: Direct Pointer Arithmetic (Value Retrieval)
         *   - Agar dono checks pass ho gaye, toh JVM formula chalata hai:
         *     Memory Location = Base_Address + (Index * 4 Bytes)
         *   - JVM directly us exact memory location se value (50) fetch karke return kar deta hai.
         *   - Isi wajah se array me kisi bhi element ko access karne ka time humesha O(1) yaani Constant hota hai.
         */
        int primitiveValue = numbers[1]; 
        System.out.println("Accessed Value: " + primitiveValue); // Output: 50

        
        // =========================================================================
        // 4. OBJECT ARRAYS VS PRIMITIVE ARRAYS (Crucial Difference)
        // =========================================================================
        
        /*
         * Primitive array (jaise int[]) me actual values directly Heap block me hoti hain.
         * Lekin Object array (jaise String[]) me kahani thodi alag hai:
         * 
         * [Stack]               [Heap: Array Object]            [Heap: String Objects]
         * +------+              +--------------------+          +--------------------+
         * | str  | ---------->  | Header (Length: 2) |          | "Hello" (at 0x99)  |
         * +------+              |--------------------|          +--------------------+
         *                       | Index 0: 0x99   ---|--------> | "World" (at 0x55)  |
         *                       | Index 1: 0x55   ---|--------> +--------------------+
         *                       +--------------------+
         * 
         * Yaani Object array ke elements actually references (pointers) hote hain jo 
         * Heap me doosri jagah bne actual objects ko point karte hain.
         */
        String[] str = new String[2];
        str[0] = "Hello"; // JVM stores the reference of "Hello" at index 0
        str[1] = "World"; // JVM stores the reference of "World" at index 1
        
    }
}
