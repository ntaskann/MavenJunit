package day09;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class C04_Cookies extends TestBase {

    // Method: handleCookies
    // Amazona git
    // 1.toplam cookie sayisini bul
    // 3. Bir Cookie yi smiyle bul
    // 4. Yeni bir cookie ekle
    // 5. Bir Cookie yi ismiyle sil
    // 6. Tum cookie leri sil

    @Test
    public void handleCookies() {

        // Amazona git
        driver.get("https://www.amazon.com");
        waitFor(2);

        // 1.toplam cookie sayisini bul
        Set<Cookie> allCookies = driver.manage().getCookies();
        System.out.println("Sayfada " + allCookies.size() + " adet cookie var");

        // 3. Bir Cookie yi ismiyle bul
        driver.manage().getCookieNamed("i18n-prefs");

        //tüm cooki leri yazdıralım
        for (Cookie w : allCookies) {
            System.out.println(w);//Cookie nin tamamını yazdırdık
            System.out.println(w.getName());
        }
        System.out.println("----------");
        allCookies.stream().forEach(t -> System.out.println(t.getName()));

        // 4. Yeni bir cookie ekle
        Cookie favoriCookiem = new Cookie("Cikolatam", "antep-fistikli-cikolata");
        driver.manage().addCookie(favoriCookiem);
        System.out.println("Yeni Cookie Sayısı :" + driver.manage().getCookies().size());

        // 5. Bir Cookie yi ismiyle sil
        driver.manage().deleteCookieNamed("i18n-prefs");
        // 6. Tum cookie leri sil
        driver.manage().deleteAllCookies();
        System.out.println("Son Cookie Sayısı :"+driver.manage().getCookies().size());
    }
}
