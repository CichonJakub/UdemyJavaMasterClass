package Section4;

public class Exercise2 {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
       // 1MB = 1024 KB
       if(kiloBytes < 0)
           System.out.println("Invalid Value");
       else {
               int divider = 1024;
               int megaBytest = kiloBytes / divider;
               int moduloKiloBytes = kiloBytes % divider;

               System.out.println(kiloBytes + " KB = " + megaBytest + " MB and " + moduloKiloBytes + " KB");
       }
    }


    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(-1024);
    }
}
