public class Max_10_2 {
    public static void main(String[] args) {
        int[] arr = {1,32,33,74,85,226,97,8};
        System.out.println(maxRange(arr,0,3));
    }
    static int maxRange(int[] arr, int start, int end){
        if(end < start){
            return -1;
        }
        if(arr == null){
            return  -1;
        }
        int maxVal = arr[start];
        for( int i = start; i <= end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
