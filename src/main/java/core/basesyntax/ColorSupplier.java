package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public static Colors getRandomColor() {

        final Random random = new Random();
        Colors[] colors = Colors.values();
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex];
    }
}
