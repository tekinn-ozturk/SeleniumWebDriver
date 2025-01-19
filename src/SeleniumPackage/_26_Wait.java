package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _26_Wait extends BaseDriver {
    //Implicitly Wait: Tüm web elementlerini bulmaya çalışırken Selenium'a belirli bir süre beklemesini söyler.

    //Explicitly Wait: Belirli bir web elementinin belirli bir duruma ulaşmasını beklemek için kullanılır.

    //Thread.sleep kullanmak istenilmemesinin sebebi Thread sınıfı direkt olarak Java'yı durdurduğu için hatalara sebep olabilir.

    @Test
    public  void Test() throws InterruptedException {
    driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
    WebElement clickMe = driver.findElement(By.xpath("//button[.='Click me to start timer']"));
    clickMe.click();
    Thread.sleep(3000);
    WebElement seleniumTag = driver.findElement(By.id("demo"));

        //Verilen koşul false gelcek dedik eğer koşul false gelirse test başarılı sayılır.

        Assert.assertFalse("Etiket ile seleniumTag uyuşmadı :(",seleniumTag.getText().toLowerCase().equals("selenium"));


    WaitAndClose();
}

}
