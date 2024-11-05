public class Player {
    private String name;
    private int highScore;
    private int numberOfGames;

    public Player(String name, int highScore, int numberOfGames) {
        this.name = name;
        this.highScore = highScore;
        this.numberOfGames = numberOfGames;
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
        return String.format("Namn: %s%nHighscore: %d%nSpelade omgångar: %s", name, highScore, numberOfGames);
    }
}