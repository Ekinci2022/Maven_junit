package selenium_Practice.practice_002;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class day04_C03_WindowHandles extends TestBase {

    @Test
    public void test01() {

        driver.get("https://www.n11.com");
        String sayfaHandel = driver.getWindowHandle();

        // arama motoruna 'oppo' yazıp aratın
       driver.findElement(By.xpath("//*[@id='searchData']")).sendKeys("oppo", Keys.ENTER);

        // ilk ürüne tıklayın
        driver.findElement(By.xpath("(//*[@class='lazy cardImage'])[1]")).click();

        List<String> allHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allHandles.get(1));


        // Basligin 'Oppo' icerdigini test edin.

        WebElement baslik = driver.findElement(By.xpath("//*[@class='proName']"));
        String baslikStr = baslik.getText();
        Assert.assertTrue(baslikStr.contains("Oppo"));

        // ilk sayfaya donun ve Title'ını yazdırın
        driver.switchTo().window(sayfaHandel);
        System.out.printf("Ilk sayfa title " + sayfaHandel );
    }
}
