import java.util.Scanner;

public class Sum_2 {
    public static void main(String[] args) {
        summm();
        summm();
        summm();
    }
    public static void summm(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

    }
}