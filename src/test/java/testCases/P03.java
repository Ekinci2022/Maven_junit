package testCases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
import utilities.Testpratik;

public class P03 extends Testpratik {

    @Test
    public void Test01() {


//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'
        Home1();
//        3. Verify that home page is visible successfully
//
//        3. Verify that home page is visible successfully
      Home1();
        // Homepage gorunurmu?


//        4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@href='/login']")).click();


//        5. Verify 'Login to your account' is visible
        WebElement login = driver.findElement(By.xpath("//h2[1]"));
        Assert.assertTrue(login.isDisplayed());
    }
}
