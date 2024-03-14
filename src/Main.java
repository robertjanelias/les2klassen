import games.Game;
import games.Player;
import games.Team;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player("Lieke Martens", 1_000_000, LocalDate.of(1992, 12, 16));
        Player p2 = new Player("Virgil van Dijk", 500_000, LocalDate.of(1991, 7, 8));

        Team t1 = new Team("PSV", "Eindhoven");
        t1.addPlayer(p1);

        Team t2 = new Team("Ajax", "Amsterdam");
        t2.addPlayer(p2);

        Game g1 = new Game(t2, t1, LocalDateTime.now());
        g1.addGoal(true);
        g1.addGoal(false);
        g1.addGoal(true);
        g1.addGoal(true);
        System.out.println(g1);

        System.exit(0);     // stop executing program

        ArrayList<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("blue");

        colours.add("yellow");
        System.out.println(colours);

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,3,5,7));
        numbers.add(123);
        System.out.println(numbers);
    }
}
