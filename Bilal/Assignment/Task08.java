import java.util.Scanner; // Scanner import

public class Task08 { // Class
    public static void main(String[] args) { // Main
        Scanner sc = new Scanner(System.in); // Scanner object
        int[] arr = new int[10]; // Array
        for(int i=0; i<10; i++) arr[i] = sc.nextInt(); // Input

        // Bubble Sort Logic - Ascending ke liye
        for(int i=0; i<9; i++) { // Outer loop kitni baar sort karna hai
            for(int j=0; j<9-i; j++) { // Inner loop comparison ke liye, har baar ek kam hota hai
                if(arr[j] > arr[j+1]) { // Agar pehla bada hai dusre se
                    int temp = arr[j]; // Temp me pehla save kiya
                    arr[j] = arr[j+1]; // Dusra pehle me daala
                    arr[j+1] = temp; // Temp wala dusre me daala - swapping
                }
            }
        }

        System.out.print("Ascending: "); // Ascending heading
        for(int i=0; i<10; i++) System.out.print(arr[i] + " "); // Sorted array print

        System.out.print("\nDescending: "); // Descending heading
        for(int i=9; i>=0; i--) System.out.print(arr[i] + " "); // Ulta print kar diya to descending ban gaya
        sc.close(); // Scanner band
    }
}
// Time Complexity: O(n^2) - Do nested loops is liye n*n