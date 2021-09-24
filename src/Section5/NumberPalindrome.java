package Section5;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        int reverse = 0;
        if (number < 0){
            number *= -1;
        }

        int initialNumber = number;
        System.out.println("initial number is : " + initialNumber);


        while(initialNumber != 0){
            if(initialNumber != number)
                reverse *= 10;

            int lastDigit = initialNumber % 10;
            initialNumber /= 10;
            reverse += lastDigit;
            System.out.println("temp reverse is: " + reverse);
        }
        System.out.println("final reverse is " + reverse);

        if(number == reverse)
            return true;
        else return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12121));
    }


}
