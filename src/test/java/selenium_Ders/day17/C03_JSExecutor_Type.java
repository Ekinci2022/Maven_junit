package selenium_Ders.day17;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C03_JSExecutor_Type extends TestBase {

    @Test
    public void TypeTest() {

        /*
typeTest metotu olustur
Techpro education ana sayfasina git
Arama kutusuna QA yaz
 */

        //    Techpro education ana sayfasina git
            driver.get("https://www.techproeducation.com");
            waitFor(3);
            typeWithJS(driver.findElement(By.xpath("//input[@type='search']")),"QA");
        }
    }

