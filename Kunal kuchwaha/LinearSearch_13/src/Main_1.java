public class Main_1 {
    public static void main(String[] args) {
       int[] num = {1,23,45,67,99,-3,36,-24};
       int target = 67;
       int ans = linearSearch(num, target);
        System.out.println(ans);
    }
    //Searching in the array: return the value if its found
    //return -1 if the value is not found
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //this line will execute if none of the return statement above have executed
        //hence the target not found
        return -1;
    }
}
/*
public class EX {
    public static void main(String[] args) {
        int[] arr = {1,23,45,67,89};
        int target = 90;
        System.out.println(linearSearch(arr,target));
    }
    static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                return target;
            }
        }
        return -1;
    }
}

*/
