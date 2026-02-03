package seleniumtest;

import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_Navigating extends BaseDriver { //Sayfada ileri geri gezebiliyorum bir önceki sayfaya dönebiliyorum vs//

    public static void main(String[] args) {
        driver.navigate().to("https://testpages.eviltester.com/pages/index.html");

        WebElement element = driver.findElement(By.linkText("Basics"));
        element.click();

        MyFunctions.Bekleme(2);
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); //tarayıcının o an açık olduğu sayfanın URL’sini verir//
        MyFunctions.Bekleme(2);

        driver.navigate().back(); //geri gitme//
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        MyFunctions.Bekleme(2);
        
        driver.navigate().forward(); //ileri gitme//
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        BekleKapat();
    }

}
