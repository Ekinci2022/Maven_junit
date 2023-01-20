package testCases;

import com.google.common.base.Verify;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import javax.swing.*;

public class P06 extends TestBase {

    @Test
    public void name() {


//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'
//        3. Verify that home page is visible successfully

        driver.get("http://automationexercise.com");

        String actualUrl = "https://automationexercise.com/";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
//        4. Click on 'Contact Us' button
        driver.findElement(By.xpath("//*[@href='/contact_us']")).click();

//        5. Verify 'GET IN TOUCH' is visible
        WebElement visible= driver.findElement(By.xpath("(//*[@class='title text-center'])[2]"));
        Assert.assertTrue(visible.isDisplayed());
//        6. Enter name, email, subject and message
        driver.findElement(By.xpath("(//*[@name='name'])")).sendKeys("ali",
                Keys.TAB,"alivelikeklik@gmil.com",Keys.TAB,"merhaba",Keys.TAB,"merhaba nasilsiniz");
//        7. Upload file
        WebElement locate= driver.findElement(By.xpath("(//*[@name='upload_file'])"));
        String dosyayolu = System.getProperty("user.home")+"\\OneDrive\\Desktop\\Yeni Metin Belgesi.txt";
        locate.sendKeys(dosyayolu);
//        8. Click 'Submit' button
        driver.findElement(By.xpath("(//*[@name='submit'])")).click();
//        9. Click OK button

        Actions action = new Actions(driver);
       driver.switchTo().alert().accept();

//        10. Verify success message 'Success! Your details have been submitted successfully.' is visible
       String kontrol = driver.findElement(By.xpath("//*[@style='display: block;']")).getText();
       Assert.assertTrue(kontrol.contains("Success!"));
        System.out.println(kontrol);

//       11. Click 'Home' button and verify that landed to home page successfully
     action.sendKeys(Keys.PAGE_UP).perform();
     driver.findElement(By.xpath("(//*[@href='/'])[2]")).click();
     driver.navigate().refresh();
        driver.findElement(By.xpath("(//*[@href='/'])[2]")).click();
        waitFor(1);

//

       String actualUrl1 = "https://automationexercise.com/";
        String expectedUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl1,actualUrl1);

    }
}
