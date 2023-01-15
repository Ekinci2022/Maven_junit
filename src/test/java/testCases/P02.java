package testCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class P02 extends TestBase {


    @Test
    public void Test01() {

//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
//        3. Verify that home page is visible successfully
        WebElement actualtitle=  driver.findElement(By.xpath("(//*[@class='row'])[1]"));
        Assert.assertTrue(actualtitle.isDisplayed());
//        4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@href='/login']")).click();
//        5. Verify 'Login to your account' is visible
        WebElement actrue = driver.findElement(By.xpath("(//h2)[1]"));
        Assert.assertTrue(actrue.isDisplayed());
//        6. Enter correct email address and password
        driver.findElement(By.xpath("(//*[@type='email'])[1]")).sendKeys("alivelikeklik@gmail.com", Keys.TAB,"12345", Keys.ENTER);
//        7. Click 'login' button
//        8. Verify that 'Logged in as username' is visible
        WebElement trueact = driver.findElement(By.xpath("//*[@class='fa fa-user']"));
        Assert.assertTrue(trueact.isDisplayed());

//        9. Click 'Delete Account' button
        driver.findElement(By.xpath("//*[@href='/delete_account']")).click();
//        10. Verify that 'ACCOUNT DELETED!' is visible
        WebElement accountT =driver.findElement(By.xpath("//*[@class='title text-center']"));
        String actualtitle1 =  accountT.getText();
        String expectedT ="ACCOUNT DELETED!";
        Assert.assertEquals(expectedT,actualtitle1);
//


    }
}
