public class Player {
    private String name;
    private int highScore;
    private int numberOfGames;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHighScore() {
        return highScore;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    @Override
    public String toString() {
        return String.format("Name: %s%nHighscore: %d%nPlayed rounds: %s", name, highScore, numberOfGames);
    }
}
