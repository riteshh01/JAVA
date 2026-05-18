package array_1;

import java.util.Scanner;

public class MultiD_03 {
    public static void main(String[] args) {
        
        // ==========================================
        // A. STATIC INITIALIZATION (Direct Matrix)
        // ==========================================
        System.out.println("--- 1. Static 2D Array ---");
        
        // 2 Rows aur 3 Columns ka matrix
        int[][] staticMatrix = {
            {1, 2, 3},  // Row 0
            {4, 5, 6}   // Row 1
        };

        // Element access karne ke liye: matrix[row][column]
        System.out.println("Element at Row 0, Column 2: " + staticMatrix[0][2]); // Output: 3
        System.out.println("Element at Row 1, Column 1: " + staticMatrix[1][1]); // Output: 5


        // ==========================================
        // B. DYNAMIC INPUT & NESTED LOOPS
        // ==========================================
        System.out.println("\n--- 2. Dynamic 2D Array Input & Output ---");
        Scanner sc = new Scanner(System.in);

        // Rows aur Columns ka size user se lena
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Memory allocation
        int[][] dynamicMatrix = new int[rows][cols];

        // TAKING INPUT: Nested Loops ka use hota hai
        // Outer loop (i) rows ko handle karta hai, Inner loop (j) columns ko
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) { // Loop through rows
            for (int j = 0; j < cols; j++) { // Loop through columns of current row
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                dynamicMatrix[i][j] = sc.nextInt();
            }
        }

        // PRINTING METHOD 1: Traditional Tabular Format
        System.out.println("\nPrinted Matrix (Standard Layout):");
        for (int i = 0; i < dynamicMatrix.length; i++) { // dynamicMatrix.length gives number of rows
            for (int j = 0; j < dynamicMatrix[i].length; j++) { // gives number of columns in row i
                System.out.print(dynamicMatrix[i][j] + "\t"); // \t se tab space aati hai
            }
            System.out.println(); // Har row ke khatam hone par new line
        }

        // PRINTING METHOD 2: Enhanced For Loop (For-Each)
        System.out.println("\nPrinted Matrix using For-Each:");
        // Yaad rakho: 2D array ka har ek row ek 1D array hota hai!
        for (int[] row : dynamicMatrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
