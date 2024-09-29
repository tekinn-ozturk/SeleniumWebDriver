package SeleniumPackage;

import SeleniumPackage.Utilities.MyFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebSites {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        MyFunctions.Wait(5);

        driver.quit(); // close();-->aktif olan driver'ı sonlandırır V quit() tüm driver'ları sonlandırır.


    }

}
