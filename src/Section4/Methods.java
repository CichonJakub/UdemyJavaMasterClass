package Section4;

public class Methods {
    public static void main(String[] args) {
        int score = 500;
        int level = 5;
        int bonus = 123;
        boolean gameOver = true;

        calculatreScore(score, level, bonus, gameOver);
        System.out.println("anoter one method is " + calulateScoreInt(score, level, bonus, gameOver));


        System.out.println("time for a challange acctivity:");
        displayHighScorePosition("Adam", calculateHighScore(10032));
        displayHighScorePosition("Helena", calculateHighScore(600));
        displayHighScorePosition("Runcajs", calculateHighScore(300));
        displayHighScorePosition("Reksio", calculateHighScore(32));

    }

     public static void calculatreScore(int score, int level, int bonus, boolean gameOver){

        if(gameOver == true){
            int finalScore = score + (level * bonus);
            System.out.println("Your score is " + finalScore);
        }

     }


     public static int calulateScoreInt(int score, int level, int bonus, boolean gameOver){
         if(gameOver == true){
             int finalScore = score + (level * bonus);
             return finalScore;
         }else{
             return -1;
         }
     }


     //challange

    public static void displayHighScorePosition(String name, int score){
        System.out.println("Player " + name + " best score is: " + score);
    }

    public static int calculateHighScore(int distance){
        if(distance >= 1000){
            return 1;
        }else if(distance >= 500){
            return 2;
        }else if(distance >= 100){
            return 3;
        }else return 4;

    }

}
