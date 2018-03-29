package greet_generator;

import java.util.ResourceBundle;

public class GreetGenerator {

    private final ResourceBundle bundle;

    public GreetGenerator(ResourceBundle bundle) {
        this.bundle = bundle;
    }

    public String generateGreeting(String city, int hours) throws IllegalArgumentException {
        String greeting;
        if (hours > 24) {
            throw new IllegalArgumentException("value of hours must be between 0-24");
        }
        if (hours > 6 && hours <= 9) {
            greeting = bundle.getString("morningGreet");
        } else if (hours > 9 && hours <= 19) {
            greeting = bundle.getString("dayGreet");
        } else if (hours > 19 && hours <= 23) {
            greeting = bundle.getString("eveningGreet");
        } else {
            greeting = bundle.getString("nightGreet");
        }
        return greeting + " " + city + "!";
    }

}
