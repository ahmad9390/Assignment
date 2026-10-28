import java.util.Scanner; // Scanner import

public class Task10 { // Class
    public static void main(String[] args) { // Main
        Scanner sc = new Scanner(System.in); // Scanner object
        int[] arr1 = new int[5]; // Pehla array 5 elements ka
        int[] arr2 = new int[5]; // Dusra array 5 elements ka
        int[] merged = new int[10]; // Teesra merged array 10 elements ka

        System.out.println("Enter first 5 numbers in ascending order:"); // Pehle array ka message
        for(int i=0; i<5; i++) arr1[i] = sc.nextInt(); // Pehle array ka input
        System.out.println("Enter second 5 numbers in ascending order:"); // Dusre array ka message
        for(int i=0; i<5; i++) arr2[i] = sc.nextInt(); // Dusre array ka input

        // Merge karna
        for(int i=0; i<5; i++) merged[i] = arr1[i]; // Pehle array ke 5 elements merged me 0-4 par daale
        for(int i=0; i<5; i++) merged[5+i] = arr2[i]; // Dusre array ke 5 elements merged me 5-9 par daale

        System.out.print("Merged Array: "); // Heading
        for(int i=0; i<10; i++) System.out.print(merged[i] + " "); // Merged array print

        // Largest dhoondhna
        int max = merged[0]; // Pehle element ko max maan liya
        for(int i=1; i<10; i++) if(merged[i] > max) max = merged[i]; // Har element check kiya agar bada hai to max update
        System.out.println("\nLargest in merged: " + max); // Sab se bada element print
        sc.close(); // Scanner band
    }
}
// Time Complexity: O(n) - Merge aur max dono linear hain
