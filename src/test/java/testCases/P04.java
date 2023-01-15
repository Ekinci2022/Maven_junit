package testCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Testpratik;

public class P04 extends Testpratik {


    @Test
    public void Test01(){

       Home1();
        //  4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@href='/login']")).click();
        //  5. Verify 'Login to your account' is visible
        WebElement login = driver.findElement(By.xpath("//h2[1]"));
        Assert.assertTrue(login.isDisplayed());
        // 6. Enter correct email address and password
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("adam@gmail.com", Keys.TAB,"12345",Keys.ENTER);
        // 7. Click 'login' button

        // 8. Verify that 'Logged in as username' is visible
        String logged = driver.findElement(By.xpath("//*[text()='Burak']")).getText();
        Assert.assertTrue(logged.contains("Burak"));
        // 9. Click 'Logout' button
        driver.findElement(By.xpath("//*[@href='/logout']")).click();
        // 10. Verify that user is navigated to login page
        WebElement cikis = driver.findElement(By.xpath("(//h2)[1]"));
        Assert.assertTrue(cikis.isDisplayed());
    }
}