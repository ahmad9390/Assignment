import java.util.Scanner; // Scanner import

public class Task06 { // Class
    public static void main(String[] args) { // Main
        Scanner sc = new Scanner(System.in); // Scanner object
        int[] arr = new int[10]; // 10 ka array
        System.out.println("Enter 10 numbers:"); // Input message
        for(int i=0; i<10; i++) arr[i] = sc.nextInt(); // Input loop

        System.out.print("Enter index to delete (0-9): "); // Konsa index delete karna hai poocha
        int index = sc.nextInt(); // Index input liya

        // Elements ko left shift karna
        for(int i=index; i<9; i++) { // Delete wali jagah se shuru kiya
            arr[i] = arr[i+1]; // Agle wale element ko peeche le aaye, is se delete ho gaya
        }

        System.out.print("Updated array: "); // Heading
        for(int i=0; i<9; i++) { // Sirf 9 elements print karenge kyunke ek delete ho gaya
            System.out.print(arr[i] + " "); // Updated array print
        }
        sc.close(); // Scanner band
    }
}
// Time Complexity: O(n) - Worst case 0 index delete karne par 9 shifts
