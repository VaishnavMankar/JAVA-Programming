public class Facrors_5 {
    public static void main(String[] args) {
        factor1(20);
    }
    //O(n)

    private static void factor1(int n) {
        for(int i = 1;i <= n; i++){
            if(n % i == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
