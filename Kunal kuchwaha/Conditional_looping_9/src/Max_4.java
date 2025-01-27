//find the maximum out of 3 numbers
import java.util.Scanner;

public class Max_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Greatest of three number: ");
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();

         int max = a;
         if (b > max){
             max = b;
         }
         if (c > max){
             max = c;
        }
//         else {
//            System.out.println("invalid entry");
//        }
        System.out.println(max);
    }
}
