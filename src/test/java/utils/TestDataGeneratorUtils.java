package utils;

import com.github.javafaker.Faker;
import context.ScenarioContext;
import entity.User;

import java.text.SimpleDateFormat;

public class TestDataGeneratorUtils {
    private static final Faker faker = new Faker();

    public static String getRandomFirstName() {
        return faker.name().firstName();
    }

    public static String getRandomLastName() {
        return faker.name().lastName();
    }

    public static String getRandomPassword() {
        int minLength = 7;
        int maxLength = 10;
        return faker.internet().password(minLength, maxLength);
    }

    public static String getRandomEmail() {
        String randomPrefix = faker.lorem().characters(5); // Generate 5 random characters
        return randomPrefix + faker.internet().safeEmailAddress();
    }

    public static String getNegativeRandomFirstName() {
        return faker.lorem().characters(21);
    }

    public static String getNegativeRandomLastName() {
        return faker.lorem().characters(21);
    }

    public static String getNegativeRandomEmail() {
        return faker.lorem().characters(5);
    }

    public static String getNegativeRandomPassword() {
        int minLength = 1;
        int maxLength = 6;
        return faker.internet().password(minLength, maxLength);
    }

    public static String getRandomDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(faker.date().birthday());
    }

    public static String getRandomPhoneNumber() {
        return faker.numerify("##########");
    }

    public static String getRandomStreetAddress() {
        return faker.address().streetAddress();
    }

    public static String getRandomCity() {
        return faker.address().cityName();
    }

    public static String getState() {
        return faker.address().state();
    }

    public static String getPostalCode() {
        return faker.address().zipCode();
    }

    public static String getCountry() {
        return faker.address().country();
    }

    //TODO user entity


    public void generateCredentials() {
        User user = new User(getRandomFirstName(), getRandomLastName(), getRandomEmail(), getRandomPassword());
        ScenarioContext.INSTANCE.setContext("user", user);
    }
}
