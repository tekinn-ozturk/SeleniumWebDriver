package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import SeleniumPackage.Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _32_JavascriptExecuteClickMethod extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://www.copado.com/robotic-testing");
        WebElement watchLink = driver.findElement(By.xpath("//a[@href='https://trailhead.salesforce.com/content/learn/modules/copado-robotic-testing-for-salesforce']//div[@class='button-text-with-right-icon']"));
        MyFunctions.Wait(2);
        //watchLink.click();
        // yukarıdaki yöntem pop-up falan çıktığında çalışmayabiliyor.

        // Herhangi bir pop-up, uyarı gibi şeylere aldırış etmeden eylemi gerçekleştirme yeteneğine sahip olan javascrptexecute sınıfını kullanırsak daha iyi olur.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",watchLink);
        MyFunctions.Wait(2);
        WaitAndClose();



    }
}

