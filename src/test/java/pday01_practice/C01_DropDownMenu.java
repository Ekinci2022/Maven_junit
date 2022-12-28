package pday01_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C01_DropDownMenu {
    // ...Exercise 1...


// https://www.amazon.com/ sayfasina gidin
// dropdown'dan "Books" secenegini secin
// arama cubuguna "Java" aratın
// arama sonuclarinin Java icerdigini test edin

    // https://www.amazon.com/ sayfasina gidin
    // dropdown'dan "Books" secenegini secin
    // arama cubuguna "Java" aratın
    // arama sonuclarinin Java icerdigini test edin

    static WebDriver driver;

    @Before
    public void setup() {
        //1. Tarayıcıyı başlatın
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
   public void tearDown()  {
      driver.close();
  }

    @Test
    public void test01() {
        // https://www.amazon.com/ sayfasina gidin
        driver.get("https://www.amazon.com/");

        // dropdown'dan "Books" secenegini secin  (dropdown uc adimda handle edilir
        //1.adim:locate ettik
        WebElement dropdownMenu = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        //2.adim Select objesi olusturulmali
        Select select = new Select(dropdownMenu);

        //3.adim:opsion secilir
        select.selectByVisibleText("Books");
        // select.selectByValue("search-alias=stripbooks-intl-ship");//value ile almak icin html kodlarindan book'un value degerini aliriz
        // select.selectByIndex(5);  //books 'un kacinci indexte oldugunu sayariz ve yazariz   index "0" dan baslar.

        // arama cubuguna "Java" aratın
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Java", Keys.ENTER);

        // arama sonuclarinin Java icerdigini test edin
        WebElement sonuc = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        String aramaSyazisi = sonuc.getText();
        Assert.assertTrue(aramaSyazisi.contains("Java"));

    }
}