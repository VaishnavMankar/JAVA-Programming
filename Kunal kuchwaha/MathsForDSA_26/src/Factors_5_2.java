public class Factors_5_2 {
    public static void main(String[] args) {
        factor1(20);
    }
    //O(sqrt(n))
    private static void factor1(int n) {
        for(int i = 1;i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i+ ", ");
                }else {
                    System.out.print(i + ", " + n/i + ", ");
                }
            }
        }
    }
}
