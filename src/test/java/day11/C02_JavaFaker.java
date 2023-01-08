package day11;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C02_JavaFaker {

    Faker faker;

    @Test
    public void javaFakerTest() {

        //Faker objesi olustur
        faker = new Faker();

        //Faker objesi ile fake data olustur
        System.out.println("firstName   = " + faker.name().firstName());

        System.out.println("lastName    = " + faker.name().lastName());

        System.out.println("userName    = " + faker.name().username());

        System.out.println("Meslek ismi = "+faker.name().title());

        System.out.println("Sehir ismi  = "+faker.address().city());

        System.out.println("Eyalet ismi = "+faker.address().state());

        System.out.println("Full Adres  = "+faker.address().fullAddress());

        System.out.println("Tel No      = "+faker.phoneNumber().cellPhone());

        System.out.println("Email       = "+faker.internet().emailAddress());

        System.out.println("Posta kodu  = "+faker.address().zipCode());

        System.out.println("15 haneli no= "+faker.number().digits(15));

    }
}
