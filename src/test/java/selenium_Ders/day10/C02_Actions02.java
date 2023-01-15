package selenium_Ders.day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_Actions02 extends TestBase {
    /*
    MANUAL:
    1. Amazon home sayfasina git
    2. Account & list e uzerinde bekle
    3.Acilan pencerede Account linkine tokla
    4.Acilan sayfanin Title inin, your Account oldugunu dogrula
     */

    @Test
    public void hoverOverTest() {

        //  Amazon home sayfasina git
        driver.get("https://amazon.com");

        //1.Adim : ACTIONS OBJESI
        Actions actions = new Actions(driver);

        //2.ELEMANI BUL -Account & list e uzerinde bekle
        WebElement accountList = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
        waitFor(3);
        //3.UYGUN ACTİONS METHODUNU KULLAN..EN SONRA PERFORM KULLANAMAYI UNUTMA
        actions.moveToElement(accountList).perform();
        waitFor(2);

        //4.Acilan pencerede Account linkine tikla
        driver.findElement(By.linkText("Account")).click();

        //Acilan sayfanin Title inin, your Account oldugunu dogrula
        Assert.assertTrue(driver.getTitle().contains("Your Account"));



    }
}
