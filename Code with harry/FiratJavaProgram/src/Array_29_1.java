//Create an array of 5 floats and calculate there sum
public class Array_29_1 {
    public static void main(String[] args) {
        float [] marks = {34.55f,54.44f,87.56f,100f,76.707f};
        float sum = 0;
        for(float element:marks){
            sum = sum+ element;
        }
        System.out.println("The value of sum is " + sum);
    }
}
