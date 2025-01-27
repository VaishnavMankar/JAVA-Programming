//array is sorted or not;
public class Array_29_7 {
    public static void main(String[] args) {
        int [] arr = {1,43 ,33,2,44,46 };
        boolean isSorted = true;
        for(int i=0;i<arr.length-1;i++){
            if (arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("the Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
    }
}
