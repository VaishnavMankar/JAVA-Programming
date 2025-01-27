public class BinarySearch_1 {
    public static void main(String[] args) {
        int[] arr = {-18,-13,-8,0,2,4,6,8,10,12,16,18,24,32,44};
        int target = 32;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }
    //return the index
    //return -1  if it does not exist
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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
        return -1;
    }
}
