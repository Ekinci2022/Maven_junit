package selenium_Practice.practice_002;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class day04_C05_ActionMoveToElement extends TestBase {

    @Test
    public void Test01() {

        // https://amazon.com adresine gidiniz
        driver.get("https://amazon.com");
        // sag ust bolumde bulunan dil secenek menusunun acilmasi icin mause'u bu menunun ustune getirelim
        Actions actions= new Actions(driver);
        WebElement move = driver.findElement(By.xpath("//*[@class='icp-nav-link-inner']"));
        waitFor(1);
        actions.moveToElement(move).perform();

        // Change country/region butonuna basiniz
        driver.findElement(By.xpath("(//*[@class='icp-mkt-change-lnk'])[1]")).click();
        // United States dropdown'undan 'Turkey (Türkiye)' seciniz
       WebElement drop = driver.findElement(By.xpath("//select[@id='icp-dropdown']"));
       Select select =new Select(drop);
       select.selectByVisibleText("Turkey (Türkiye)");

        // Go to website butonuna tiklayiniz
        driver.findElement(By.xpath("//span[@id='icp-save-button']")).click();
        // acilan yeni sayfadanin Title'inin Elektronik icerdigini test ediniz

        List<String> handles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(handles.get(1));
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Elektronik"));

    }
}
