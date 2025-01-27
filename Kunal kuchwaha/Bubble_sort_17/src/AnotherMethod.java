import java.util.Arrays;

public class AnotherMethod {
    public static void main(String[] args) {
        int[] arr= {-1,7,-32,89};
        bubbleSort(arr);
        //System.out.println(Arrays.toString(arr));
    }
     static void bubbleSort(int[] nums){
        for(int i=0; i < nums.length; i++){
            for(int j=0; j < nums.length-i-1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
