public class Player {
    private String name;
    private int highScore;
    private int roundsPlayed;

    public Player(String name) {
        this.name = name;
        this.highScore = 0;
        this.roundsPlayed = 0;
    }

    public String getName() {
        return name;
    }

    public int getHighScore() {
        return highScore;
    }

    public int getroundsPlayed() {
        return roundsPlayed;
    }

    public void countRounds() {
        roundsPlayed++;
    }

    public void newHighScore() {
        highScore++;
    }

    @Override
    public String toString() {
        return String.format("Name: %s%nHighscore: %d%nPlayed rounds: %s", name, highScore, roundsPlayed);
    }
}
