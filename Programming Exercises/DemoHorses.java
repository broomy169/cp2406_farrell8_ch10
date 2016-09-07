/**
 * Created by Graeme on 6/09/2016.
 */
public class DemoHorses {
    public static void main(String[] args) {
        Horse horse = new Horse();
        RaceHorse raceHorse = new RaceHorse();
        horse.setName("Rudolf");
        horse.setColour("Brown");
        horse.setBirthYear(2001);
        raceHorse.setName("Black Caviar");
        raceHorse.setColour("Black");
        raceHorse.setBirthYear(2006);
        raceHorse.setRaces(25);

        System.out.println(horse.getName() + " is " + horse.getColour() +
            " and was born in " + horse.getBirthYear());
        System.out.println(raceHorse.getName() + " is " + raceHorse.getColour() +
            ", was born in " + raceHorse.getBirthYear() + " and was in " +
                raceHorse.getRaces() + " races");

    }
}
