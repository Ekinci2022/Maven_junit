package selenium_Ders.day12;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_FileUpload extends TestBase {
    @Test
    public void fileUploadTest() {
        driver.get("https://the-internet.herokuapp.com/upload");
//    chooseFile butonuna basalim
        WebElement chooseFileButton = driver.findElement(By.id("file-upload"));
        waitFor(3);
//    Yuklemek istediginiz dosyayi secelim.
        String dosyaYolu = System.getProperty("user.home")+"\\OneDrive\\Desktop\\logo.jpeg.jpg";
        //"C:\Users\abdul\OneDrive\Desktop\logo.jpeg.jpg"
        //C:\Users\akgun\OneDrive\Desktop
        chooseFileButton.sendKeys(dosyaYolu);
        waitFor(5);
       // "File Uploader" textinin goruntulendigini test edelim.
        String uploaderYazisi = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("File Uploader",uploaderYazisi);


//    Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();

//    "File Uploaded!" textinin goruntulendigini test edelim.
        String uploadedYazisi = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("File Uploaded!",uploadedYazisi);



//        https://the-internet.herokuapp.com/dynamic_loading/1
//        Start buttonuna tıkla
//        Hello World! Yazının sitede oldugunu test et

    }
}

//"C:\Users\abdul\OneDrive\Desktop\logo.jpeg.jpg"