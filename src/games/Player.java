package games;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Player {
    String name;
    int salary;
    LocalDate dob;
    Team team;

    public Player(String name, int salary, LocalDate dob) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + this.name + '\'' +
                ", salary=" + this.salary +
                ", dob=" + this.dob.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) +
                ", team=" + this.team.name +
                '}';
    }

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
