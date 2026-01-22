package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Utilities.MyFunctions;

public class _01_OpeningWebSite {
    public static void main(String[] args) {
        WebDriver drive = new ChromeDriver();
        drive.get("https://melisaceylan22.github.io/Vintora/index.html");
        MyFunctions.Bekleme(5);
        drive.quit();
    }
}
