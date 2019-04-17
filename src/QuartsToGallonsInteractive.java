import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        int numberOfQuartsInputed;
        final int NUM_QUARTS_IN_GALLON = 4;
        int remainderOfQuarts;
        int NumberOfGallons;

        Scanner Keyboard = new Scanner(System.in);

        System.out.println("Plesase enter the number of quarts needed to do the job>>>");
        numberOfQuartsInputed = Keyboard.nextInt();

        NumberOfGallons = numberOfQuartsInputed / NUM_QUARTS_IN_GALLON;
        remainderOfQuarts = numberOfQuartsInputed % NUM_QUARTS_IN_GALLON;

        System.out.println("The number of gallons is " + NumberOfGallons + " and the number of quarts remining is" + remainderOfQuarts);

    }
}
