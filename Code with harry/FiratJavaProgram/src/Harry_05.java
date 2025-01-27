import java.util.Scanner;

public class Harry_05 {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a + b;
       System.out.println("The sum of two digit are: " + sum);
        //      or
        //boolean b1  = sc.hasNextInt();
        //System.out.println(b1);
        //       or
//        String str = sc.next();
//        System.out.println(str);
        //       or
      //  String str = sc.nextLine();
      //  System.out.println(str);
    }
}
