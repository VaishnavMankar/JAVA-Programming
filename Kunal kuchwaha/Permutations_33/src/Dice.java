import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
//        disc("", 4);
        System.out.println(discRet("", 4));
    }
    static void disc(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i <= 6 && i <= target; i++){
            disc(p + i, target - i);
        }
    }
    static ArrayList<String> discRet(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++){
            list.addAll(discRet(p + i, target - i));
        }
        return list;
    }
    static void discFace(String p, int target,int face){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i <= face && i <= target; i++){
            discFace(p + i, target - i,face);
        }
    }
    static ArrayList<String> discFaceRet(String p, int target,int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(discFaceRet(p + i, target - i,face));
        }
        return list;
    }
}
