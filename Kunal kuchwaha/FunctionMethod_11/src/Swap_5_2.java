public class Swap_5_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a,b);
        System.out.println(a + " " + b);
    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        temp = b;
    }
}
/*this and the next one are the same
  you cannot swap the valie in different function
 */