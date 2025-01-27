import java.util.Scanner;

public class Example_19_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in Lakhs per annum");
        float incom = sc.nextFloat();
        float tax = 0;

        if(incom <= 2.5){
            tax = tax + 0;
        }
        else if(incom>2.5f && incom<=5f){
            tax = tax + 0.05f * (incom - 2.5f);
        }
        else if(incom>5f && incom<=10.0f){
            tax = tax + 0.05f * (incom - 2.5f);
            tax = tax + 0.2f * (incom - 5f);
        }
        else if(incom > 10.0f){
            tax = tax + 0.05f * (incom - 2.5f);
            tax = tax + 0.2f * (incom - 5f);
            tax = tax + 0.3f * (incom - 10.0f);
        }
        System.out.println(" Tax payed by the employee is " + tax);
    }
}
