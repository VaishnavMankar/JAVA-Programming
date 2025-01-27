import java.util.Scanner;
public class While_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        int n = 1;
        while(n<=a){
            //n++;
            System.out.print(n+ " ");
            n++;
        }
    }
}
