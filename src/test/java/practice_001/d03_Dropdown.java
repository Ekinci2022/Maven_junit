package practice_001;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
import java.util.List;
public class d03_Dropdown extends TestBase {
    @Test
    public void test01() {
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        //Dropdown menuyu yazdıralım
        List<WebElement> dropdown = driver.findElements(By.xpath("//*[@id='searchDropdownBox']"));
        //Select select = new Select(dropdown);
      for (WebElement w: dropdown){
          System.out.println(w.getText());
      }
      //  dropdown.forEach(t-> System.out.println(t.getText()));
        //Dropdown menuden baby secelim   //arama bölümünden milk aratalım

        //arama bölümünden milk aratalım
        driver.findElement(By.xpath("//*[@id='searchDropdownBox']")).sendKeys("Baby"
                , Keys.TAB,"Milk",Keys.ENTER);
    }
}