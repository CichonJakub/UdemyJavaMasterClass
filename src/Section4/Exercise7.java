package Section4;

public class Exercise7 {

    public static boolean hasTeen(int a, int b, int c){
        if(isTeen(a) || isTeen(b) || isTeen(c))
            return true;
        else return false;
    }

    public static boolean isTeen(int a) {
        if (a <= 19 && a >= 13)
            return true;
        else return false;
    }

}
