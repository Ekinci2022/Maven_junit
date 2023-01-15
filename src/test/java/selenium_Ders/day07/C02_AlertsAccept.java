package selenium_Ders.day07;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;


import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;
    public class C02_AlertsAccept extends TestBase {
        @Test
        public void acceptAlertTest() throws InterruptedException {
            driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
//        1. butona tıklayın,
            driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//        uyarıdaki OK butonuna tıklayın
            Thread.sleep(2000);
            driver
                    .switchTo()//degistir
                    .alert()//alerte degistir
                    .accept();//OK secenegine tiklanir
            Thread.sleep(2000);

//        ve result mesajının
//       “You successfully clicked an alert” oldugunu test edin.
            String actualResult = driver.findElement(By.id("result")).getText();
            String expectedResult = "You successfully clicked an alert";
            Assert.assertEquals(expectedResult,actualResult);


        }
        /*
        Alertleri nasil automate edilir? How to handle alerts in selenium?
        -Alertler Javascript ile olusur. Ispect edilemezler. Oncelikle alerte switch etmemiz gerekir
         */
    }