package me.pavva.pokejava;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Tests {@link Pokemon Pokemon.java} for proper method returns.
 *
 * @author Pranav Avva   Github: 20avva    Web: <a href="https://20avva.github.io">20avva.github.io</a>
 * @version 4.1
 * @since Java 1.7
 */
public class PokemonTest {

    private Move move1 = new Move("Move", Type.NORMAL, 100, 100);
    private Move flamethrower = new Move("Flamethrower", Type.FIRE, 100, 100);
    private Move waterGun = new Move("Water Gun", Type.WATER, 100, 100);
    private Move solarbeam = new Move("Solarbeam", Type.GRASS, 100, 100);
    private Pokemon pokemon1 = new Pokemon("Pokemon One", Type.NORMAL, 100.0, 100, 100,
    move1, flamethrower, waterGun, solarbeam);
    private ArrayList<Move> moveList = new ArrayList<Move>();

    /**
     * Adds the same move to an {@link java.util.ArrayList ArrayList} 4 times to be able to test {@link Pokemon#getMoveList() getMoveList()}
     * properly.
     */
    @Before
    public void setUp() {
        moveList.add(move1);
        moveList.add(flamethrower);
        moveList.add(waterGun);
        moveList.add(solarbeam);
    }

    /**
     * Tests {@link Pokemon#setHealth(double) setHealth()} to make sure method is operating properly.
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void setHealth() throws Exception {
        pokemon1.setHealth(10);
        Assert.assertEquals(10.0, pokemon1.getHealth(), 0.1);
    }

    /**
     * Tests {@link Pokemon#getName() getName()} to make sure method is operating properly.
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getName() throws Exception {
        Assert.assertEquals("Pokemon One", pokemon1.getName());
    }

    /**
     * Tests {@link Pokemon#getType() getType()} to make sure method is operation properly.
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getType() throws Exception {
        Assert.assertEquals(Type.NORMAL, pokemon1.getType());
    }

    /**
     * Tests {@link Pokemon#getHealth() getHealth()} to make sure method is operation properly.
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getHealth() throws Exception {
        Assert.assertEquals(100.0, pokemon1.getHealth(), 0.1);
    }

    /**
     * Tests {@link Pokemon#getAttack() getAttack()} to make sure method is operation properly.
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getAttack() throws Exception {
        Assert.assertEquals(100, pokemon1.getAttack(), 0.1);
    }

    /**
     * Tests {@link Pokemon#getDefense() getDefense()} to make sure method is operation properly.
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getDefense() throws Exception {
        Assert.assertEquals(100, pokemon1.getDefense(), 0.1);
    }

    /**
     * Tests {@link Pokemon#getMoveList() getMoveList()} to make sure method is operation properly.
     *
     * @throws Exception Caught Exception, if any
     */
    @Test
    public void getMoveList() throws Exception {
        for (int k = 0; k < 3; k++) {
            Assert.assertEquals(moveList.get(k).getName(), pokemon1.getMoveList().get(k).getName());
            Assert.assertEquals(moveList.get(k).getType(), pokemon1.getMoveList().get(k).getType());
            Assert.assertEquals(moveList.get(k).getPower(), pokemon1.getMoveList().get(k).getPower());
            Assert.assertEquals(moveList.get(k).getPoints(), pokemon1.getMoveList().get(k).getPoints());
        }
    }

    @Test
    public void getMove() throws Exception {
      Assert.assertEquals(move1.getName(), pokemon1.getMove("Move").getName());
      Assert.assertEquals(solarbeam.getName(), pokemon1.getMove("Solarbeam").getName());
      Assert.assertEquals(waterGun.getName(), pokemon1.getMove("Water Gun").getName());
    }
    /**
     * Tests {@link Pokemon#getMove1() getMove1()} to make sure method is operation properly.
     *
     * @throws Exception Caught Exception, if any
     */
    // @Test
    // public void getMove1() throws Exception {
    //     Assert.assertEquals(move1.getName(), pokemon1.getMove1().getName());
    // }
    //
    // /**
    //  * Tests {@link Pokemon#getMove2() getMove2()} to make sure method is operation properly.
    //  *
    //  * @throws Exception Caught Exception, if any
    //  */
    // @Test
    // public void getMove2() throws Exception {
    //     Assert.assertEquals(move1.getName(), pokemon1.getMove2().getName());
    // }
    //
    // /**
    //  * Tests {@link Pokemon#getMove3() getMove3()} to make sure method is operation properly.
    //  *
    //  * @throws Exception Caught Exception, if any
    //  */
    // @Test
    // public void getMove3() throws Exception {
    //     Assert.assertEquals(move1.getName(), pokemon1.getMove3().getName());
    // }
    //
    // /**
    //  * Tests {@link Pokemon#getMove4() getMove4()} to make sure method is operation properly.
    //  *
    //  * @throws Exception Caught Exception, if any
    //  */
    // @Test
    // public void getMove4() throws Exception {
    //     Assert.assertEquals(move1.getName(), pokemon1.getMove4().getName());
    // }


}
