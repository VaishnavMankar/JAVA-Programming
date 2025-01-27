//this program will return the largest pogeshnal value closest to the target. the counting starts from zero.
public class Ceiling_1 {
    public static void main(String[] args){
        int[] arr = {2,3,5,9,14,16,19};
        int target = 17;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
    //return the index
    //smallest number >= target
    static int ceiling(int[] arr, int target){

        if(target > arr[arr.length -1]){
            return  -1;
        }
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            //find the middle element
            //int mid = (start + end)/2; might be possible thar (start + end) might exide the integer range
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
