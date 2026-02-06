package seleniumtest;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _12_Select extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.amazon.com.tr/");

        WebElement kategori = driver.findElement(By.id("searchDropdownBox"));
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));

        Select kategorimenü = new Select(kategori);
        //kategorimenü.selectByVisibleText("Bilgisayarlar");
        //kategorimenü.selectByIndex(4);
        kategorimenü.selectByValue("search-alias=computers");

        searchbox.sendKeys("macbook");
        MyFunctions.Bekleme(3);

        WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
        searchbutton.click();

        String urlgüncel = driver.getCurrentUrl();

        Assert.assertTrue("macbook sayfasına gidilmedi", urlgüncel.toLowerCase().contains("macbook"));
        //Assert.assertTrue("macbook sayfasına gidilemedi", urlGuncel.contains(searchBox.getText())); bu işlem hata verdi.
        // Sebebi de amazon searchbox içerisinde yazılan yazıyı html kodunda yakalayamıyoruz.

        BekleKapat();
    }
}
