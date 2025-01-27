public class LonelyInteger_24_3 {
    public static void main(String[] args) {

    }
    static int lonely(int[] arr){
        int result = 0;

        for(int i : arr){
            result = result^i;
        }
        return result;
    }
}
