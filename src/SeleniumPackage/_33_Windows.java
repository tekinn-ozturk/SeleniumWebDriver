package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import SeleniumPackage.Utilities.MyFunctions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _33_Windows extends BaseDriver {

    @Test
    public void Test(){
        driver.get("https://www.selenium.dev/");
        MyFunctions.Wait(2);
        List<WebElement> blankList = driver.findElements(By.xpath("//a[@target='_blank']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        for(int i=0; i< blankList.size(); i++){

            // js.executeScript("arguments[0].click();",watchLink);

            js.executeScript("arguments[0].click();", blankList.get(i));
            MyFunctions.Wait(2);
        }

        /*for(WebElement e : blankList){
            js.executeScript("arguments[0].click();", e);
        }*/

        String anaSayfaHandleId = driver.getWindowHandle();

        //duplicate eleman içermez (Set<>)
        Set<String> windowsIdList = driver.getWindowHandles();
        //getWindowHandles methodu açık olan tüm sekmelerin id'lerini bir Set listesinde döndürür. 1 tane açıksa 1 adet döndürür.
        for(String id : windowsIdList){
            System.out.println("id: "+id);
        }

        MyFunctions.Wait(2);
        //kapanmadan önce anasayfa'ya gelmesini sağladım, normalde son tıkladığı linkte kalıyordu.
        driver.switchTo().window(anaSayfaHandleId);
        WaitAndClose();

    }

}
