//https://leetcode.com/problems/find-in-mountain-array/description/
//1095. Find the Mountain Array
public class SearrchInmountain_7 {
    public static void main(String[] args) {

    }
     int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = search(arr,target,true);
        if(firstTry != -1){
            return firstTry;
        }
        //try to search in second half
         return -1;// this line is added by me its use less.
    }
    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else {
                start = mid + 1;//because we know that mid+1 element > mid element
            }
        }
        return start;//or return end as both are equal
    }
    static int search(int[] nums, int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}
