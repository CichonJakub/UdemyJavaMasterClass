package Section5;

import java.util.Scanner;

public class MinAndMaxInput {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("Enter value: ");
            boolean isInt = scanner.hasNextInt();

            if(isInt){
                int userVariable = scanner.nextInt();
                if(userVariable < min){
                    min = userVariable;
                } else if(userVariable > max){
                    max = userVariable;
                }

            } else{
                System.out.println("Invalid value");
                break;
            }
            scanner.nextLine(); // to avoid endless loop, scanner is proceeding to next line
        }
        scanner.close();
        System.out.println("Min number is: " + min + " and max number is: " + max);
    }
}
