package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import SeleniumPackage.Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _22_YonTuslari extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://demoqa.com/auto-complete");
        WebElement singleTextBox = driver.findElement(By.id("autoCompleteSingleContainer"));
        Actions actions = new Actions(driver);
        Action action =actions.moveToElement(singleTextBox).click().sendKeys("a").build();
        action.perform();

        MyFunctions.Wait(2);


    }
}
