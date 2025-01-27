import java.util.Arrays;

public class Swap_9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        swap(arr, 1,5);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index5){
        int temp = arr[index1];
        arr[index1] = arr[index5];
        arr[index5] = temp;
    }
}
