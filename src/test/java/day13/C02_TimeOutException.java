package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class C02_TimeOutException extends TestBase {

    /*
           TimeOutException explicit wait kullandıgımda ve locater bulunamadıgında alırım
     */

    @Test
    public void timeOutExceptionTest() {
        driver.get("https://www.techproeducation.com");
        //explicit wait icin olusturdugum methodlardan kullandım
        //Parametre 1: beklemek istedigim element, Parametre 2: Max Süre
        //waitForVisibility(By.xpath("//input[@type='searchh']"), 15)//org.openqa.selenium.TimeoutException
        //.sendKeys("QA", Keys.ENTER);

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Yanlıs id")));//org.openqa.selenium.TimeoutException


    }

}
