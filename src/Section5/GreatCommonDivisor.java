package Section5;

public class GreatCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int secound){
        if(first < 10 || secound < 10)
            return -1;

        int greaterNumber = 0;
        if(first > secound)
            greaterNumber = first;
        else greaterNumber = secound;

        int commonDivisor = 0;

        for(int i = 1; i <= greaterNumber; i++){
            if(first % i == 0 && secound % i == 0){
                commonDivisor = i;
            }
        }
        return commonDivisor;
    }



}
