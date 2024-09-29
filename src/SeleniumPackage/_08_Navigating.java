package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import SeleniumPackage.Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_Navigating extends BaseDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.eviltester.com/styled/index.html");

        WebElement element = driver.findElement(By.id("fakealerttest"));
        element.click();
        MyFunctions.Wait(2);

        System.out.println("driver.getCurrentUrl()"+driver.getCurrentUrl()); //o anki url

        MyFunctions.Wait(3);

        driver.navigate().back(); //bi geri url'e gider
        System.out.println("driver.getCurrentUrl()"+driver.getCurrentUrl()); //o anki url

        driver.navigate().forward(); //bi ileri url'e gider.
        System.out.println("driver.getCurrentUrl()"+driver.getCurrentUrl()); //o anki url

        WaitAndClose();

    }
}
