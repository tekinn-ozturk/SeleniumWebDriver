package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import SeleniumPackage.Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _29_Scroll extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        MyFunctions.Wait(3);
        //scrollTo(a,b) --> a, x yönünde; b, y yönünde scroll yapmaya yarar.
        js.executeScript("window.scrollTo(0,1000);");
        MyFunctions.Wait(3);
        js.executeScript("window.scrollBy(0,500);");

        MyFunctions.Wait(3);
        js.executeScript("window.scrollBy(0,-300);");

        WaitAndClose();
    }

}
