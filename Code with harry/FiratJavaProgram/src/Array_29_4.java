//create a java program to add two matrices os size 2 x 3;
public class Array_29_4 {
    public static void main(String[] args) {
        int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{2,6,8},
                         {6,2,7}};
        int [][] result = {{0,0,0},
                           {0,0,0}};
        for (int i=0; i<mat1.length;i++){// row number of times
            for(int j=0;j<mat1[i].length;j++){
                System.out.format("Setting value for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i=0; i<mat1.length;i++){// row number of times
            for(int j=0;j<mat1[i].length;j++){
                System.out.print(result[i][j]+ " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("  ");
        }
    }
}
