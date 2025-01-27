//Program to find out whether a given integer is present in an array or not
public class Array_29_2 {
    public static void main(String[] args) {
        float[] marks = {78.98f, 778.099f, 56.098f, 90.08f};
        float num = 90.08f;
        boolean isInArray = false;
        for (float element : marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("the value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }

    }
}