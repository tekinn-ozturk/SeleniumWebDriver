package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import SeleniumPackage.Utilities.MyFunctions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _21_ActionKeysControl extends BaseDriver {

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

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='search']"));


        Actions actions = new Actions(driver);

        //keyDown(Keys.SHIFT)--> Shift tuşuna basmayı açar.
        //sendKeys("ı")--> Shift tuşu basılı ı harfini gönderir.
        //keyUp(Keys.SHIFT)--> Shift tuşuna basmayı bırakır.
        //sendKeys("pod")--> shift tuşuna basılı olmadan "pod" kelimesini yazar.

        //Burada searchBox'un üzerine click ile gelmemiz gerek çünkü Actions sınıfı ile çalışıyoruzz. Daha önce inputa veri girerken click ihtiyacı yoktu ama neden; actions üzerinden gitmiyoruz orda direkt element üzerinden gidiyoruz. sendKeys'leri karşılaştır anlarsın login ve searchBox'u
        Action action = actions.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("i").keyUp(Keys.SHIFT).sendKeys("pod").build();

        MyFunctions.Wait(3);
        action.perform();

        WebElement searchBtn = driver.findElement(By.cssSelector(".btn-default"));

        Action action1 = actions.moveToElement(searchBtn).click().build();
        action1.perform();

        WebElement h1Element = driver.findElement(By.xpath("//h1[.='Search - Ipod']"));

        Assert.assertTrue("Search Ettik :)",!h1Element.isDisplayed());
        WaitAndClose();













    }
}
