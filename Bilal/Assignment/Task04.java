import java.util.Scanner; // Scanner import

public class Task04 { // Class start
    public static void main(String[] args) { // Main start
        Scanner sc = new Scanner(System.in); // Scanner object banaya
        int[] arr = new int[10]; // 10 size ka array declare kiya
        System.out.println("Enter 10 numbers:"); // Input ka message
        for(int i=0; i<10; i++) arr[i] = sc.nextInt(); // Array me values input ki

        System.out.print("Enter number to search: "); // User se poocha konsa number dhoondhna hai
        int key = sc.nextInt(); // Wo number key variable me save kiya
        boolean found = false; // Ek flag lagaya, shuru me false rakha

        // Linear search karna
        for(int i=0; i<10; i++) { // Array ke har index par jana
            if(arr[i] == key) { // Agar array ka element key ke barabar hai
                System.out.println("Found at index: " + i); // Uska index print kar diya
                found = true; // Flag ko true kar diya matlab mil gaya
            }
        }
        if(!found) System.out.println("Number not found"); // Agar loop ke baad bhi found false hai to not found print
        sc.close(); // Scanner band
    }
}
// Time Complexity: O(n) - Worst case poora array check karna parhega