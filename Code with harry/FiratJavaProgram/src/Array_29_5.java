public class Array_29_5 {
    public static void main(String[] args) {
        int m = Math.floorDiv(3,2);
        System.out.println(m);

        int[] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for(int i=0; i<n; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int  element: arr){
            System.out.println(element);
        }
    }
}
