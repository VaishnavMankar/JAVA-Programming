import java.util.Scanner;

public class Case_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your fruit: ");
        String fruit = sc.next();

        switch(fruit){
            case "Apple":
                System.out.println("An sweet read fruit");
                break;
            case "Orange":
                System.out.println("An tangi fruit");
                break;
            case "Mango":
                System.out.println("An yellow king of fruit");
                break;
            case "Grapes":
                System.out.println("A small byte off fruit");
                break;
            default:
                System.out.println("Invalid fruit!");
        }
    }
}
