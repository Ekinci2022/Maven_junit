package selenium_Ders.day07;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C04_PromptAlert extends TestBase {



    @Test
    public void sendKeysMethod() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
 //    3. butona tıklayın,
        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
        Thread.sleep(2000);
//    uyarıdaki metin kutusuna isminizi yazin

        driver.switchTo().alert().sendKeys("mete");
Thread.sleep(2000);
//    OK butonuna tıklayın
        driver.switchTo().alert().accept();

//    ve result mesajında isminizin görüntülendiğini doğrulayın.
        String actualResult = driver.findElement(By.id("result")).getText();
        String expectedResult = "mete";

        Assert.assertTrue(actualResult.contains(expectedResult));

    }
}
