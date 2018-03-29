package argument_parser;

public class ArgumentParser {

    public boolean isValidArguments( String[] args) throws Exception {
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

}
