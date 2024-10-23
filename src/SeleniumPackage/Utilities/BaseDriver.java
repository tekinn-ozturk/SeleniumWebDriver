package SeleniumPackage.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver;


    //program çalıştığında static bloğundaki kodlar bir kere çalışır ve program kapatılana kadar erişilir.
    static{

        //Logger.getLogger(""): Root logger'ı çağırır(isimsiz logger) ve logger değişkenine atar. Bu logger, uygulamanızda log mesajları oluşturmak için kullanılabilir.
        Logger logger = Logger.getLogger("");

        //ciddi seviyedeki hataları log'lamasını bildiriyoruz. setLevel metodu Level nesnesi içeriyor.
        logger.setLevel(Level.SEVERE);

        driver=new ChromeDriver();
        driver.manage().window().maximize();


        //Süre nesnesi oluşturduk saniye cinsinde
        Duration dr = Duration.ofSeconds(20);

        //sayfanın yüklenmesine 20 sn lik süre tanıyoruz zaman aşımı olursa TimeoutException hatası fırlatır..
        driver.manage().timeouts().pageLoadTimeout(dr);


    }

    public static void WaitAndClose(){
        MyFunctions.Wait(3);
        driver.quit();
    }
}
