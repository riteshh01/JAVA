package array_1;

import java.util.Scanner;

public class OneD_02 {
    public static void main(String[] args) {
        
        // Scanner object create kiya console se input lene ke liye
        Scanner sc = new Scanner(System.in);
        
        // STEP 1: Array ka size user se define karwana
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        // Array declaration aur dynamic memory allocation
        int[] myArr = new int[size];
        
        System.out.println("An array of size " + size + " is created in Heap memory.");
        System.out.println("--------------------------------------------------");

        // ==========================================
        // STEP 2: TAKING INPUT USING FOR LOOP
        // ==========================================
        // Array ka index humesha 0 se shuru hota hai aur (size - 1) tak jata hai.
        // Isiliye condition 'i < myArr.length' lagayi jati hai.
        
        System.out.println("Enter " + size + " integer elements:");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print("Enter element at index [" + i + "]: ");
            
            // sc.nextInt() user ka input read karega aur use myArr[i] par store karega
            myArr[i] = sc.nextInt(); 
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("Data entry completed successfully!\n");


        // ==========================================
        // STEP 3: PRINTING METHOD 1 - Standard For Loop
        // ==========================================
        // Yeh method tab best hai jab aapko elements ke sath unka index number bhi print karna ho,
        // ya fir array ko reverse order me print karna ho.
        
        System.out.println("--- Printing using Standard For Loop (With Indices) ---");
        for (int i = 0; i < myArr.length; i++) {
            System.out.println("Value at index " + i + " is: " + myArr[i]);
        }
        System.out.println();


        // ==========================================
        // STEP 4: PRINTING METHOD 2 - Enhanced For Loop (For-Each)
        // ==========================================
        // Yeh method tab best hai jab aapko index se koi matlab na ho, 
        // bas saare data ko clean format me display karna ho.
        
        System.out.println("--- Printing using Enhanced For Loop (Clean Output) ---");
        System.out.print("Array Elements: [ ");
        
        for (int element : myArr) {
            // Har iteration me 'element' variable me automatic agla data aa jata hai
            System.out.print(element + " ");
        }
        System.out.println("]");
        System.out.println();


        // ==========================================
        // BONUS: QUICK PRINT METHOD (Arrays.toString)
        // ==========================================
        // Agar aap debugging kar rahe ho aur bina loop likhe poora array ek baar me dekhna hai,
        // toh Java ki built-in Utility ka use kar sakte hain.
        
        System.out.println("--- Quick Debug Printing (Arrays.toString) ---");
        System.out.println(java.util.Arrays.toString(myArr));

        // Scanner resource ko close karna good practice hai
        sc.close(); 
    }
}
