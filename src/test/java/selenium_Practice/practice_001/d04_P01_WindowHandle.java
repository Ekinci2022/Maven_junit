package selenium_Practice.practice_001;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class d04_P01_WindowHandle extends TestBase {

    @Test
    public void name01() {
//        Amazon anasayfa adresine gidin.
        driver.get("https://amazon.com");

//        Sayfa’nin window handle degerini String bir degiskene atayin
        String amazonWindow = driver.getWindowHandle();

//        Sayfa title’nin “Amazon” icerdigini test edin
        String actualTitle= driver.getTitle();
        String exceptedTitle ="Amazon";
        Assert.assertTrue(actualTitle.contains(exceptedTitle));
//        Yeni bir tab olusturup, acilan tab’da techproeducation.com adresine gidin
        driver.switchTo().newWindow(WindowType.TAB); // Yeni bi sekme acmis olduk
        driver.get("https://techproeducation.com");

//        Sayfa title’nin “TECHPROEDUCATION” icerip icermedigini test edin
        String actualTechProTitle= driver.getTitle();
        String istenenKelime =" TECHPROEDICATION";
        Assert.assertFalse(actualTechProTitle.contains(istenenKelime));

//        Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin

        driver.switchTo().newWindow(WindowType.WINDOW); // YEni bir window acmis olduk
        driver.get("https://walmart.com");

//        Sayfa title’nin “Walmart” icerdigini test edin
        String actualWalmartTitle = driver.getTitle();
        String beklenenKelime ="Walmart";
        Assert.assertTrue(actualWalmartTitle.contains(beklenenKelime));

//        Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
        driver.switchTo().window(amazonWindow);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        Assert.assertEquals(expectedUrl,actualUrl);


    }
}
