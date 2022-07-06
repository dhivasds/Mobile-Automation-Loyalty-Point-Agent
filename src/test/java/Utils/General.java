package Utils;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class General {
    Random rand = new Random();
    Faker faker = new Faker(new Locale("in-ID"));

    public String randomEmail(String input){ return faker.internet().emailAddress(); }
    public String randomName(String name) { return faker.name().fullName(); }
    public String randomPassword(String password) { return faker.internet().password(10,20);}
//    Minimun password 10, maximumnya 20 Karakter

}
