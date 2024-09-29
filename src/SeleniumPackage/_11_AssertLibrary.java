package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

public class _11_AssertLibrary extends BaseDriver {

    @Test
    public void Test(){
    driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        //textBox'a yazılacak mesajın string değişkene atılması.
        String message = "selenium web driver message";

        //içine mesaj yazacağımız textBox'un sayfada bulunması
        WebElement textBox = driver.findElement(By.cssSelector("input#user-message"));
        //mesajın textBox'a yazdırılması
        textBox.sendKeys(message);

        //butonun sayfada bulunması ve click'lenmesi.
        WebElement button = driver.findElement(By.cssSelector("button[type='button'][onclick='showInput();']"));
        button.click();

        //textBox'a mesaj yazdırıldıktan sonra cıkan uyarı alanının bulunması.
        WebElement assertMessage = driver.findElement(By.cssSelector("span#display"));

        //verilen koşul false dönüyorsa mesajı yazdırır.
        //verilen koşul true dönüyorsa mesajı yazdırmıyor.Test başarılı oluyor yeşil tik.
        Assert.assertTrue("Mesaj ile sonuç uyuşmadı :(",assertMessage.getText().equals(message));



        //Verilen koşul false gelcek dedik eğer koşul false gelirse test başarılı sayılır.

        Assert.assertFalse("Mesaj ile sonuç uyuşmadı :(",assertMessage.getText().equals(message));



        WaitAndClose();
    }
}
