package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GameDAO {
    private static ArrayList<Game> games;
    private static final String FILE_PATH = "JavaFinalProject/src/main/resources/";
    private static final String FILE_NAME = "games.csv";
    private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
    public static void retrieveData() {
        if(games == null) {
            try (Scanner scanner = new Scanner(new File(FILE_PATH + FILE_NAME))){
                games = new ArrayList<>();
                scanner.nextLine(); // read in the header row and don't do anything with it.
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] values = line.split(",");
                    Game game = new Game();
                    game.setTitle(values[0]);
                    game.setNumCopySold(Integer.parseInt(values[1]));
                    game.setPrice(Double.parseDouble(values[2]));
                    game.setPlayed(Boolean.parseBoolean(values[3]));
                    game.setReleaseDate(LocalDate.parse(values[4]));
                    // set remaining values here
                    games.add(game);
                }
                Collections.sort(games);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
        }
    }

    private static void writeData() {
        try(PrintWriter writer = new PrintWriter(new File(FILE_PATH + FILE_NAME))) {
            writer.println("title,numCopySold,price,played,releaseDate");
            for(Game game: games) {
                writer.printf("%s,%s,%s,%s,%s\n",
                        game.getTitle().toUpperCase(),
                        game.getNumCopySold(),
                        game.getPrice(),
                        game.getPrice(),
                        game.getReleaseDate()
                );
            }
        } catch(FileNotFoundException e) {

        }
    }

    public static ArrayList<Game> getGames() {
        return games;
    }

    public static Game getGame(String title) {
        return null;
    }
    public static void addGame(Game game) {
        games.add(game);
        writeData();
    }
    public static void updateGame(Game game) {

    }
    public static void deleteGame(Game game) {

    }
}
