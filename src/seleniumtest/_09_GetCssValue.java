package seleniumtest;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _09_GetCssValue extends BaseDriver { //css değerleri ile bulma//

    public static void main(String[] args) {
        driver.get("https://www.hepsiburada.com/");

        WebElement searchBox = driver.findElement(By.cssSelector("input[type='search']"));
        System.out.println("searchBox.getAttribute(\"class\") = " + searchBox.getAttribute("class"));

        System.out.println("searchBox.getCssValue(\"color\") = " + searchBox.getCssValue("color"));
        System.out.println("searchBox.getCssValue(\"font-size\") = " + searchBox.getCssValue("font-size"));
        System.out.println("searchBox.getCssValue(\"fount-style\") = " + searchBox.getCssValue("fount-style"));

        BekleKapat();
    }
}
