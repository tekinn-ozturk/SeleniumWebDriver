package SeleniumPackage;

import SeleniumPackage.Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindById {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\tekin.ozturk\\Desktop\\oto-kurulum\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://form.jotform.com/242663188793066");

        WebElement name = driver.findElement(By.id("first_3"));
        name.sendKeys("Tekin");

        WebElement surName= driver.findElement(By.id("last_3"));
        surName.sendKeys("Ozturk");


        WebElement email = driver.findElement(By.id("input_5"));
        email.sendKeys("tekin@gmail.com");

        WebElement phoneNum = driver.findElement(By.id("input_4_full"));
        phoneNum.sendKeys("+905010002112");


        WebElement sendBtn = driver.findElement(By.id("input_2"));
        sendBtn.click();

        MyFunctions.Wait(3);
        driver.quit();

    }
}
