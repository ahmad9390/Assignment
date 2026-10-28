import java.util.Scanner; // Scanner class ko import kiya taake user se input le saken

public class Task01 { // Class ka naam Task01 rakha
    public static void main(String[] args) { // Program ka main function yahan se start hota hai
        Scanner sc = new Scanner(System.in); // Scanner ka object banaya input lene ke liye
        int[] arr = new int[10]; // 10 integers ka ek array declare kiya

        // User se input lene ka hissa
        System.out.println("Enter 10 integers:"); // User ko 10 numbers enter karne ka bola
        for(int i = 0; i < 10; i++) { // Loop 0 se 9 tak chalega, 10 baar
            arr[i] = sc.nextInt(); // Har baar user se ek number le kar array me store kiya
        }

        // Saare elements display karna
        System.out.print("Array elements: "); // Heading print ki
        for(int i = 0; i < 10; i++) { // Loop se array ke saare elements par jana
            System.out.print(arr[i] + " "); // Har element ko print kiya
        }

        // Reverse me display karna
        System.out.print("\nArray in reverse: "); // Reverse ke liye heading, \n ka matlab new line
        for(int i = 9; i >= 0; i--) { // Loop ulta chalaya 9 se 0 tak
            System.out.print(arr[i] + " "); // Reverse order me element print kiya
        }
        sc.close(); // Scanner ko band kar diya taake memory leak na ho
    }
}
// Time Complexity: O(n) - Kyunke hum array ko 3 baar linear traverse kar rahe hain