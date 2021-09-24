package Section5;

public class FlourPack {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0 )
            return false;
        else if( 5 * bigCount + smallCount < goal)
            return false;
        else{

            while(goal / 5 != 0 && bigCount != 0 ){
                goal -= 5;
                bigCount--;
            }
            while(goal != 0 && smallCount != 0){
                goal--;
                smallCount--;
            }
            if(goal == 0){
                return true;
            } else return false;
        }
    }
}
