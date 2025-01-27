import java.util.Scanner;

public class Example_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1,m2,m3;
        System.out.println("Enter your marks in Physics");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in Mathematics");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your overall average is: " +avg);
        if(avg>30 && m1>33 && m2 > 33 && m3> 33){
            System.out.println("Congratulations, you are promoted");
        }else{
            System.out.println("Sorry, you have not been promoted! Please try again.");
        }
    }
}
