import java.util.Arrays;

public class Overloading_10 {
    public static void main(String[] args) {
      sum("Vaishnav Mankar");
      sum(2);
        System.out.println("Sum of two number: " + sum(1,3));
        System.out.println("sum of three number: " + sum(5,5,5));
        sum(1,2,3,4,5,6,7);
        sum("vai","djf","djhdj");
    }
    static int sum(int a,int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a + b + c;
    }
    static void sum(int a){
        System.out.println("Number is: " + a);
    }
    static void sum(String name){
        System.out.println(name);
    }
    static void sum(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void sum(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
