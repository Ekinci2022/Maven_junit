package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class Testpratik {
    //    TestBase i abstract yapmamizin sebebi bu sinifin objesini olusturmak istemiyorum
//    TestBase testBase = new TestBase(); -> YAPILAMAZ
//    Amacim bu sinifi extend etmek ve icindeki hazir metodlari kullanmak
//    driver objesini olustur. Driver ya public yada protected olmali.
//    Sebepi child classlarda gorulebilir olmasi
    protected static WebDriver driver;

    //    setUp
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        driver=WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    }
       public void Home1() {


           // 2. 'http://automationexercise.com' URL'sine gidin
           driver.get("http://automationexercise.com");

           //3. Ana sayfanın başarıyla göründüğünü doğrulayın
           String actionalUrl = "https://automationexercise.com/";
           String exceptedUrl = driver.getCurrentUrl();
           Assert.assertEquals(actionalUrl, exceptedUrl);


       }

}

