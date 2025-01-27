import java.util.Arrays;

public class Max_10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for( int i = 0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
