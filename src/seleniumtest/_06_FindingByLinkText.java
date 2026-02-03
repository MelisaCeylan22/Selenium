package seleniumtest;

import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement kampanyalar = driver.findElement(By.linkText("Kampanyalar"));
        System.out.println("kampanyalar.getText() = " + kampanyalar.getText());

        System.out.println("kampanyalar.getAttribute(\"href\") = " + kampanyalar.getAttribute("href"));
        System.out.println("kampanyalar.getAttribute(\"href\") = " + kampanyalar.getAttribute("title"));
        System.out.println("kampanyalar.getAttribute(\"href\") = " + kampanyalar.getAttribute("style"));

        WebElement superteklif = driver.findElement(By.partialLinkText("Süper Teklif"));  //parçalı linkten linktexti bulma//
        System.out.println("superteklif.getText() = " + superteklif.getText());

        MyFunctions.Bekleme(4);
        driver.quit();


    }
}
