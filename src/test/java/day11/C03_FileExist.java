package day11;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_FileExist {

    @Test
    public void isExistTest() {

        String userDIR = System.getProperty("user.dir");
        System.out.println(userDIR);

        String userHome = System.getProperty("user.home");
        System.out.println(userHome);

        //logo.jpeg indir masaüstüne kaydet

        String dosyaYolu = userHome + "\\Desktop\\logo.jpeg";
        System.out.println("dosyaYolu = " + dosyaYolu);

        boolean isExist = Files.exists(Paths.get(dosyaYolu));//dosya var ise true yoksa false verir.
        Assert.assertTrue(isExist);


    }
}
