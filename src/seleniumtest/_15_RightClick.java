package seleniumtest;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _15_RightClick extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/buttons");

        WebElement rightclick = driver.findElement(By.id("rightClickBtn"));

        Actions actions = new Actions(driver);

        Action action = actions.moveToElement(rightclick).contextClick().build(); // contexclick = rightclick
        action.perform();

        WebElement mesaj = driver.findElement(By.id("rightClickBtn"));
        Assert.assertTrue("Right click yapılamadı", mesaj.isDisplayed());

        BekleKapat();
    }
}
