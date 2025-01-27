// just for practic.
import java.util.Scanner;

public class Calsulator_9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking input from user till user does not press X or x

        int ans = 0; // declare and initialize ans
        while(true) {
            //taking operator as input
            System.out.print("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.print("Enter two number: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                    System.out.println(ans); // print the result
                }
                if (op == '-') {
                    ans = num1 - num2;
                    System.out.println(ans); // print the result
                }
                if (op == '*') {
                    ans = num1 * num2;
                    System.out.println(ans); // print the result
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                        System.out.println(ans); // print the result
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                    System.out.println(ans); // print the result
                }
            } else if (op == 'X' || op == 'x') { // use single quotes for char
                break;
            } else {
                System.out.println("Invalid operator!");
            }
        }
        System.out.println(ans);

    }
}
