package enums;

import java.util.Random;

public enum Colors {
    RED("My favorite color is "),
    GREEN("My second favorite color is "),
    BLUE("My third favorite color is ");

    private final String message;


    Colors(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message + this.name();
    }

    public static String getRandomColor() {
        Colors[] colors = Colors.values();
        Random random = new Random();
        return colors[random.nextInt(colors.length)].name();
    }
}