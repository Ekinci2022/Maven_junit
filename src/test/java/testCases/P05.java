package testCases;

import com.google.common.base.Verify;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class P05 extends TestBase {


    @Test
    public void name() {

//        1. Launch browser
        driver.get("http://automationexercise.com");
//        2. Navigate to url 'http://automationexercise.com'
        String actualUrl = "https://automationexercise.com/";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
//        3. Verify that home page is visible successfully
//        4. Click on 'Signup / Login' button

        driver.findElement(By.xpath("//*[@href='/login']")).click();
//        5. Verify 'New User Signup!' is visible
        WebElement title= driver.findElement(By.xpath("//*[.='New User Signup!']"));
        Assert.assertTrue(title.isDisplayed());
//        6. Enter name and already registered email address
        driver.findElement(By.xpath("//*[@data-qa='signup-name']")).sendKeys("ali", Keys.TAB,"alivelikeklik@gmail.com",Keys.ENTER);
//        7. Click 'Signup' button

//        8. Verify error 'Email Address already exist!' is visible
        WebElement verify = driver.findElement(By.xpath("//*[.='Email Address already exist!']"));
        Assert.assertTrue(verify.isDisplayed());
    }
}
