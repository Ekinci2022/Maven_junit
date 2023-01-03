package practice_001;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01 {



    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //    -"amazon.com" adresine gidelim
        driver.get("https://amazon.com");

    //-bu web adresinin sayfa basligini(title) ve adres(url)ini yazdıralım
        String actualTitle = driver.getTitle();
        String actualUrl = driver.getCurrentUrl();
        System.out.println("Sayfa basligi : " + actualTitle);
        System.out.println("Sayfa Url : "+actualUrl);

    //-title ve url'nin "Spend" kelimesinin icerip icermedigini kontrol edelim
        Assert.assertFalse(actualTitle.contains("spend") && actualUrl.contains("spend"));

    // -Ardindan "ebay.com" adresine gidelim

        driver.get("https://www.ebay.com");


    //-bu adresin basligini alalim ve "Cars" kelismesini icerip icermedigini kontrol edelim

        String ebayTitle = driver.getTitle();
        Assert.assertTrue(ebayTitle.contains("Cars"));


    //-Bi onceki web sayfamiza geri donelim

        driver.navigate().back();


    //-sayfayi yenileyelim
        driver.navigate().refresh();


    //-Daha sonra ebay sayfamiza tekrar donelim ve sayfayi kapatalim
    driver.navigate().forward();
    driver.quit();// birden fazla sayfada calisimis ise quit() methodu kullanilir

    }
}



