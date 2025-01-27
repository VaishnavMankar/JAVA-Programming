import java.util.Arrays;

public class LonelyInteger_24_1 {
    public static void main(String[] args) {

    }
    static int lonely(int[] arr){
        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 2; i = i + 2){
            if(arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
}
