package selenium_Ders.day17;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.IOException;

public class C01_JSExecutor_Scroll extends TestBase {

    //    scrollIntoViewTest metotu olustur

    @Test
    public void scrollIntoViewTest() throws IOException {
//    Techpro education ana sayfasina git

        driver.get("https://www.techproeducation.com");
        waitFor(3);

//   1)Elementi bul
        WebElement weOffer = driver.findElement(By.xpath("//span[.='we offer']"));

//  2) Js executor objesi olustur
        JavascriptExecutor js = (JavascriptExecutor)driver;
//  3)Yapmak istedigin islemi js.executeScript metotu ile yap

//      scrollIntoView(true); metodu belirli bir elemente scroll yapmak icin kullanilir
        js.executeScript("arguments[0].scrollIntoView(true);",weOffer);
        waitFor(3);
//  4) sayfanin ekran goruntusunu al
        takeScreenShotOfPage();

//  5)Ayni ekranda Enroll Free elementi gorunr olacak sekilde scroll et ve ekran goruntusunu al
scrollIntoViewJs(driver.findElement(By.xpath("//span[.='Enroll Free Course']")));
takeScreenShotOfPage();

//  6) Why Us elementi gorunr olacak sekilde scroll et ve ekran goruntusunu al
        scrollIntoViewJs(driver.findElement(By.xpath("//h3[.='WHY US?']\"")));
        waitFor(3);
        takeScreenShotOfPage();

// 5)Ayni ekranda Enroll Free elementi gorunr olacak sekilde scroll et ve ekran goruntusunu al
    scrollIntoViewJs(driver.findElement(By.xpath("//span[.='Enroll Free Course']")));
    takeScreenShotOfPage();

//        EN USTE GIT
        scrollTopJS();
        waitFor(3);

//        EN ALTA GIT
        scrollEndJS();
        waitFor(3);




    }
}
