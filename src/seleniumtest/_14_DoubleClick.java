package seleniumtest;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _14_DoubleClick extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/buttons");

        WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(doubleclick).doubleClick().build();

        action.perform();

        MyFunctions.Bekleme(2); //tıkladıktan sonra mesaj hemen çıkmayabilir o yüzden

        WebElement mesaj = driver.findElement(By.id("doubleClickMessage"));
        Assert.assertTrue("Double Click Yapılamadı", mesaj.isDisplayed());
        BekleKapat();
    }
}
