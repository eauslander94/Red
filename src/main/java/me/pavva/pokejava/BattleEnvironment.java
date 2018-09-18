package me.pavva.pokejava;

import java.util.*;

import me.pavva.pokejava.pokemon.*;

// To add a gyarados, we need the moves
import static me.pavva.pokejava.moves.DarkMove.*;
import static me.pavva.pokejava.moves.SteelMove.*;
import static me.pavva.pokejava.moves.WaterMove.*;



public class BattleEnvironment {

  public Pokemon userMon;
  public Pokemon oppMon;

  public BattleEnvironment(Pokemon userMon, Pokemon oppMon){
    this.userMon = userMon;
    this.oppMon = oppMon;
  }

  // Our battle Loop - While both mons have health:
  // 1) retreive moves; 2) calculate result; 3) calculate reward;
  public void battle(){
    while(this.userMon.getHealth() > 0.0 && this.oppMon.getHealth() > 0.0) {

      System.out.println("\nLet's Battle!");

      // Agent generates move choice based on current state

      // Both mons attack, simulator generates resulting hp
      this.oppMon = Move.attack(this.userMon, this.oppMon, this.userMon.getMove(""));
      this.userMon = Move.attack(this.oppMon, this.userMon, this.oppMon.getMove(""));

      System.out.println(this.userMon.getName() + " has " + this.userMon.getHealth() + "HP Left");
      System.out.println(this.oppMon.getName() + " has " + this.oppMon.getHealth() + "HP Left");


      // Agent generates reward based on resluting state
    }
  }

}
