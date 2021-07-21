package Section3;

public class OperatorsChallange {
    public static void main(String[] args) {
        double var = 20.00d;
        double var2 = 80.00d;
        double result = (var + var2) * 100.00d;

        double rest = result % 40.00d;

        boolean condition = rest == 0 ? true : false;

        System.out.println("my condition is: " + condition);

        if(!condition)
            System.out.println("Got some reminder");

    }
}
