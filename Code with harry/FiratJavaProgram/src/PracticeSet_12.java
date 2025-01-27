//write program to encrypt a grade by adding 8 to it.
//Describe it to show the correct grade.
/* b+s= int                       b = byte
   s+i= int                       s = short
   l+f= float                     i = integer
   i+f= float                     l = long
   c+i= int                       f = float
   c+s= int                       d = double
   l+d= double                    c = character
   f+d= double
*/
public class PracticeSet_12 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
