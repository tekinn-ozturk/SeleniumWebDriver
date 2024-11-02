package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import SeleniumPackage.Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class _25_Alert3 extends BaseDriver {
    @Test
    public void Test() {

        //p içersinde a'ya erişemiyorum locater'ı bulamıyorum uğraş! --> Actions üret click'i action üzerinden yaptık ancak bu sefer Prompt giremiyorum.
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
        WebElement clickMe3 = driver.findElement(By.cssSelector("p:nth-of-type(8) > a"));
        //bulduğumuz elementi Actions üzerinden click'ledik.
        Actions actions = new Actions(driver);
        Action action=actions.moveToElement(clickMe3).click().build();
        action.perform();

        MyFunctions.Wait(2);

        //çıkan alert içersine sendKeys ile Tekin yazdırdık.(yazdıramadık)
        driver.switchTo().alert().sendKeys("Tekin");
        MyFunctions.Wait(2);
        //çıkan alert'i kabul ettik(Tamam,Ok,Onayla)
        driver.switchTo().alert().accept();


        WaitAndClose();

    }
    }
