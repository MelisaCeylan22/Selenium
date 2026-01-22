package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Utilities.MyFunctions;

public class _02_FindById {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); //tam ekranda açılması için fullscreen da olur ama kullanınca ekran büyüyüp tekrar küçüldü
        driver.get("https://form.jotform.com/260212204635040");

        WebElement name = driver.findElement(By.id("first_3"));
        name.sendKeys("Melisa");
        WebElement surname = driver.findElement(By.id("last_3"));
        surname.sendKeys("Ceylan");
        WebElement email = driver.findElement(By.id("input_4"));
        email.sendKeys("melisa@gmail.com");
        WebElement phone = driver.findElement(By.id("input_5_full"));
        phone.sendKeys("5319940523");
        phone.sendKeys(Keys.TAB); //bu alanı doldurdum, çıkıyorum sinyali

        WebElement button = driver.findElement(By.id("input_2"));
        button.click();

        MyFunctions.Bekleme(4);
        driver.quit();
    }
}
