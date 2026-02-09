package seleniumtest;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _17_DragAndDropBy extends BaseDriver {
    @Test // bu fonksiyona test özelliğini atıyoruz
    public void Test(){
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement fiyataralik = driver.findElement(By.id("amount"));
        System.out.println("fiyataralik.getText() = " + fiyataralik.getText());
        String mesaj1 = fiyataralik.getText();

        Actions actions = new Actions(driver);

        WebElement solkol = driver.findElement(By.cssSelector("div#slider-range > *:nth-child(2)"));

        Action action = actions.dragAndDropBy(solkol, 50, 0).build();
        action.perform();

        System.out.println("fiyataralik.getText() = " + fiyataralik.getText());

        String mesaj2 = fiyataralik.getText();
        Assert.assertFalse("Eşit geldi", mesaj1.equals(mesaj2));

        BekleKapat();

    }
}
