package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import SeleniumPackage.Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _24_Alert2 extends BaseDriver {

    @Test
    public void Test(){
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");

        //p içersinde a'ya erişemiyorum locater'ı bulamıyorum uğraş! --> Actions üret click'i action üzerinden yap.
        WebElement clickMe2= driver.findElement(By.cssSelector("p:nth-of-type(5) > a"));


        //Bulduğumuz elemente tıkladık.
        clickMe2.click();

        MyFunctions.Wait(2);
        //çıkan alert'i reddeddik(cancel, iptal, hayır)
        driver.switchTo().alert().dismiss();

        WaitAndClose();



    }
}
