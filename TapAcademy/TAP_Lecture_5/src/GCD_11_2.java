import java.util.Scanner;

public class GCD_11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Maximum(a,b));
    }
    static int Maximum(int a, int b){
        int min = 0;
        if(a < b){
            min = a;
        }else{
            min = b;
        }
        for(int i = min; i >= 1; i--){
            if(a%i == 0 && b%i == 0){
                return i;              // if you are using return statement no need to use break statement
            }
        }
        return 1;
    }
}
