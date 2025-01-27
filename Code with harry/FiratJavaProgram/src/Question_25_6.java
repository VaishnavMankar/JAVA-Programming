//Repeat 5 using while loop factorial off 5
public class Question_25_6 {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int factorial = 1;
        while(i<=n){
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }
}
/*
int number = 5;
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial = factorial * i;
                }
                System.out.println("The factorial of " + number + " is " + factorial);
 */