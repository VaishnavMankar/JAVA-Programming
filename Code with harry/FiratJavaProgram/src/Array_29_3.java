//Calculate the average marks form array containing marks of all student in physics using for each loop
public class Array_29_3 {
    public static void main(String[] args) {
        float[] marks = {78.98f, 77.099f, 56.098f, 90.08f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println(sum);
        System.out.println("the value of average marks is " + sum/marks.length);
    }
}
