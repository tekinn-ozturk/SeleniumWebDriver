package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _07_FindingElements_tag extends BaseDriver {

    public static void main(String[] args) {
        driver.get("https://www.hepsiburada.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        for(WebElement e : links){
            if(!e.getText().isEmpty()) {
                System.out.println("e.getAttribute(href) " + e.getAttribute("href"));
                System.out.println("e.getAttribute(title) " + e.getAttribute("title"));
                System.out.println("e.getAttribute(rel) " + e.getAttribute("rel"));
            }
     }

        WaitAndClose();
    }
}
