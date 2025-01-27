public class EX {
    public static void main(String[] args) {
        for(int i = 1; i <= 1000; i++){
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }
    static boolean isArmstrong(int num){
        int sum = 0;
        int original = num;
        while (num > 0){
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem*rem*rem;
        }
        if(sum == original){
            return true;
        }
        return false;
    }
}
