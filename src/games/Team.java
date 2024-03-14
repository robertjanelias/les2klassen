package games;

import java.util.ArrayList;

public class Team {
    String name;
    String city;
    ArrayList<Player> players;

    public Team(String name, String city) {
        this.name = name;
        this.city = city;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player p) {
        this.players.add(p);
        p.setTeam(this);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", players=" + players +
                '}';
    }
}
