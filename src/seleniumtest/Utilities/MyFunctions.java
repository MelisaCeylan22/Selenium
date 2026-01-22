package seleniumtest.Utilities;

public class MyFunctions {

    public static void Bekleme(int s) {
        try {
            Thread.sleep(1000*s);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }
}
