package me.pavva.pokejava.moves;

import me.pavva.pokejava.Move;
import me.pavva.pokejava.Type;


public class NormalMove extends Move {

    public NormalMove(String name, int power, int points) {
        super(name, Type.NORMAL, power, points);
    }

    public static Move skullBash = new NormalMove("Skull Bash", 130, 10);
    public static Move pound = new NormalMove("Pound", 40, 35);
    public static Move bodySlam = new NormalMove("Body Slam", 85, 15);
    public static Move tackle = new NormalMove("Tackle", 40, 35);
}
