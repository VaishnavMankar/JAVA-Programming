public class Main_119 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = 0; i<arr.length;i++){
            arr[i] = arr.length-i;
        }
        for(int element: arr){
            System.out.print(element+ " ");
        }
    }
}
