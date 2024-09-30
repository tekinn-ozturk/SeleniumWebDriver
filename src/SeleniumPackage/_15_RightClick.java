package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import SeleniumPackage.Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _15_RightClick extends BaseDriver {

    @Test
    public void Test(){
        driver.get("https://demoqa.com/buttons");

        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(rightClick).contextClick().build();

        action.perform();

        MyFunctions.Wait(3);
        WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));

        Assert.assertTrue("Right Click Gerçekleşmedi ", rightClickMessage.isDisplayed());

        WaitAndClose();

    }


}
