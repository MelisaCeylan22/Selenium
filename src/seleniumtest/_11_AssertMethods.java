package seleniumtest;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test; //kütüphaneyi ekledik//
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//pozitif test, negatif test

public class _11_AssertMethods extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.saucedemo.com/");

        String isim ="Melisa";
        WebElement textbox = driver.findElement(By.cssSelector("input[class='input_error form_input']"));
        textbox.sendKeys(isim);

        WebElement button = driver.findElement(By.cssSelector("input[type='submit']"));
        button.click();

        WebElement assertmesaj = driver.findElement(By.cssSelector("div.error-message-container.error h3[data-test='error']"));

        Assert.assertTrue("İsim ile sonuç uyuşmadı", assertmesaj.getText().equals("Epic sadface: Password is required"));
        //Assert.assertFalse("İsim ile sonuç uyuşmadı", assertmesaj.getText().equals("Epic sadface: Password is required"));

        BekleKapat();
    }
}
