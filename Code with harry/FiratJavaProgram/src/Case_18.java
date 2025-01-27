import java.util.Scanner;

public class Case_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("You are going to be an  adult!");
                break;
            case 23:
                System.out.println("You are going to join a Job");
                break;
            case 68:
                System.out.println("You are going to get retired");
                break;
            default:
                    System.out.println("Enjoy your life");

        }
        System.out.println("Thanks for using my java code");
    }
}
