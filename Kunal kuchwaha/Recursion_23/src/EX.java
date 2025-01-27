public class EX {
    public static void main(String[] args) {
      int[] arr = {0,1,2,3,4,5,6,7,8};
      int target = 3;
        System.out.println(binarysearch(arr,target,0,arr.length-1));
    }
    static int binarysearch(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int mid = s + (e - s)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(target > arr[mid]){
            return binarysearch(arr,target,mid+1, e);
        }
        return binarysearch(arr, target, s, mid - 1);
    }
}
