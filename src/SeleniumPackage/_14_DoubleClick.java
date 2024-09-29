package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _14_DoubleClick extends BaseDriver {
    @Test
    public void Test(){

        driver.get("https://demoqa.com/buttons");
        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(doubleClick).doubleClick().build();

        action.perform();

        WebElement doubleClickMessage = driver.findElement(By.id("doubleClickMessage"));

        Assert.assertTrue("Double Click gerçekleşmedi",doubleClickMessage.isDisplayed());
        WaitAndClose();
        //3.3 14.dk


   }
}
