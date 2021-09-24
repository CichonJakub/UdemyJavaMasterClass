package Section5;

public class NumberToWords {


    public static int reverse(int a){
        int initialVal = a;
        int reverse = 0;
        while(a != 0){
            if(a != initialVal){
                reverse *= 10;
            }
            int lastDigit = a % 10;
            a /= 10;
            reverse += lastDigit;
        }
        System.out.println("Reverse to: " + initialVal + " is " + reverse);
        return reverse;
    }


    public static int getDigitCount(int digit){
        int digitCount = 0;
        int initialDigit = digit;
        if(digit == 0)
            return 1;
        if(digit < 0)
            return -1;

        while(digit != 0){
            digit /= 10;
            digitCount++;
        }
        System.out.println("Digit " + initialDigit + " is " + digitCount + " digits long");
        return digitCount;
    }

    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
            return;
        }

        int digCount = getDigitCount(number);
        int reverseNumber = reverse(number);


        while(digCount != 0){
            int printedDigit = reverseNumber % 10;
            reverseNumber /= 10;
            digCount--;

            switch(printedDigit){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 0:
                    System.out.println("Zero");
                    break;
                default:
                    System.out.println("Error, not know value");
                    break;

        }

        }

    }


    public static void main(String[] args) {
        numberToWords(123);
    }







}
