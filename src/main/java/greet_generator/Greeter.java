package greet_generator;

import city.City;
import resource_manager.ResourceManager;
import time_zone_determinant.TimeZoneDeterminant;

public class Greeter {

    private final ResourceManager resourceManager;
    private final GreetGenerator greetGenerator;
    private final TimeZoneDeterminant timeZoneDeterminant;

    public Greeter() {
        resourceManager = new ResourceManager();
        greetGenerator = new GreetGenerator(resourceManager.getResourceBundle());
        timeZoneDeterminant = new TimeZoneDeterminant();
    }

    private void sayHelloTo(City city) {
        int hours = timeZoneDeterminant.getHoursFrom(city.getTimeZone());
        String greeting = greetGenerator.generateGreeting(city.getCityName(), hours);
        System.out.println(greeting);
    }

    public void greet(City city) {
        if (city.getTimeZone() == null) {
            String timeZone = timeZoneDeterminant.getTimeZoneBy(city.getCityName());
            city.setTimeZone(timeZone);
            sayHelloTo(city);
        } else {
            sayHelloTo(city);
        }
    }
}
