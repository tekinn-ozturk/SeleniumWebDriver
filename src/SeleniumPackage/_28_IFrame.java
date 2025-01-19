package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import SeleniumPackage.Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _28_IFrame extends BaseDriver {
    @Test
    public void Test(){
    //Bu sayfayı VsCode 'da tasarladık localin url'si.
    driver.get("http://127.0.0.1:5500/IFrame/1-iframe-edu.html");

    //gireceğimiz frame'i element olarak bul.
    WebElement frame1 = driver.findElement(By.id("frm1"));
    driver.switchTo().frame(frame1);
    MyFunctions.Wait(2);

    WebElement textBox = driver.findElement(By.id("txt1"));
    textBox.sendKeys("TekinO");

    driver.switchTo().parentFrame();


    WebElement frame2 = driver.findElement(By.id("frm2"));
    driver.switchTo().frame(frame2);
    MyFunctions.Wait(2);

    WebElement frame2_0= driver.findElement(By.id("frmGiris"));
    driver.switchTo().frame(frame2_0);
    MyFunctions.Wait(2);

    WebElement frm2TextBox= driver.findElement(By.id("txt1"));
    frm2TextBox.sendKeys("2. TekinO 2.");









    }
}



