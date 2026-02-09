package seleniumtest;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _13_Action extends BaseDriver {
    @Test
    public void Test(){

        driver.get("https://demoqa.com/buttons");

        WebElement clickme = driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(clickme).click().build();
        System.out.println("Aksiyonu tanımladım ve yapılandırdım");


        action.perform();
        System.out.println("Aksiyonu tamamladım");


        WebElement mesaj = driver.findElement(By.id("dynamicClickMessage"));

        Assert.assertTrue("Click işlemi yapılamadı", mesaj.isDisplayed());
        //bu kısımda mesajı sayfadaki reklam kapatıyor o yüzden test mesajı yakalayamıyor, test başarısız oluyor

        BekleKapat();


    }

}
