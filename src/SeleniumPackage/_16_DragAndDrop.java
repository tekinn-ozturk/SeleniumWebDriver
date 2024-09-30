package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _16_DragAndDrop extends BaseDriver {

    @Test
    public void Test(){
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions actions = new Actions(driver);

        WebElement rome = driver.findElement(By.id("box6"));
        WebElement italy = driver.findElement(By.id("box106"));

        System.out.println(rome.getCssValue("background-color"));
        //Action action = actions.bla bla yapmadan direkt actions üzerinden de ilerlenebilir.
        //build()-->Bu metod, birden fazla eylemi birleştirerek bir işlem zinciri oluşturur.İşlemi hazırlamış olur.
        //perform()--> hazırda bekleyen işlemleri gerçekleştirir.İş yapan metot budur.
        actions.clickAndHold(rome).build().perform();
        //ClickAndHold()--> rome web öğesini (örneğin, bir HTML elementi) üzerinde farenin sol tuşuna basıp tutar. Bu, genellikle sürükleme işlemi başlatmak için kullanılır.
        actions.moveToElement(italy).release().build().perform();
        //moveToElement()--> fareyi italy elementinin üzerine taşır.
        //release()--> farenin sol tuşunu serbest bırakır (bırakma işlemi). Yani öğeyi bırakmış olursunuz.

        System.out.println(rome.getCssValue("background-color"));
        Assert.assertTrue("Roma, ülkesini bulamadı ",rome.getCssValue("background-color").equals("rgba(0, 255, 0, 1)"));
        WaitAndClose();

    }
}
