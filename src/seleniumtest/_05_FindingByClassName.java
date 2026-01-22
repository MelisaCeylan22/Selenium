package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Utilities.MyFunctions;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/260212204635040");

        WebElement name = driver.findElement(By.className("form-textbox"));
        name.sendKeys("Melisa Ceylan");

        List<WebElement> ortakclassname = driver.findElements(By.className("form-sub-label"));
        System.out.println(ortakclassname.size());

        for (
                WebElement e:ortakclassname
        ) {
            System.out.println("e.getText() = "+ e.getText());
        }

        MyFunctions.Bekleme(4);
        driver.quit();
    }
}
