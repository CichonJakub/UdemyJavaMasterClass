package Section5;

public class SharedDigit {

    public static boolean hasSharedDigit(int one, int two){

        if(one < 10 || one > 99 || two < 10 || two > 99){
            return false;
        }

        int firstInOne = one % 10;
        int secondInOne = one / 10;
        System.out.println(firstInOne);
        System.out.println(secondInOne);

        int firstInTwo = two % 10;
        int secondInTwo = two / 10;
        System.out.println(firstInTwo);
        System.out.println(secondInTwo);

        if(firstInOne == firstInTwo || firstInOne == secondInTwo || secondInOne == firstInTwo || secondInOne == secondInTwo)
            return true;
        else return false;

    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 43));

    }

}
