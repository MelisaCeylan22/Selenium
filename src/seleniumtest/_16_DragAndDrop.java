package seleniumtest;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _16_DragAndDrop extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://codepen.io/EpsilonDeltaCriterion/full/jLoPgE");
        Actions actions = new Actions(driver);

        WebElement roma = driver.findElement(By.cssSelector("#box6"));
        WebElement italya = driver.findElement(By.cssSelector("#box106"));
        System.out.println(roma.getCssValue("background-color"));

        //1. yöntem
        actions.clickAndHold(roma).build().perform(); //tıkla ve basılı tut
        actions.moveToElement(italya).release().build().perform(); //bu elemente taşı

        //2. yöntem
       // actions.dragAndDrop(roma, italya);

        System.out.println(roma.getCssValue("background-color"));
        Assert.assertTrue("Roma gitmekte inat etti", roma.getCssValue("background-color").equals("rgb(0, 255, 0)"));

        //test yapılan site kapanmış test edemedim bu siteden de olmadı

        BekleKapat();
    }
}
