package selenium_Practice.practice_002;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class day03_C02_Iframe extends TestBase {



        // https://the-internet.herokuapp.com/iframe sayfasina gidiniz
        // 'An iFrame containing the TinyMCE WYSIWYG Editor' basliginin erisilebilir oldugunu test edin ve konsolda yazdırın.
        // TextBox'a 'Merhaba Dunya' yazin.
        // TextBox'in altinda bulunan 'Elemental Selenium' linkinin gorunur oldugunu test edin ve konsolda yazdirin

        @Test
        public void test01() throws InterruptedException {
            // https://html.com/tags/iframe sayfasına gidiniz
            driver.get("https://html.com/tags/iframe");
            // Videoyu görecek kadar asagiya ininiz
            Actions actions=new Actions(driver);
            actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
            Thread.sleep(3000);
            // Videoyu izlemek icin Play tusuna basiniz
            //Play'i dogru locate edip click yapmamıza ragmen videoyu calıstırmadı.
            //Bunun üzerine HTML kodlarını inceleyince Play'in aslında bir iframe içerisinde
            //oldugunu gördük.
            //Bu durumda önce iframi'i locate edip sonra switchTo() ile iframe'e gecmeliyiz.
            WebElement iframe=driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
            driver.switchTo().frame(iframe);
            WebElement play=driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
            play.click();
            WebElement youtubeYazısı=driver.findElement(By.xpath("//a[@class='ytp-youtube-button ytp-button yt-uix-sessionlink']"));
            Assert.assertTrue(youtubeYazısı.isDisplayed());
            // 'Powerful,but easy to misuse' yazısının gorunur oldugunu test ediniz
            driver.switchTo().parentFrame();
            WebElement Powerful=driver.findElement(By.xpath("//span[text()='Powerful, but easy to misuse']"));
            Assert.assertTrue(Powerful.isDisplayed());

        }
}
