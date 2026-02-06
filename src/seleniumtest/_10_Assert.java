package seleniumtest;

import Utilities.BaseDriver;
import com.sun.jdi.PathSearchingVirtualMachine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _10_Assert extends BaseDriver {

        /*
    1. adrese git
    2. Açılan sayfada textbox var bu alana mesajı gir
    3. Gönder butonuna tıkla
    4. Butona tıkladıktan sonra çıkan mesajın göründüğünü test ile kontrol et
    locator'ları  css ile bul
     */

    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/");

        String isim ="Melisa";
        WebElement textbox = driver.findElement(By.cssSelector("input[class='input_error form_input']"));
        textbox.sendKeys(isim);

        WebElement button = driver.findElement(By.cssSelector("input[type='submit']"));
        button.click();

        WebElement assertmesaj = driver.findElement(By.cssSelector("div.error-message-container.error h3[data-test='error']"));

        if(assertmesaj.getText().equals("Epic sadface: Password is required")) {

            System.out.println("Test Başarılı");
        }else{

            System.out.println("Başaramadık Abi");


        }
        BekleKapat();
    }
}
