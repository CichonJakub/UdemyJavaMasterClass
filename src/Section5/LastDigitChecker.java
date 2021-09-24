package Section5;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int one, int two, int three){
        if(!isValid(one) || !isValid(two) || !isValid(three))
            return false;
        int digOne = one % 10;
        int digTwo = two % 10;
        int digThree = three % 10;

        if(digOne == digTwo || digOne == digThree || digTwo == digThree)
            return true;
        else return false;
    }

    public static boolean isValid(int x){
        if(x < 10 || x > 1000)
            return false;
        return true;
    }

}
