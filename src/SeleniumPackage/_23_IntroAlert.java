package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import SeleniumPackage.Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _23_IntroAlert extends BaseDriver {

    @Test
    public void Test(){
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");

        WebElement clickMe1= driver.findElement(By.cssSelector("p:nth-of-type(2) > a"));

        clickMe1.click();
        MyFunctions.Wait(2);
        driver.switchTo().alert().accept();
        WaitAndClose();
    }
}
