public class Array_26_1 {
    public static void main(String[] args) {
        //this one is tne  method 2
        //        int [] marks = new int[5];
//        marks[0] = 100;
//        marks[1] = 65;
//        marks[2] = 43;
//        marks[3] = 87;
//        marks[4] = 67;
//        System.out.println(marks[4]);

        //this one is  the method three;
        int[] marks = {98, 87, 76, 84, 43};
        //System.out.println(marks[0]);

        //System.out.println(marks.length); this line is yous to find the length of array

        //this command helps to display the entire array
        for(int i = 0; i<marks.length;i++){
            System.out.println(marks[i]);
            //anotther method to print array
            System.out.println("printing array using for-each loop");
            for(int element: marks){
                System.out.println(element);
            }
        }
        // comand use to print array in reverse order
        System.out.println("Print using for loop in reverse order");
        for(int i=marks.length -1; i>=0;i--){
            System.out.println(marks[i]);
        }
    }
}
