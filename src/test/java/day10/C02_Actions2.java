package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_Actions2 extends TestBase {

    //Class: Actions2
    //Method : hoverOver() and test the following scenario:
    //Amazon a gidelim https://www.amazon.com/
    //Sag ust bolumde bulunan “Account & Lists” menüsüne git
    //“Account” secenegine tikka
    //Acilan sayfanin Title in “Your Account” icerdigini dogrula

    @Test
    public void hoverOverTest(){

        //Amazon a gidelim https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Actions objesi olustur
        Actions actions=new Actions(driver);

        //Elementi bul
        WebElement accountList=driver.findElement(By.id("nav-link-accountList"));
        waitFor(1);

        //Methodu kullan
        actions.moveToElement(accountList).perform();
        waitFor(3);

        //“Account” secenegine tikka
        driver.findElement(By.linkText("Account")).click();
        Assert.assertTrue(driver.getTitle().contains("Your Account"));


    }


}
