public class CountNumber_35 {
    public static void main(String[] args) {
        System.out.println(count(12345));
    }
    static int count(int n){
        if(n == 0){
            return 0;
        }
        return count(n/10)+1;
    }
}
