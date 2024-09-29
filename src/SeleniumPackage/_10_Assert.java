package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _10_Assert extends BaseDriver {

    /*
    * Adrese git.
    * açılan sayfada txtbox var bu alana mesaj gir.
    * gönder butonuna tıkla
    * Butona tıklandıktan sonra çıkan mesajın göründüğünü test ile kontrol et.
    * CSS locatorler kullanılacak.
    * */
    public static void main(String[] args) {
        //Siteye git
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

        //çıkan uyarının bizim string message'ımıza eşitmi durumunun karşılaştırması.
        if (assertMessage.getText().equals(message)){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }


        WaitAndClose();

    }

}
