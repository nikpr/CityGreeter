package argument_parser;

import city.City;

public class ArgumentParser {

    public City parseArguments(String[] args) throws Exception {
        if (isValidArguments(args));
        return createCity(args);
    }

    private boolean isValidArguments(String[] args) throws Exception {
        if (!isValidLength(args)) {
            throw new Exception("Wrong number of arguments");
        }
        for (String argument : args) {
            if (!isLatinLetters(argument) || hasSpaces(argument)) {
                throw new IllegalArgumentException("Illegal argument");
            }
        }
        return true;
    }

    private boolean isValidLength(String[] args) {
        return (args.length >= 1 && args.length <= 2);
    }

    private boolean isLatinLetters(String word) {
        return word.matches("^[a-zA-Z_/]+$");
    }

    private boolean hasSpaces(String word) {
        return word.contains(" ");
    }

    private City createCity(String[] args) {
        City city = new City();
        if (args.length == 2) {
            city.setCityName(args[0]);
            city.setTimeZone(args[1]);
        }
        if (args.length == 1) {
            city.setCityName(args[0]);
        }
        return city;
    }

}
