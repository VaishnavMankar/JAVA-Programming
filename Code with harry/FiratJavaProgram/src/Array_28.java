public class Array_28 {
    public static void main(String[] args) {
        int [][] flats;
        flats = new int [2][3];         //two rows 3 colum
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        //displaying entire 2-d array
        System.out.println("Printing a 2-D array using for loop");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
                //System.out.println(Arrays.deepToString(flats));
            }
            System.out.println(" ");
        }
    }
}
