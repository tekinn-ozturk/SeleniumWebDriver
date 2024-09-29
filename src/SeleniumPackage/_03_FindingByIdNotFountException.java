package SeleniumPackage;

import SeleniumPackage.Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFountException {


    public static void main(String[] args) {

        WebDriver driver  = new ChromeDriver();
        driver.get("https://form.jotform.com/242663188793066");

        try{
            WebElement firstName = driver.findElement(By.id("hataliLocator"));
        }catch (Exception e){
            System.out.println("WebElement Locator Hatası "+e.getMessage());
        }

        MyFunctions.Wait(3);
        driver.quit();
    }
}
