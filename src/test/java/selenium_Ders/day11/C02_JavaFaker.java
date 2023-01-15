package selenium_Ders.day11;

import com.github.javafaker.Faker;
import org.junit.Test;


public class C02_JavaFaker {

    Faker faker;
    @Test
    public void javaFakerTest() {
        // 1. Faker objesi olustur
        Faker faker = new Faker();

        //2.Faker objesi ile fake data olustur

        String fName = faker.name().firstName();
        System.out.println(fName);

        //last Name datasi
        String lName = faker.name().lastName();
        System.out.println(lName);

//kullanici adi
        String username =faker.name().username();
        System.out.println(username);

//meslek ismi
        System.out.println(faker.name().title());

        //sehir
        System.out.println(faker.address().city());
        //eyalet
        System.out.println(faker.address().state());
        //full addres
        System.out.println(faker.address().fullAddress());

        //cep telefonu
        System.out.println(faker.phoneNumber().cellPhone());

        //email
        System.out.println(faker.internet().emailAddress());

        //possta kodu
        System.out.println(faker.address().zipCode());

        //rastgele 10 haneli numara

        System.out.println(faker.number().digits(10));

        /*
        TEST DATA : kullanici adi, sifre, tel no, email, sehir, kredi kart no...
        -Test datalarini kimden alinir
        1.BA-Business anaylist
        2.Test lead
        3.Manual Tester
        4.Tech Lead & Team Lead & Dev Lead
        5. Developer
        6.Database
        7.API call lar
        8.Documantasyonlar. ornegin API swagger documani
        9.Java Faker da fake data almak icin kullaniyoruz

        Nereden gelmez?
        -Kullanicidan
        -Scrum master


         */



    }
}
