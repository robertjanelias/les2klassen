package games;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Game {
    Team homeTeam;
    Team awayTeam;
    short homeGoals;
    short awayGoals;
    LocalDateTime gameTime;

    public Game(Team homeTeam, Team awayTeam, LocalDateTime gameTime) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.gameTime = gameTime;
    }

    public void addGoal(boolean isHomeTeamGoal) {
        if (isHomeTeamGoal) {
            this.homeGoals++;
        }
        else {
            this.awayGoals++;
        }
    }

    @Override
    public String toString() {
        return this.gameTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")) + " => " + homeTeam.name + " tegen " + awayTeam.name + ": " + homeGoals + "-" + awayGoals;
    }
}
