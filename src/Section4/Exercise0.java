package Section4;

public class Exercise0 {

    public static void checkNumber(int i){
        if(i > 0)
            System.out.println("Number is grater than 0 -- positive");
        else if(i < 0)
            System.out.println("Number is lowet than 0 -- negative");
        else System.out.println("Number is equal to 0 -- it is 0");
    }

    public static void main(String[] args) {
        checkNumber(-11);
        checkNumber(3123);
        checkNumber(0);

    }
}
