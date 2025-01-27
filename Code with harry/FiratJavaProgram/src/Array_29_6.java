//find the  maximum element in array
public class Array_29_6 {
    public static void main(String[] args) {
        int [] arr = {1,43 ,33,2,44,46 };
        int max = 0;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The value of the maximum element in this array is: " + max);
    }
}
