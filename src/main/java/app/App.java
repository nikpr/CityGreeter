package app;

import argument_parser.ArgumentParser;
import city.City;
import greet_generator.Greeter;
import org.apache.log4j.Logger;

public class App {

    private static final Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) {
        ArgumentParser parser = new ArgumentParser();
        Greeter greeter = new Greeter();
        City city;
        try {
            city = parser.parseArguments(args);
            greeter.greet(city);
            logger.info("Greetings for: " + city.getCityName());
        } catch (Exception ex) {
            logger.error(ex);
        }

    }

}
