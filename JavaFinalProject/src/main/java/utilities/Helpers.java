package utilities;

import java.util.Scanner;

public class Helpers {
    public static int getChoice(Scanner scanner, String[] strArray) {
        int choice = 1;
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(choice + ") " + strArray[i]);
            choice++;
        }
        System.out.println(choice + ") Exit");
        return UserInput.getInt(scanner, "Choose an option", 1, strArray.length + 1);
    }

    public static void pressEnterToContinue(Scanner scanner) {
        UserInput.getString(scanner, "Press enter to continue");
    }
}
