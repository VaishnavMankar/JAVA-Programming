public class DoContinue_24_5 {
    public static void main(String[] args) {
        int i =0;
        do{
            i++;
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is Great ");
        }
        while(i < 5);
        System.out.println("loop ends here");
    }
}
