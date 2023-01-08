package day11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01_Actions5 extends TestBase {

   //Create a class: Action5
   //Create a method keyboardActions
   //Google a gidin https://www.google.com
   //‘iPhone X fiyatlari’ yazdir (SHIFT TUSUNA BASILARAK)
   //‘ cok pahali!’ Yazdır (SHIFT TUSUNA BASILMAYARAK)
   //Ve ENTER tusuna bas


    @Test
    public void keyboardActions(){

        //Google a gidin https://www.google.com
        driver.get("https://www.google.com");

        //‘iPhone X fiyatlari’ yazdir (SHIFT TUSUNA BASILARAK)
        //‘ cok pahali!’ Yazdır (SHIFT TUSUNA BASILMAYARAK)
        //Ve ENTER tusuna bas

        Actions actions=new Actions(driver);
        WebElement searchBox=driver.findElement(By.xpath("//*[@class='gLFyf']"));
        actions.
                keyDown(Keys.SHIFT). //Arama kutusu uzerinde Shift tusuna bas
                sendKeys("iPhone X fiyatlari").//Shifte yazılı iken yazı yaz
                keyUp(Keys.SHIFT). //Shift'e artuk basma   ->fonksiyonu artık devam ettirmek istemiyorum
                sendKeys(" cok pahali!",Keys.ENTER).
                build().
                perform();

    }
}
