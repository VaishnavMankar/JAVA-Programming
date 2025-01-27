public class Shadowing_8 {
    static int x = 90;//this will get shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x);
        int x = 80;
        System.out.println(x);
     fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
