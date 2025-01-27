public class DigitProduct_4 {
    public static void main(String[] args) {
        System.out.println(pro(12342));
    }
      static int pro(int n){
        if(n%10 == 0){
            return n;
        }
        return (n%10) + pro(n/10);
    }
}
