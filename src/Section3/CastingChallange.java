package Section3;

public class CastingChallange {
    public static void main(String[] args) {

        byte myByte = 123;
        short myShort = 71;
        int myInt = 19216811;

        //with casting
        long myLong = (long) (50000 + 10 * (myByte + myInt + myShort));
        System.out.println("my long is : " + myLong);

        //way without casting
        long noCasting = 5000L + 10L * (myByte + myInt + myShort);
        System.out.println("long with no casting is : " + noCasting);

        if(noCasting == myLong)
            System.out.println("the two previous values are equal");
    }
}
