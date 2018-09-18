package me.pavva.pokejava;

import java.util.ArrayList;
import java.util.Random;

/**
 * The class file which contains the constructor, get-set methods
 *
 * @author Pranav A.   Github: 20avva
 * @version 1.0
 * @see me.pavva.pokejava.App
 */
public class Pokemon { //Pokemon Object Constructors and get-set methods

    private final String    name;
    private final Type      type;
    private double          health;
    private final int       attack;
    private final int       defense;
    private final int       special;
    private ArrayList<Move> moveList;
    private final Move      move1;
    private final Move      move2;
    private final Move      move3;
    private final Move      move4;

    /**
     * Pokemon object constructor with params passed in
     *
     * @param name    The String name of the Pokemon. Seen only by the user.
     * @param type    The Type of the Pokemon.
     * @param health  The double health value of the Pokemon.
     * @param attack  The int attack value of the Pokemon.
     * @param defense The int defense value of the Pokemon.
     * @param move1   The first move a Pokemon knows.
     * @param move2   The second move a Pokemon knows
     * @param move3   The third move a Pokemon knows
     * @param move4   The fourth move a Pokemon knows
     */
    public Pokemon(String name, Type type, double health, int attack, int defense, int special, Move move1, Move move2, Move move3, Move move4) {

        this.name = name;
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.special = special;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;

        this.moveList = new ArrayList<Move>();
        this.moveList.add(move1);
        this.moveList.add(move2);
        this.moveList.add(move3);
        this.moveList.add(move4);
    }

    /**
     * Default pokemon object constructor, no params passed in
     */
    public Pokemon() {
        this.name = null;
        this.type = null;
        this.health = 0.0;
        this.attack = 0;
        this.defense = 0;
        this.special = 0;
        this.move1 = null;
        this.move2 = null;
        this.move3 = null;
        this.move4 = null;
    }

    /**
     * Sets the new health value of a pokemon
     *
     * @param health The new health of a pokemon
     */
    public void setHealth(double health) {

        this.health = health;
    }

    /**
     * Returns the name of the pokemon
     *
     * @return name    The name of the pokemon
     */
    public String getName() {

        return this.name;
    }

    /**
     * Returns the type of the pokemon
     *
     * @return type    The type of the pokemon
     */
    public Type getType() {

        return this.type;
    }

    /**
     * Returns the current health of the pokemon
     *
     * @return health  The health of the pokemon
     */
    public double getHealth() {

        return this.health;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getSpecial() {
      return this.special;
    }

    public ArrayList<Move> getMoveList() {
        return this.moveList;
    }

    // Returns move based on string name of move.
    // If pokemon does not know this move, returns random move
    public Move getMove(String moveName){
      if(this.moveList.isEmpty()) return null;
      for(int i = 0; i < this.moveList.size(); i++){
        if(this.moveList.get(i).getName() == moveName)
          return this.moveList.get(i);
      }
      return this.moveList.get(new Random().nextInt(this.moveList.size()));
    }

}
