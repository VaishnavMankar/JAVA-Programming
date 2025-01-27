//https://leetcode.com/problems/flipping-an-image/
//832. Flipping the Image

public class FlipImage_25_7 {
     public static void main(String[] args) {
         int[][] arr = {
                 {1,0,1},
                 {1,1,0},
                 {0,0,1}
         };
         int[][] result = flipAndInvertImage(arr);

         // Print the modified image
         for (int[] row : result) {
             for (int val : row) {
                 System.out.print(val + " ");
             }
             System.out.println(); // Move to the next row
         }
     }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            //reverse the array
            for(int i = 0; i < (image[0].length + 1) / 2; i++){
                //swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}
