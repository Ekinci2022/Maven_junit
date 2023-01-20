package selenium_Ders.day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01_Actions01 extends TestBase {


    @Test
    public void rightClick(){


        driver.get("https://the-internet.herokuapp.com/context_menu");
        // 1. ACTIONS OBJESI OLUSTUR
        Actions actions = new Actions(driver);

        //2. ELEMENTI LOCAET EDELIM
        WebElement kutu = driver.findElement(By.id("hot-spot"));

        // Kutuya sag tıklayın

        // tüm ACTIONS lar actions Objesiyle baslar ve perform() ile biter
        actions.contextClick(kutu).perform();
//    Alert’te cikan yazinin “You selected a context menu” oldugunu test edin
         Assert.assertEquals("You selected a context menu",driver.switchTo().alert().getText());

        //2.yol obje olusturma
        // Object olusturmak wait gerektiren durumlarda makul

        //Alert'te cikan yazinin "You selected a context menu" oldugunu
//        String actualAlert = driver.switchTo().alert().getText();
//        String expectedAlert = "You selected a context menu";
//        Assert.assertEquals(expectedAlert,actualAlert);

      //  Tamam diyerek alert’i kapatın

       driver.switchTo().alert().accept();

    }



//    Method: rightClick

//    https://the-internet.herokuapp.com/context_menu  sitesine gidin



//


//
}
