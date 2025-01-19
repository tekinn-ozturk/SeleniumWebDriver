package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import SeleniumPackage.Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Wait;

public class _30_ScrollBottomOfThePage extends BaseDriver {

    @Test
    public void Test(){
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        MyFunctions.Wait(3);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        MyFunctions.Wait(3);
        js.executeScript("window.scrollTo(0,0)");

        WaitAndClose();
    }
}
