import games.Player;
import games.Team;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player("Lieke Martens", 1_000_000, LocalDate.of(1992, 12, 16));
        Player p2 = new Player("Virgil van Dijk", 500_000, LocalDate.of(1991, 7, 8));

        Team t1 = new Team("PSV", "Eindhoven");
        t1.addPlayer(p1);
        t1.addPlayer(p2);

        System.out.println(t1);

        System.exit(0);

        ArrayList<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("blue");;

        colours.add("yellow");
        System.out.println(colours);

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,3,5,7));
        numbers.add(123);
        System.out.println(numbers);
    }
}
