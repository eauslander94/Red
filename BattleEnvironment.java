package me.pavva.pokejava;

import java.util.*;

import me.pavva.pokejava.pokemon.*;

// To add a gyarados, we need the moves
import static me.pavva.pokejava.moves.DarkMove.*;
import static me.pavva.pokejava.moves.SteelMove.*;
import static me.pavva.pokejava.moves.WaterMove.*;



public class BattleEnvironment(userMon: Pokemon, oppMon: Pokemon) {

  static Pokemon userMon;
  statically Pokemon oppMon;

  public BattleEnvironment(userMon: Pokemon, oppMon: Pokemon){
    this.userMon = userMon;
    this.oppMon = oppMon;
  }

  // Our battle Loop - While both mons have health:
  // 1) retreive moves; 2) calculate result; 3) calculate reward; 4) generate new state
  public battle(){
    while(userMon.getHealth() > 0.0 && oppMon.getHealth() > 0.0){
      // USE Move
      // This.agent.actionSelection(), for now return empty string.

      // Both mons attack
      Move.attack(userMon, oppMon, userMon.getMove(""));
      Move.attack(oppMon, userMon, userMon.getMove(""));

      System.out.println(userMon.getName() + "has " + userMon.getHealth() + "HP Left");
      System.out.println(oppMon.getName() + "has " + oppMon.getHealth() + "HP Left");
      

      // Simulator generates resulting state

      // Agent generates reward based on resluting state

      // Resulting state becomes current state, loop restarts
    }
  }

}
