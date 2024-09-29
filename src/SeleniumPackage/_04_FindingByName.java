package SeleniumPackage;

import SeleniumPackage.Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/242663188793066");

        WebElement firstName = driver.findElement(By.name("q3_isim[first]"));
        firstName.sendKeys("Tekin");
        MyFunctions.Wait(3);
        driver.quit();

    }
}
