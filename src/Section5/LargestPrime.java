package Section5;
import static Section5.PrimeNumberChallange.isPrime;


public class LargestPrime {
//----------------------------- version with import - not for udemy but simpl

//    public static int getLargestPrime(int number){
//        if(number <= 0)
//            return -1;
//        int largestPrime = 0;
//        for(int i = 1; i < number; i++){
//            if(isPrime(i) && number % i ==0)
//                largestPrime = i;
//        }
//        return largestPrime;
//    }
//----------------------------


        public static int getLargestPrime(int number){
        if(number <= 0)
            return -1;
        if(number == 1)
            return -1;

        int largestPrime = 0;

        for(int i = 2; i <= number; i++){
            boolean isPrime = true;
            for(int k=2; k < i; k++){
                if(i % k == 0){
                    isPrime = false;
                }
            }
            if(isPrime && number % i == 0){
                largestPrime = i;
            }
        }
        return largestPrime;
    }





}
