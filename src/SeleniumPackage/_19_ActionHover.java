package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import SeleniumPackage.Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _19_ActionHover extends BaseDriver {

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

        WebElement searchBox= driver.findElement(By.cssSelector("input[name='search']"));
        searchBox.sendKeys("ipod");

        WebElement searchBtn = driver.findElement(By.cssSelector(".btn-default"));
        searchBtn.click();
        MyFunctions.Wait(2);
        WebElement ipodLink = driver.findElement(By.linkText("iPod Touch"));

        //Elementin üzerine git bir iş; tıklamak başka bir iş.
        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(ipodLink).build();
        action.perform();

        Action action1 = actions.click().build();
        action1.perform();

        MyFunctions.Wait(3);

        WebElement addBasket = driver.findElement(By.cssSelector("#button-cart[type='button']"));
        Assert.assertTrue("Sipariş Sayfasında Değiliz ", addBasket.isDisplayed());

        WaitAndClose();



    }


}
