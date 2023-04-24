package model;

import utilities.Helpers;

import java.time.LocalDate;

public class Game implements Comparable<Game> {
    private String title;
    private int numCopySold;
    private double price;
    private boolean played;
    private LocalDate releaseDate;
    private static int gameCount = 0;

    public Game() {
        title = "Unknown";
        numCopySold = 0;
        price = 0;
        played = false;
        releaseDate = LocalDate.now();
    }

    public Game(String title, int numCopySold, double price, boolean played, LocalDate releaseDate) {
        this.title = title;
        this.numCopySold = numCopySold;
        this.price = price;
        this.played = played;
        this.releaseDate = releaseDate;
        gameCount++;
    }

    public String getTitle() {
        return title;
    }

    public int getNumCopySold() {
        return numCopySold;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPlayed() {
        return played;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public static int getGameCount() {
        return gameCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumCopySold(int numCopySold) {
        this.numCopySold = numCopySold;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPlayed(boolean played) {
        this.played = played;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Game o) {
        return this.title.compareTo(o.title);
    }

    public static String getHeaderRow() {
        return String.format("%-30s\t%-20s\t%10s\t%20s\t%-6s",
                "Title", "Release Date", "Price", "Copies Sold", "Played");
    }

    public String toString() {
        return String.format("%-30s\t%-20s\t%10s\t%20s\t%-6s",
                this.title, Helpers.formatDate(this.releaseDate),
                Helpers.formatCurrency(this.price),
                Helpers.formatCopySold(this.numCopySold),
                (this.played ? "Yes" : "No"));
    }
}
