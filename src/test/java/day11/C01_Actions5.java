package day11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.security.Key;

public class C01_Actions5 extends TestBase {


    @Test
    public void keyboardActionsTest() {


        //    Create a class: Action5
//    Create a method keyboardActions
//    Google a gidin https://www.google.com

        driver.get("https://www.google.com");
        driver.findElement(By.xpath("(//*[@class='QS5gu sy4vM'])[1]")).click();
//            ‘iPhone X fiyatlari’ yazdir (SHIFT TUSUNA BASILARAK)

//‘ cok pahali!’ Yazdır (SHIFT TUSUNA BASILMAYARAK)
//    Ve ENTER tusuna bas

        WebElement aramaKutusu = driver.findElement(By.name("q"));
        // aramaKutusu.sendKeys("iphone x fiyatlari"+ Keys.ENTER);

        Actions actions = new Actions(driver);

        actions
                .keyDown(aramaKutusu, Keys.SHIFT)//arama kutusunun ustune Shift tusuna bas
                .sendKeys("Iphone X fiyatlari")//shifte basiliyken yazi yaz
                .keyUp(aramaKutusu, Keys.SHIFT)//shift de artik basma
                .sendKeys(" cok pahali")//normal halde yaz ve Enter tusuna bas
                .build()// Birden fazla actions methodu kullanildiginda build() kullanilir.
                .perform();


        //     ACTIOS INTERWIEV
        /*
        1- Actions nedir? Actions Class nedir.?
                *Actions selenium dan gelen bir kütüphanedir. Mouse ve Keyboard
                işlemlerini gerçekleştirmek icin kullandigimiz hazır bir
                selenium kütüphanesidir. Ornegin, sag tiklamak(contextClick) ,
                çift tıklamak(doub1eClick), elementin uzerine  gitmek(moveToElement) gibi mouse işlemlerini
                gerçekleştirebiliriz. Ayni zamanda, shift, control, delete,
                enter gibi keyboard tuşlar.inada actions yardımıyla basabiliriz.
                Bu tur işlemlerde sendKeys metodu kullanilir


         2- Ne tür methodlar kullandin?
         Actions methodlari önemlidir. o yüzden ve tekrar kullanmam gerektiginden, Actions method lari iceren
         Reusable methodlari olusturdum ve gerektiginde bu Reusable metholdari kullaniyorum.
         örnegin; rightClick methodunu bir elemente saga tiklamak icin test classimda cagirabilirim

         3- Hangi methodlari kullandin ne ise yarar?
         Ornegin, sag tiklamak(contextClick) ,
          çift tıklamak(doub1eClick), elementin uzerine  gitmek(moveToElement) gibi mouse işlemlerini
          gerçekleştirebiliriz. Ayni zamanda, shift, control, delete, enter gibi keyboard tuşlar.inada
          actions yardımıyla basabiliriz.

                Bu tur işlemlerde sendKeys metodu kullanilir
         */


    }

}
