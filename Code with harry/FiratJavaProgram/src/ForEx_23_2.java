import java.util.Scanner;

public class ForEx_23_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare an integer variable n and assign it a value from the user input
        int n;
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();

        // Declare another integer variable i and initialize it to n
        int i = n;

        // Use a for loop to iterate from i to 1, decrementing i by 1 in each iteration
        for (; i >= 1; i--) {
            // Inside the loop, print the value of i followed by a space
            System.out.print(i + " ");
        }

        // Exit the loop and end the program
        sc.close();
    }
}
