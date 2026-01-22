package seleniumtest.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindById {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); //tam ekranda açılması için fullscreen da olur ama kullanınca ekran büyüyüp tekrar küçüldü
        driver.get("https://form.jotform.com/260212204635040");

        MyFunctions.Bekleme(5);
        driver.quit();
    }
}
