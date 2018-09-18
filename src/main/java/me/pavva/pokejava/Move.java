package me.pavva.pokejava;
import java.util.Random;

/**
 * A class which contains a Move constuctor, the get-set methods for the
 * associated variables, and the Damage Calculator. The Damage Calulator uses
 * methods in me.pavva.pokejava.Type
 *
 * @see me.pavva.pokejava.App
 * @see me.pavva.pokejava.Type
 * @see me.pavva.pokejava.Pokemon
 */


 public class Move {


    /**
     * An immutable name for the move
     */
    private final String name;

    /**
     * An immutable Type for the move
     *
     * @see Type
     */
    private final Type   type;

    /**
     * An immutable power value for the move. Used in damage calculation
     *
     * @see Move#attack(Pokemon, Pokemon, Move)
     */
    private final int    power;

    /**
     * A mutable "power points" value for the move. This value eventually be used in determining whether
     * a {@link Pokemon Pokemon} can still use the move. In other words, a move can only be used if it
     * still have power points available. One power point is consumed every time a move is used.
     */
    private int          points;

    /**
     * Constructor for a Move Object. The power and points values are taken from Bulbapedia and Smogon Pokedex
     *
     * @param name   A String which is the textual representation of the Move to the user.
     * @param type   A Type from {@link me.pavva.pokejava.Type} which Moves and Pokemon use for consistency.
     * @param power  An int which represents the power of the Move.
     * @param points An int which represents the Power Points (PP) of the move. Power Points determine how many times a move can be used. This feature is not created yet.
     */
    public Move(String name, Type type, int power, int points) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.points = points;
    }

    /**
     * Sets the new number of Power Points of the Move.
     *
     * @param points The int number of Power Points of the Move.
     */
    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * Returns the name of the Move.
     *
     * @return The String name of the Move
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the Type of the Move
     *
     * @return The Type type of the Move.
     */
    public Type getType() {
      return this.type;
    }

    /**
     * Returns the power of the Move.
     *
     * @return The int power of the Move.
     */
    public int getPower() {
        return this.power;
    }

    /**
     * Returns the number of Power Points of the Move.
     *
     * @return The int number of Power Points of the Move.
     */
    public int getPoints() {
        return this.points;
    }

    /**
     * The main Damage Calculator of the PokeJava program. This method is
     * vital in setting the changing values of health of the Pokemon
     * throught the game. It uses {@link me.pavva.pokejava.Type#doStabCheck doStabCheck} method
     * and {@link me.pavva.pokejava.Type#doEffectCheck doEffectCheck} method to realistically
     * change the values of the health of the Pokemon.
     *
     * @param attacker     The Pokemon which is attacking. Its attack value is used in determining the damage done.
     * @param defender     The Pokemon which is receiving damage. Its defense value is used in determing the damage done. Its health value is changed at the end of the method
     * @param attackerMove The Move which the attacking Pokemon is using. Its power and type are used to determine the damage, STAB, and effectivity.
     */


    // Calculates damage based on factors derived from attacking mon, defending mon, and move used
    // returns defender after damage has been inflicted on it
    // The heart of our simulator
    public static Pokemon attack(Pokemon attacker, Pokemon defender, Move attackerMove) {
        int level = 100;
        int a = attacker.getAttack();
        int d = defender.getDefense();
        int power = attackerMove.getPower();
        double stab = Type.doStabCheck(attackerMove, attacker);
        double effectivity = Type.doEffectCheck(attackerMove, defender);
        // Random number between .85 and .100(inclusive)
        double modifier = (new Random().nextInt(16) + 85) / 100.0;

        System.out.println(attacker.getName() + " used " + attackerMove.getName() + "!");

        // See if the move is special
        if(Type.isSpecial(attackerMove.getType())){
          System.out.println(attackerMove.getName() + " is a special move");
          a = attacker.getSpecial();
          d = defender.getSpecial();
        }
        else
          System.out.println(attackerMove.getName() + " is a physical move");

        // Damage formula
        double damage = ((((2 * level / 5 + 2) * a * power / d) / 50) + 2) * stab * effectivity * modifier;

        defender.setHealth(defender.getHealth() - damage);

        attackerMove.points--;

        System.out.println(effectivity + " effective\nstab is " + stab);
        System.out.println(defender.getName() + " took " + damage + " damage!");
        return defender;
    }
}
