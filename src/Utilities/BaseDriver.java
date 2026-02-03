package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;
    static {
        Logger logger = Logger.getLogger("");  //Konsoldaki logları kontrol eder (gereksiz yazıları azaltır).//
        logger.setLevel(Level.SEVERE);  //sadece ciddi hataları göster//

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        Duration dr = Duration.ofSeconds(30);  //Saniye/dakika gibi bir bekleme süresini “nesne” olarak tutar.//
        driver.manage().timeouts().pageLoadTimeout(dr); //Sayfa yüklenmesi 30 saniyeyi aşarsa timeout hatası verir.//
        driver.manage().timeouts().implicitlyWait(dr); //element hemen bulunamazsa, 30 saniyeye kadar bekleyip tekrar dener.tüm element aramalarına global etki eder. //


    }

    public  static void BekleKapat(){
        MyFunctions.Bekleme(4);
        driver.quit();
    }
}
