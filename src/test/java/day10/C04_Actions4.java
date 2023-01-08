package day10;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C04_Actions4 extends TestBase {

    //Class: Action4
    //Method: dragAndDropTest
    //Given user is on https://jqueryui.com/droppable/
    //And user moves the target element(Drag me to my target) in to  destination(Drop here)

    @Test
    public void dragAndDropTest() {

        //Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");

        //And user moves the target element(Drag me to my target) in to  destination(Drop here)
        driver.switchTo().frame(0);
        WebElement kaynak = driver.findElement(By.id("draggable"));
        WebElement hedef = driver.findElement(By.id("droppable"));


        Actions actions = new Actions(driver);
        actions.dragAndDrop(kaynak, hedef).perform();
        waitFor(4);

        //Note: dragAndDrop(kaynak,hedef) elementi tutup istedigimiz yere sürükleyip bırakır.
        //      2 parametre ile calisir. Kaynak ve hedef elementleri yazmamız gerekir
    }

    @Test
    public void clickAndHoldTest() {

        //Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");

        //And user moves the target element(Drag me to my target) in to  destination(Drop here)
        driver.switchTo().frame(0);
        WebElement kaynak = driver.findElement(By.id("draggable"));
        WebElement hedef = driver.findElement(By.id("droppable"));


        Actions actions = new Actions(driver);
        actions.
                clickAndHold(kaynak).//kaynagi tut
                moveToElement(hedef).//hedefe koy
                release().           //kaynagi birak
                build().             //onceki methodların iliskisini kur/guclendir. Birden fazla method kullanılırsa kullanilmasi tercih edilir
                perform();
    }

    @Test
    public void moveByOffSetTest() {

        //Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");

        //And user moves the target element(Drag me to my target) in to  destination(Drop here)
        driver.switchTo().frame(0);
        WebElement kaynak = driver.findElement(By.id("draggable"));

        Actions actions = new Actions(driver);

        actions.
                clickAndHold(kaynak).
                moveByOffset(430,30 ).
                build().
                perform();

    }
}
