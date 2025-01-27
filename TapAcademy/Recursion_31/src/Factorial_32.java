public class Factorial_32 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
