package Section5;

import java.util.Scanner;

public class ScanningInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); // reading input name

        System.out.println("Your name is: " + name);

        scanner.close();
    }


}
