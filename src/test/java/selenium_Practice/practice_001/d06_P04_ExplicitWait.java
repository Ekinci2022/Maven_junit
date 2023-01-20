package selenium_Practice.practice_001;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class d06_P04_ExplicitWait extends TestBase {


     /*
                                    - Explicit Wait -
        Selenium’da Explicit Wait, Web Sürücüsüne belirli koşulları (Expected Condition) veya
    “ElementNotVisibleException” exception’ı atmadan önce aşılan maksimum süreyi beklemesini söylemek için kullanılır.
    Akıllı bir bekleme türüdür ancak yalnızca belirli öğeler(elementler) için uygulanabilir.
    Dinamik olarak yüklenen web elementleri beklerken implicit wait’ten daha iyi seçenekler sunar.
        Explicit Wait kullandığımızda, “ExpectedConditions” tanımlamalıyız veya Fluent Wait kullanarak durumu ne
    sıklıkla kontrol etmek istediğimizi yapılandırmalıyız.
Syntax:
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
      WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(element locator));
     */





    @Test
    public void visibility() {
//https://automationfc.github.io/dynamic-loading/ sayfasına gidelim

        driver.get("https://automationfc.github.io/dynamic-loading/");

        //Start button'nuna basalım
        driver.findElement(By.xpath("//button['Start']")).click();



//Hello World! yazısının çıktığını doğrulayalım


        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Hello World!']")));
        //start butonuna bastiktan sonra Hello World! yazisi gorunene kadar bekledik.


        assert  driver.findElement(By.xpath("//*[text()='Hello World!']")).isDisplayed();
        
        
    }

    @Test
    public void invisibility() {


        //https://automationfc.github.io/dynamic-loading/ sayfasına gidelim

        driver.get("https://automationfc.github.io/dynamic-loading/");

        //Start button'nuna basalım
        driver.findElement(By.xpath("//button['Start']")).click();



//Hello World! yazısının çıktığını doğrulayalım


        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Loading... ']")));
        //start butonuna bastiktan sonra Hello World! yazisi gorunene kadar bekledik.


        assert  driver.findElement(By.xpath("//*[text()='Loading... ']")).isDisplayed();

        //*[text()='Loading... ']
    }
}
