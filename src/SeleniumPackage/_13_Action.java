package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _13_Action extends BaseDriver {
    @Test
    public void Test(){

        driver.get("https://demoqa.com/buttons");
        WebElement clickMe = driver.findElement(By.xpath("//*[text()='Click Me']"));

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(clickMe).click().build(); //Aksiyonu tanımla ve hazırla.
        action.perform();//Aksiyonu gerçekleştir.
        System.out.println("Click işlemi tamamlandı.");

        WebElement clickMessage = driver.findElement(By.id("dynamicClickMessage"));
        Assert.assertTrue("Click işlemi yapılamadı :(",clickMessage.isDisplayed());
        //isDisplayed() ekranda görünüp görünmediğini kontrol eder.

        WaitAndClose();



    }
}
