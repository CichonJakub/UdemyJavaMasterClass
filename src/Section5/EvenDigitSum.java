package Section5;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }

        int sum = 0;
        int tempNumber = number;
        while(tempNumber > 0){
            int lastDigit = tempNumber % 10;
            if(lastDigit % 2 == 0){
                sum += lastDigit;
            }
            tempNumber /= 10;
        }

        return sum;

    }

}
