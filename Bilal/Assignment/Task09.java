import java.util.Scanner; // Scanner import

public class Task09 { // Class
    public static void main(String[] args) { // Main
        Scanner sc = new Scanner(System.in); // Scanner object
        int[] arr = new int[10]; // 10 ka array
        System.out.println("Enter 10 numbers:"); // Message
        for(int i=0; i<10; i++) arr[i] = sc.nextInt(); // Input

        System.out.println("Duplicate values:"); // Heading
        for(int i=0; i<10; i++) { // Outer loop har element ke liye
            int count = 1; // Har element ka count 1 se start kiya
            boolean alreadyCounted = false; // Check karne ke liye kya ye pehle count ho chuka hai
            
            // Check karo kya ye value pehle print ho chuki hai
            for(int k=0; k<i; k++) { // i se pehle tak dekho
                if(arr[k] == arr[i]) { alreadyCounted = true; break; } // Agar pehle mil gaya to flag true
            }
            if(alreadyCounted) continue; // Agar pehle count ho chuka hai to skip kar do, dubara print nahi karna

            for(int j=i+1; j<10; j++) { // Inner loop i ke baad wale elements check karne ke liye
                if(arr[i] == arr[j]) count++; // Agar duplicate mila to count barha diya
            }
            if(count > 1) { // Agar count 1 se zyada hai matlab duplicate hai
                System.out.println(arr[i] + " occurs " + count + " times"); // Duplicate value aur uski frequency print
            }
        }
        sc.close(); // Scanner band
    }
}
// Time Complexity: O(n^2) - Nested loops ki wajah se