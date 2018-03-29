package app;

import argument_parser.ArgumentParser;
import city.City;
import greet_generator.Greeter;

public class App {

    public static void main(String[] args) {
        ArgumentParser parser = new ArgumentParser();
        Greeter greeter = new Greeter();
        City city;
        try {
            city = parser.parseArguments(args);
            greeter.greet(city);
        } catch (Exception ex) {
           
        }
        
    }

}
