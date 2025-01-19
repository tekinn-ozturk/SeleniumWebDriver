package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import SeleniumPackage.Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _31_ScrollToWebElement extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        MyFunctions.Wait(3);
        WebElement element = driver.findElement(By.name("nested_scrolling_frame"));
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        //false--> elementi sayfanın üstüne hizalar.
        //true--> elementi sayfanın altına hizalar.

        WaitAndClose();
    }
}
