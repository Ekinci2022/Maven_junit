package selenium_Practice.practice_001;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class d06_P01_Actions extends TestBase {


    /*
    - http://szimek.github.io/signature_pad/ sayfasına gidiniz
    - Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
    - Çizimden sonra clear butonuna basalım
    - Son olarak sayfayı temizleyiniz
     */


    @Test
    public void name() {
        driver.get("http://szimek.github.io/signature_pad/");
        WebElement yaziTahtasi = driver.findElement(By.xpath("//*[@class='signature-pad--body']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(yaziTahtasi).clickAndHold();


        for (int i = 0; i < 15; i++) {
            actions.moveByOffset(5, 5);

        }
        for (int i = 0; i < 15; i++) {
            actions.moveByOffset(-5, -5);


        }
        for (int i = 0; i < 15; i++) {
            actions.moveByOffset(-5, 5);


        }

        for (int i = 0; i < 7; i++) {
            actions.moveByOffset(5, -5);


        }
        for (int i = 0; i < 15; i++) {
            actions.moveByOffset(7,0 );


        }
        actions.release().build().perform();
    }
}