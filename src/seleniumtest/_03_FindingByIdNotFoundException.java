package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Utilities.MyFunctions;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/260212204635040");

        try {
            WebElement name = driver.findElement(By.id("hatalı"));

        } catch (Exception e) {
            System.out.println("WebElement Locator Hatası " +e.getMessage());
        }


        MyFunctions.Bekleme(4);
        driver.quit();
    }
}
