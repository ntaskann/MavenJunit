package day10;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C03_Actions3 extends TestBase {

    //Class: ActionClass3
    //Method : scrollUpDown()
    //https://techproeducation.com a git
    //Sayfanin altına doğru gidelim
    //Sonra sayfanın üstüne doğru gidelim

    @Test
    public void scrollUpDown() {

        //https://techproeducation.com a git
        driver.get("https://techproeducation.com");

        Actions actions = new Actions(driver);

        //Sayfanin altına doğru gidelim
        waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).perform();

        //ARROW_DOWN(Klavye fonksiyonu) PAGE_DOWN'dan daha az mesafe alir.
        actions.sendKeys(Keys.ARROW_DOWN).perform();

        //Sonra sayfanın üstüne doğru gidelim
        //Yukari cik
        actions.sendKeys(Keys.PAGE_UP).perform();
        waitFor(3);
        //Yukari cik
        actions.sendKeys(Keys.ARROW_UP).perform();
        waitFor(3);

        //actions.sendKeys(Keys.ARROW_RIGHT).perform();  -> SAGA git
        //actions.sendKeys(Keys.ARROW_LEFT).perform();   -> SOLA git

    }
}
