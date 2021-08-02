package Section4;

public class Exercise1 {

    public static long toMilesPerHour(double kilometersPerHour) {
        //double oneKmIsMile = 0.621371; // one km is 0.6 .. miles
        double oneMileIsKm = 1.609; // one mile is 1,6 .. kilometers
        if (kilometersPerHour < 0)
            return -1;
        else{
            //long speedInMiles = (long) (kilometersPerHour * oneKmIsMile);
            double result = kilometersPerHour / oneMileIsKm;
            long roundedResult = Math.round(result);
            return roundedResult;
        }
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0)
            System.out.println("Invalid Value");
        else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }


    public static void main(String[] args) {
        System.out.println(toMilesPerHour(25.42));

        printConversion(25.42);

        printConversion(-2);

    }
}
