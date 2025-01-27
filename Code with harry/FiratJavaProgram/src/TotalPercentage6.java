//the video number is 6 and the solution in comment box

import java.util.Scanner;

public class TotalPercentage6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        //System.out.println("Enter the total marks of exam");
        //int total_mark = sc.nextInt();
        System.out.println("Enter the marks in Maths");
        int aa = sc.nextInt();
        System.out.println("Enter the marks in Physics");
        int bb = sc.nextInt();
        System.out.println("Enter the marks in Chemistry");
        int cc = sc.nextInt();
        System.out.println("enter the marks in Marathi");
        int dd = sc.nextInt();
        float sum = aa+bb+cc+dd;
        float per = (sum/400)*100;
        System.out.println(name + " got= " + per + "% in aissce");
    }
}
