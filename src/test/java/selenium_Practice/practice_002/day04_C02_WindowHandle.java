package selenium_Practice.practice_002;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class day04_C02_WindowHandle extends TestBase {


    @Test
    public void Test01(){
        // 1- https://www.amazon.com sayfasina gidelim

        driver.get("https://www.amazon.com");
        String sayafa1Handle = driver.getWindowHandle();
        // 2- url'in 'amazon' icerdigini test edelim
        String amazonURl = driver.getCurrentUrl();
        Assert.assertTrue(amazonURl.contains("amazon"));

        // 3- yeni bir pencere acip https://www.bestbuy.com sayfasina gidelim
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.bestbuy.com");
        String bstBy = driver.getWindowHandle();

        // 4- title'in 'Best Buy' icerdigini test edelim
        String bestBuyTitle = driver.getTitle();
        Assert.assertTrue(bestBuyTitle.contains("Best Buy"));
        // 5- ilk sayfaya(amazon) donup sayfada java aratalım

        driver.switchTo().window(sayafa1Handle);
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("java"+ Keys.ENTER);

        // 6- arama sonuclarının 'Java' icerdigini test edelim
        WebElement aramaSonucu=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String aramaSonucuStr=aramaSonucu.getText();
        Assert.assertTrue(aramaSonucuStr.contains("java"));

        // 7- ikinci sayfaya(bestbuy) donelim
        driver.switchTo().window(bstBy);
        // 8- logonun gorundugunu test edelim
        WebElement log= driver.findElement(By.xpath("(//*[@class='logo'])[1]"));
        Assert.assertTrue(log.isDisplayed());



    }
}
