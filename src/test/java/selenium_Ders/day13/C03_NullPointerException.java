package selenium_Ders.day13;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class C03_NullPointerException {


    WebDriver driver;
            @Test
    public void nullPointerExceptionTest(){

                driver.get("https://www.techproeducation.com"); //java.lang.NullPointerException


            }
    @Test
    public void nullPointerExceptionTest2(){
        Faker faker = new Faker();
        System.out.println(faker.name().fullName());//java.lang.NullPointerException
    }


}
