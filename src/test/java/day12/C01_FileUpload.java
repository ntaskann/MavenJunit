package day12;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_FileUpload extends TestBase {

    //Tests packagenin altina bir class oluşturun : C05_UploadFile
    //https://the-internet.herokuapp.com/upload adresine gidelim
    //chooseFile butonuna basalim
    //Yuklemek istediginiz dosyayi secelim.
    //Upload butonuna basalim.
    //“File Uploaded!” textinin goruntulendigini test edelim.

    @Test
    public void fileUploadTest() {

        //https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");

        //chooseFile butonuna basalim
        WebElement chooseFileButton = driver.findElement(By.id("file-upload"));

        //Yuklemek istediginiz dosyayi secelim.
        String dosyaYolu = System.getProperty("user.home") + "/Desktop/logo.jpeg";
        chooseFileButton.sendKeys(dosyaYolu);
        waitFor(4);

        /*
            chooseFileButton una yuklemek istedigim dosyanın path ini gondererek dosyayı sectim.
         */

        //Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();

        //“File Uploaded!” textinin goruntulendigini test edelim.
        Assert.assertEquals("File Uploaded!", driver.findElement(By.xpath("//h3")).getText());
        waitFor(4);


    }
}
