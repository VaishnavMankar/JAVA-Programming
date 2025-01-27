import java.util.HashSet;

public class LonelyInteger_24_2 {
    public static void main(String[] args) {

    }
    static int lonely(int[] arr){
        HashSet<Integer> s = new HashSet<>();
        for(int i : arr){
            if(s.contains(i)){
                s.remove(i);
            }else {
                s.add(i);
            }
        }
        for(int i : s){
            return i;
        }
        return -1;
    }
}