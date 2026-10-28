import java.util.Scanner; // Scanner import

public class Task11 { // Class
    public static void main(String[] args) { // Main
        Scanner sc = new Scanner(System.in); // Scanner object
        int[] arr1 = new int[5]; // Pehla sorted array
        int[] arr2 = new int[5]; // Dusra sorted array
        int[] merged = new int[10]; // Teesra merged array

        System.out.println("Enter first 5 SORTED numbers:"); // Pehle sorted array ka input
        for(int i=0; i<5; i++) arr1[i] = sc.nextInt(); // Input
        System.out.println("Enter second 5 SORTED numbers:"); // Dusre ka input
        for(int i=0; i<5; i++) arr2[i] = sc.nextInt(); // Input

        // Two-pointer technique - Bina sort algorithm ke merge
        int i=0, j=0, k=0; // i arr1 ke liye, j arr2 ke liye, k merged ke liye
        while(i<5 && j<5) { // Jab tak dono arrays me elements hain
            if(arr1[i] < arr2[j]) { // Agar arr1 ka element chota hai
                merged[k++] = arr1[i++]; // Use merged me daalo aur dono pointers aage
            } else { // Agar arr2 ka chota ya barabar hai
                merged[k++] = arr2[j++]; // arr2 wala merged me daalo
            }
        }
        while(i<5) merged[k++] = arr1[i++]; // Agar arr1 me kuch bach gaya to sab daal do
        while(j<5) merged[k++] = arr2[j++]; // Agar arr2 me kuch bach gaya to sab daal do

        System.out.print("Sorted Merged Array: "); // Heading
        for(int x=0; x<10; x++) System.out.print(merged[x] + " "); // Merged sorted array print
        sc.close(); // Scanner band
    }
}
// Time Complexity: O(n+m) = O(n) - Linear time, is liye best hai