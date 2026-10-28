import java.util.Scanner; // Scanner import

public class Task05 { // Class
    public static void main(String[] args) { // Main
        Scanner sc = new Scanner(System.in); // Scanner object
        int[] arr = new int[11]; // 11 size ka array kyunke 10 pehle hain 1 naya insert karna hai
        System.out.println("Enter 10 numbers:"); // Message
        for(int i=0; i<10; i++) arr[i] = sc.nextInt(); // Pehle 10 numbers input kiye

        System.out.print("Enter index where to insert (0-10): "); // Poochha kis index par insert karna hai
        int index = sc.nextInt(); // Index input liya
        System.out.print("Enter number to insert: "); // Poochha konsa number insert karna hai
        int num = sc.nextInt(); // Number input liya

        // Elements ko right par shift karna
        for(int i=10; i>index; i--) { // Loop peeche se chalaya, index tak
            arr[i] = arr[i-1]; // Har element ko ek aage shift kar diya taake jagah ban jaye
        }
        // Insert karna
        arr[index] = num; // Khali hui jagah par naya number rakh diya

        System.out.print("Updated array: "); // Heading
        for(int i=0; i<11; i++) System.out.print(arr[i] + " "); // Naya array 11 elements ke saath print kiya
        sc.close(); // Scanner band
    }
}
// Time Complexity: O(n) - Shift karne ke liye
