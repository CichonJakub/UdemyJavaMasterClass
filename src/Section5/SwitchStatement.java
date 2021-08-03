package Section5;

public class SwitchStatement {

    public static void main(String[] args) {
//        int value = 1;
//
//        if(value == 1){
//            System.out.println("1");
//        } else if ( value == 2)
//            System.out.println("2");
//        else {
//            System.out.println("sth different than 1 or 2");
//        }


        int switchValue = 1;
        switch(switchValue){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println('2');
                break;
            case 3: case 4: case 5:
                System.out.println("3/4/5");
                break;
            default:
                System.out.println("sth different than 1 or 2");
                break;
        }

        char letter = 'D';
        switch(letter){
            case 'A':
                System.out.println("It is A");
                break;
            case 'B':
                System.out.println("It is B");
                break;
            case 'C':
                System.out.println("It is C");
                break;
            case 'D':
                System.out.println("It is D");
                break;
            case 'E':
                System.out.println("It is E");
                break;
            default:
                System.out.println("it it some letter after E");

        }





    }
}
