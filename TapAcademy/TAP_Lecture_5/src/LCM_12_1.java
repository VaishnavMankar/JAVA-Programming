import java.util.Scanner;

public class LCM_12_1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(findLcm(a,b));
        }
        static int findLcm(int a,int b){
            int rec = Math.max(a,b);
            while(true){
                if(rec%a == 0 && rec%b == 0){
                    break;
                }
                rec++;
            }
            return rec;
        }
}
