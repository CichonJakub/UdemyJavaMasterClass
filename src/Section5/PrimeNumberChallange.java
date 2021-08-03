package Section5;

public class PrimeNumberChallange {

    public static boolean isPrime(int i){
        if(i == 1)
            return false;

        for(int k=2; k < i; k++){
            if(i % k == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        //System.out.println(isPrime(2));

        int primeCounter = 0;
        int number = 1;

        while(primeCounter < 10){
            if(isPrime(number)){
                System.out.println(number);
                primeCounter++;
            }
            number++;
        }

    }

}
