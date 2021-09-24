package Section5;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        long average = 0;
        int sum = 0;
        int counter = 0;

        while(true){
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int variable = scanner.nextInt();
                sum += variable;
                counter++;
            } else{
                if(counter == 0){
                    System.out.println("SUM = 0 AVG = 0");
                    break;
                } else{
                    double avg = ((double) sum) / counter; // casting to double to get not int result of dividing
                    average = Math.round(avg);

                    System.out.println("SUM = " + sum + " AVG = " + average);
                    break;
                }
            }
            scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
