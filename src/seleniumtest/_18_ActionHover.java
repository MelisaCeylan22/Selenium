package seleniumtest;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _18_ActionHover extends BaseDriver {
    @Test
    public void Test(){

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        WebElement gelismis = driver.findElement(By.id("details-button"));
        gelismis.click();
        WebElement gelismis2 = driver.findElement(By.id("proceed-link"));
        gelismis2.click();

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("ali_ak@gmail.com");

        WebElement sifre = driver.findElement(By.id("input-password"));;
        sifre.sendKeys("1234");

        WebElement girisbutonu = driver.findElement(By.cssSelector("input[value='Login']"));
        girisbutonu.click();
        MyFunctions.Bekleme(2);

        WebElement arama = driver.findElement(By.cssSelector("input[name='search']"));
        arama.sendKeys("ipod");

        WebElement aramabutonu = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
        aramabutonu.click();
        MyFunctions.Bekleme(2);

        WebElement ipodtouch = driver.findElement(By.linkText("iPod Touch"));

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(ipodtouch).build();
        action.perform();

        Action action1 = actions.click().build();
        action1.perform();
        MyFunctions.Bekleme(2);

        WebElement description = driver.findElement(By.linkText("Description")); //ekranda o sayfaya geldik mi diye sorgulamak için yazıldı

        Assert.assertTrue("Tıklama İşlemi yapılamadı", description.isDisplayed());
        BekleKapat();
    }
}
