public class Do_24_3 {
    public static void main(String[] args) {
        int i =0;
        do{
            System.out.println(i);
            System.out.println("Java is Great ");
            if (i == 3) {
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }while(i < 5);
        System.out.println("loop ends here");
    }
}
