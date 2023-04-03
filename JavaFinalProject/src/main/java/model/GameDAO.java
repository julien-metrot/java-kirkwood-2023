package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameDAO {
    public static void retrieveData() throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File("JavaFinalProject/src/main/resources/games.svg"))){
            System.out.println("I found it!");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
