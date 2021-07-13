package Section3;

public class Main {
    //primitive data types like int, byte, shor, long

    public static void main(String[] args) {
        int myIntValue = 128128;
        int intMin = Integer.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;
        System.out.println("Int min value= " + intMin + "\nand int max value is: " + intMax);

        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("Byte min value= " + byteMin + "\nand byte max value is: " + byteMax);

        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        System.out.println("Shor min value= " + shortMin + "\nand short max value is: " + shortMax);

        long myLong = 100L;
        Long longMax = Long.MAX_VALUE;
        Long longMin = Long.MIN_VALUE;
        System.out.println("Long min value= " + longMin + "\nand Long max value is: " + longMax);


        int myTotal = (myIntValue / 2);
        System.out.println(myTotal);

        byte myNewByte = (byte) (byteMin / 2); // casting exampe --- (type) (expresion that gives ,,type'' result)
        System.out.println(myNewByte);

        short myNewShort = (short) (shortMin / 2);
        System.out.println(myNewShort);

    }
}
