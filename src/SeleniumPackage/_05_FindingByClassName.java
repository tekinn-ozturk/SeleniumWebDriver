package SeleniumPackage;

import SeleniumPackage.Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/242663188793066");

        //web sitesinde toplamda 4 adet form-textbox sınıfında element var.Bu dördünün ilki firstName olduğu için şansımıza doğru oldu.
//        WebElement firstName = driver.findElement(By.className("form-textbox"));
//        firstName.sendKeys("Tekin");

        //Birden fazla aynı isme sahip attribute'leri olan elemanları List içinde toplayıp findElements metodunu kullanabiliriz.
        List<WebElement> ortakClassName =driver.findElements(By.className("form-sub-label"));
        System.out.println(ortakClassName.size());

        for(WebElement element: ortakClassName){
            System.out.println("element.getText()= "+element.getText());
        }
        MyFunctions.Wait(3);
        driver.quit();



    }
}
