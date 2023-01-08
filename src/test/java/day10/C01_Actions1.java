package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01_Actions1 extends TestBase {

    @Test
    public void rightClick() {

        //1.https://the-internet.herokuapp.com/context_menu  sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");

        //2.Actions objesi olustur
        Actions actions = new Actions(driver);

        //3.Elementi locate et
        WebElement kutu = driver.findElement(By.cssSelector("div[id='hot-spot']"));

        //4.Kutuya sag tıklayın
        //Tüm Actions lar actions ile baslar, perform() ile biter
        actions.contextClick(kutu).perform();

        //4.Alert’te cikan yazinin “You selected a context menu” oldugunu test edin
        String alertText=driver.switchTo().alert().getText();
        Assert.assertEquals("You selected a context menu",alertText);
        System.out.println("alertText = " + alertText);

        //6.Tamam diyerek alert’i kapatın
        driver.switchTo().alert().accept();


    }
}
