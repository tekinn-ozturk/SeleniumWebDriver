package SeleniumPackage;

import SeleniumPackage.Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _12_Select extends BaseDriver {

    @Test
    public void Test(){
        driver.get("https://www.amazon.com.tr/");

        WebElement selectBar = driver.findElement(By.id("searchDropdownBox"));

        //Select instance alırken içersine WebElement nesnesi vermek gerek. Constructor.
        Select categoryMenu = new Select(selectBar);
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        //categoryMenu.selectByVisibleText("Bilgisayarlar");
        //categoryMenu.selectByIndex(4); //indexler seleniumda 1 den başlar.
        categoryMenu.selectByValue("search-alias=computers");
        searchBox.sendKeys("macbook");



        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));

        searchButton.click();

        String urlGuncel = driver.getCurrentUrl();

        Assert.assertTrue("İlgili sayfa ziyaret edilemedi :( ", urlGuncel.toLowerCase().contains("macbook"));

        WaitAndClose();











    }
}
