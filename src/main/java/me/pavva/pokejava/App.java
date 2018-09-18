package me.pavva.pokejava;

import java.util.*;
import java.util.Random;

import me.pavva.pokejava.pokemon.*;

// To add a gyarados, we need the moves
import static me.pavva.pokejava.moves.DarkMove.*;
import static me.pavva.pokejava.moves.SteelMove.*;
import static me.pavva.pokejava.moves.WaterMove.*;

import static me.pavva.pokejava.moves.BugMove.*;
import static me.pavva.pokejava.moves.DarkMove.*;
import static me.pavva.pokejava.moves.DragonMove.*;
import static me.pavva.pokejava.moves.ElectricMove.*;
import static me.pavva.pokejava.moves.FairyMove.*;
import static me.pavva.pokejava.moves.FightMove.*;
import static me.pavva.pokejava.moves.FireMove.*;
import static me.pavva.pokejava.moves.FlyingMove.*;
import static me.pavva.pokejava.moves.GhostMove.*;
import static me.pavva.pokejava.moves.GrassMove.*;
import static me.pavva.pokejava.moves.GroundMove.*;
import static me.pavva.pokejava.moves.IceMove.*;
import static me.pavva.pokejava.moves.NormalMove.*;
import static me.pavva.pokejava.moves.PoisonMove.*;
import static me.pavva.pokejava.moves.PsychicMove.*;
import static me.pavva.pokejava.moves.RockMove.*;
import static me.pavva.pokejava.moves.SteelMove.*;
import static me.pavva.pokejava.moves.WaterMove.*;


public class App {

    public static void main(String[] args) {
      Pokemon venusaur = new GrassPokemon("Venusaur", 364.0, 262, 264, 298,
        solarbeam, earthquake, bodySlam, tackle);
      Pokemon blastoise = new WaterPokemon("Blastoise", 362.0, 264, 291, 268,
        hydroPump, blizzard, bodySlam, tackle);
      Pokemon charizard = new FirePokemon("Charizard", 360.0, 266, 254, 268,
        fireBlast, earthquake, bodySlam, tackle);

      BattleEnvironment environment = new BattleEnvironment(venusaur, charizard);
      environment.battle();
    }
}
