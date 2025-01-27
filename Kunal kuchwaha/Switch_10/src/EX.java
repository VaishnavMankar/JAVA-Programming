import java.util.Scanner;

public class EX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid");
        }
    }
}