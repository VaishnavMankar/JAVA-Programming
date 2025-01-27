public class Main_1_3 {
    public static void main(String[] args) {
        int[] num = {1,23,45,67,99,-3,36,-24};
        int target = 67;
        boolean ans = linearSearch2(num, target);
        System.out.println(ans);
    }
    //Searching in the array: return the value if its found
    //return -1 if the value is not found
    static boolean linearSearch2(int[] arr,int target){
        if(arr.length == 0){
            return false;
        }
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == target) {
                return true;
            }
        }
        /* this one is the traditional  for loop and the above one is enhance for loop
        for (int index = 0; index < arr.length; index++){
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){Sear
                return true;
            }
        }
         */
        //this line will execute if none of the return statement above have executed
        //hence the target not found
        return false;
    }
}
