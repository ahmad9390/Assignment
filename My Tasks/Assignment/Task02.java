import java.util.Scanner; // Input ke liye Scanner import

public class Task02 { // Class start
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Scanner object
        int[] arr = new int[10]; // 10 size ka array
        System.out.println("Enter 10 integers:"); // User se input ka kaha
        for(int i = 0; i < 10; i++) arr[i] = sc.nextInt(); // Input loop

        int max = arr[0], min = arr[0]; // Shuru me pehle element ko hi max aur min maan liya
        int secMin = Integer.MAX_VALUE; // Second min ke liye sab se bada value rakha
        int maxIndex = 0, minIndex = 0; // Max aur Min ke index store karne ke liye

        // Max aur Min dhoondhna
        for(int i = 1; i < 10; i++) { // 1 se start kyunke 0 pehle hi check kar liya
            if(arr[i] > max) { max = arr[i]; maxIndex = i; } // Agar naya element bada hai to max update
            if(arr[i] < min) { min = arr[i]; minIndex = i; } // Agar naya element chota hai to min update
        }

        // Second Minimum dhoondhna
        for(int i = 0; i < 10; i++) { // Poore array me loop
            if(arr[i] > min && arr[i] < secMin) { // Jo min se bada ho aur ab tak ke secMin se chota ho
                secMin = arr[i]; // Use second min bana diya
            }
        }

        System.out.println("Largest: " + max + " at index " + maxIndex); // Sab se bada element aur uska index print
        System.out.println("Smallest: " + min + " at index " + minIndex); // Sab se chota element aur index print
        System.out.println("Second Minimum: " + secMin); // Second minimum print
        sc.close(); // Scanner band
    }
}
// Time Complexity: O(n) - Do alag loops hain lekin dono linear hain