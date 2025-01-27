//This one is the normal method
public class Vararga_33_1 {
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static int sum (int a, int b, int c, int d){
        return a+b+c+d;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs tutorial");
        System.out.println("The sun of 4 and 5 is: " +sum(4,5));
        System.out.println("The sum of 4, 3 and 5 is: " + sum(4,3,5));
        System.out.println("The sum of 2,4,3 and 5 is: " +sum(2,4,3,5));
    }
}
