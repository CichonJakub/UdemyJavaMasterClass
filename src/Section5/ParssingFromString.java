package Section5;

import java.sql.SQLOutput;

public class ParssingFromString {

    public static void main(String[] args) {
        String numberAsString = "2021";
        System.out.println("our string is " + numberAsString);

        // parsing string to intiger

        int number = Integer.parseInt(numberAsString);
        System.out.println("parsed number " + number);

        System.out.println("adding 1 to parsed numer " + (number + 1));

        //parsing double
        String numberAsString2 = "2021.123";
        double parsedDouble = Double.parseDouble(numberAsString2);



    }
}
