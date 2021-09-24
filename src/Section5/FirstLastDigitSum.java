package Section5;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        int lastDigit = 0;
        int firstDigit = 0;

        if (number < 0) {
            return  -1;
        }

        int initialNumber = number;

        lastDigit = initialNumber % 10;

        while (initialNumber != 0) {
            if(initialNumber < 10)
                firstDigit = initialNumber;
            initialNumber /= 10;
        }

        System.out.println("First digit is " + firstDigit);
        System.out.println("Last digit is "  + lastDigit);
        System.out.println("Their sum is " + (lastDigit + firstDigit));

        return lastDigit + firstDigit;

    }

    public static void main(String[] args) {
        sumFirstAndLastDigit(14123);
    }
}
