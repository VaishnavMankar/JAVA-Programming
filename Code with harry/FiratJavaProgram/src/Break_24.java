public class Break_24 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println(i);
            System.out.println("Java is Great ");
            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
        }
        System.out.println("loop ends here");
    }
}
