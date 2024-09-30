package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _18_DragAndDropBy extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        Actions actions = new Actions(driver);

        WebElement solButton = driver.findElement(By.cssSelector("#slider-range > span:nth-of-type(1)"));

        String priceMessage1=driver.findElement(By.id("amount")).getText();
        System.out.println(priceMessage1);



        //bulunduğu konumu 0,0 noktası olarak kabul eder. y ekseninde hareket ettirmedik, x ekseninde 100 birim hareket ettirdik.
        Action action = actions.dragAndDropBy(solButton,100,0).build();
        action.perform();

        String priceMessage2=driver.findElement(By.id("amount")).getText();
        System.out.println(priceMessage2);


        //koşul eğer yanlışsa istediğimiz şeyi elde ediyoruz yani eşit olmamasını istiyoruz bunu assertTrue ile yapsaydık koşulu priceMessage1!=priceMessage2 vermemiz gerekti.
        Assert.assertFalse("Aralık dışına çıktınız!",priceMessage1==priceMessage2);

        WaitAndClose();


    }
}
