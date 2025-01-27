//Find position of an element in a sorted array of infinite numbers
public class InfiniteArray_5 {
    public static void main(String[] args) {
       int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
       int target = 10;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr, int target){
        //first find the range
        //first start with the box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while(target > arr[end]){
            int newStart = end + 1; //this is my new start
            //double the box value
            //end = previous end +sizeofBox * 2
            end = end  + (end - start + 1)*2; //this is the formula for doubling the side of an array every time it doesn't find the target element in previous one
            start = newStart;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr, int target,int start, int end){

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
