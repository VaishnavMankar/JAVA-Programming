public class Main_31 {
    public static void main(String[] args) {
        Fun(5);
    }
    static void Fun(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        Fun(n-1);
    }
}