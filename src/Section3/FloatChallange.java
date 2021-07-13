package Section3;

public class FloatChallange  {

    public static void convertion(String s, double amount){

        double variable = 0.45359232;
        if(s.equals("pd")){
            double result = amount * variable;
            System.out.println(amount + " pounds is equal to: " + result + " kilograms");
        }
        else if(s.equals("kg")){
            double result = amount / variable;
            System.out.println(amount + " kilograms is equal to: " + result + " pounds");
        }
    }


    public static void main(String[] args) {
        convertion("pd", 23);
        convertion("kg", 10.43262336);
    }


}
