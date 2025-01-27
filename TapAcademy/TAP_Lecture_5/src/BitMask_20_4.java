public class BitMask_20_4{
    public static void main(String[] args) {
        int n = 36;
        int i = 5;

        int cmask = 1 << i;

        if((n & cmask) == 0){
            System.out.println("Off");
        }else{
            System.out.println("On");
        }
    }
}
