//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
//34. Find First and Last Position of Element in Sorted Array
public class FirstandLast_4 {
    public static void main(String[] args) {
        int[]  arr = {5,7,7,8,8,10};
        int target = 8;
       // System.out.println(searchRange(arr,target));
        int[] result = searchRange(arr, target);
        System.out.println("Start index: " + result[0] + ", End index: " + result[1]);
    }
    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        //check for first occurrence if target first
        int  start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    //this function just returns the index value of target
    static int search(int[] nums, int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            //find the middle element
            //int mid = (start + end)/2; might be possible thar (start + end) might exide the integer range
            int mid = start + (end - start) / 2;

            if (target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                //potential ans found
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
