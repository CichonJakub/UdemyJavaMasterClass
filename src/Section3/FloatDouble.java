package Section3;

public class FloatDouble {

    public static void main(String[] args) {
        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;
        System.out.println("Float min value is: "   + floatMin + "and max is: " + floatMax);

        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;
        System.out.println("double min value is: "   + doubleMin + "and max is: " + doubleMax);


        int myInt = 5;
        float myFloat = 5;  //5f to confirm it is flaot
        float myFloat2 = 5.25f;
        float myFloat3 = (float) 5.25;
        double myDouble = 5; //5d to confirm it is double
        double myDouble2 = 5.25d;

        // default data type with point precision . is double, like for integers it is int :)


        int myInt_ = 5 / 3; // thre rest after division will be lost
        float myFloat_ = 5f / 3;  //7 number of precision
        double myDouble_ = 5d / 3; // 16 number of precision
        System.out.println("Int: " + myInt_);
        System.out.println("Float: " + myFloat_);
        System.out.println("Double: " + myDouble_);
}

}
