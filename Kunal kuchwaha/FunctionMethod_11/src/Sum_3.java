import java.util.Scanner;

public class Sum_3 {
    public static void main(String[] args) {
          int ans = sum2();
        System.out.println(ans);
    }
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;

    }
     static void summ(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

    }
}
