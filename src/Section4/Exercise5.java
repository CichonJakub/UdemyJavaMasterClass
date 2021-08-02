package Section4;

public class Exercise5 {
    public static boolean areEqualByThreeDecimalPlaces(double var1, double var2){
        double divider = 0.001;
        int newVar1 = (int) (var1 * 1000);
        int newVar2 = (int) (var2 * 1000);

        if(newVar1 == newVar2){
            return true;
        } else return false;
    }


    public static void main(String[] args) {
        System.out.println(11 / 6 );
    }
}
