package day09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_WindowHandle2 extends TestBase {

    //        https://the-internet.herokuapp.com/windows adresine gidin.
    //        Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
    //        Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
    //        Click Here butonuna basın.
    //        Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.


    @Test
    public void test() {

        //https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");

        //Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        String actualWindow1Text = driver.findElement(By.xpath("//h3")).getText();
        String expecteWindow1Text = "Opening a new window";
        Assert.assertEquals(expecteWindow1Text, actualWindow1Text);

        //Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String actualWindow1Title = driver.getTitle();
        String expectedWindow1Title = "The Internet";
        Assert.assertEquals(expectedWindow1Title, actualWindow1Title);

        //Click Here butonuna basın.
        driver.findElement(By.xpath("//*[.='Click Here']")).click();

        waitFor(3);

        //Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        switchToWindow(1);
        String actualWindow2Title = driver.getTitle();
        String expectedWindow2Title = "New Window";


    }
}
