import java.util.Scanner; // User se input lene ke liye Scanner import kiya

public class Task03 { // Class ka naam Task03 rakha
    public static void main(String[] args) { // Main method jahan se program start hota hai
        Scanner sc = new Scanner(System.in); // Scanner ka object banaya
        int[] arr = new int[10]; // 10 numbers ke liye array banaya
        int sum = 0; // Sum ko 0 se start kiya taake usme jama kar saken

        System.out.println("Enter 10 numbers:"); // User ko message diya input ke liye
        for(int i=0; i<10; i++) arr[i] = sc.nextInt(); // Loop se 10 numbers input liye

        // Sum nikalna
        for(int i=0; i<10; i++) sum += arr[i]; // Har element ko sum me jama kiya, sum = sum + arr[i]
        double avg = (double)sum / 10; // Average nikala, double cast kiya taake point me answer aaye

        // Average se bade elements ginna
        int count = 0; // Count ko 0 se start kiya
        for(int i=0; i<10; i++) { // Poore array par loop chalaya
            if(arr[i] > avg) count++; // Agar element average se bada hai to count 1 barha diya
        }

        System.out.println("Sum: " + sum); // Sum print kiya
        System.out.println("Average: " + avg); // Average print kiya
        System.out.println("Elements > Average: " + count); // Bade elements ki tadad print ki
        sc.close(); // Scanner band kar diya
    }
}
// Time Complexity: O(n) - Kyunke 3 linear loops hain