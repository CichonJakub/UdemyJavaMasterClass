package Section4;

public class Overloading {

    public static void main(String[] args) {

        overloadedMethod(1, "hjahah");
        overloadedMethod("ahdsadasdasd", 4);

    }


    public static void  overloadedMethod(int a, String c){
        System.out.println("method with int and String");
    }

    public static void overloadedMethod(String c, int a){
        System.out.println("method with String and ing");
    }


}
