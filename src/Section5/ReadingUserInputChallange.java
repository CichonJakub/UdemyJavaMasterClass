package Section5;

import java.util.Scanner;

public class ReadingUserInputChallange {
    public static void main(String[] args) {
        int numbers = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while(numbers < 10){

            System.out.println("Input " + (numbers + 1) + " number: ");
            boolean isInt = scanner.hasNextInt();

            if(isInt){
                int userVariable = scanner.nextInt();
                sum += userVariable;
                numbers++;

            } else{
                System.out.println("Invalid value");
            }
            scanner.nextLine(); // to avoid endless loop, scanner is proceeding to next line
        }
        scanner.close();
        System.out.println("Sum of all input values is: " + sum);
    }
}
