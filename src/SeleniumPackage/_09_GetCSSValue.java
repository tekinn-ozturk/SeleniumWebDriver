package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _09_GetCSSValue extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://snapdeal.com/");

        WebElement searchBox = driver.findElement(By.cssSelector("#inputValEnter"));

        System.out.println("getAttribute "+searchBox.getAttribute("class"));

        System.out.println("color "+searchBox.getCssValue("color"));
        System.out.println("font-size "+searchBox.getCssValue("font-size"));
        System.out.println("background-color "+searchBox.getCssValue("background-color"));


        WaitAndClose();
        
    }

}
