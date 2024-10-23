package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import SeleniumPackage.Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _20_ActionHover2 extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement emailBox = driver.findElement(By.id("input-email"));
        emailBox.sendKeys("carlosSantana@gmail.com");

        WebElement passBox = driver.findElement(By.id("input-password"));
        passBox.sendKeys("1234");

        WebElement loginBtn = driver.findElement(By.cssSelector("input[type='submit']"));
        loginBtn.click();

        MyFunctions.Wait(2);

        WebElement navBarComponents= driver.findElement(By.cssSelector(".navbar-nav > li:nth-of-type(3) > .dropdown-toggle"));

        Actions actions= new Actions(driver);
        Action action = actions.moveToElement(navBarComponents).build();
        action.perform();

        MyFunctions.Wait(2);
        WebElement showAllComp = driver.findElement(By.cssSelector(".navbar-nav > li:nth-of-type(3) .see-all"));

        Assert.assertTrue("Component etiketi çalışmıyor", showAllComp.isDisplayed());




    }
}
