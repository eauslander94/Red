package me.pavva.pokejava.moves;

import me.pavva.pokejava.Move;
import me.pavva.pokejava.Type;


public class FireMove extends Move {

    public FireMove(String name, int power, int points) {
        super(name, Type.FIRE, power, points);
    }

    public static Move fireBlast = new FireMove("Fire Blast", 120, 8);
}
