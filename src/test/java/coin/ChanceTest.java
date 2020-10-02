package coin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
  @Test
  void chanceShouldBeComplemented() {
    Chance coinFlipChance = new Chance(0.6);
    Chance expected = new Chance(0.4);
    assertEquals(expected, coinFlipChance.complement());
  }


  @Test
  void shouldCombineTwoChances() {
    Chance Chance1 = new Chance(0.5);
    Chance Chance2 = new Chance(0.4);
    Chance expected = new Chance(0.2);
    assertEquals(expected, Chance1.and(Chance2));
  }

  @Test
  void shouldFindTheUnionOfTwoChances() {
    Chance chance1 = new Chance(0.3);
    Chance chance2 = new Chance(0.6);
    Chance expected = new Chance(0.72);
    assertEquals(expected, chance1.or(chance2));
  }

  @Test
  void shouldValidateWhenTwoObjectsAreEqual() {
    Chance chance1 = new Chance(0.158);
    Chance chance2 = new Chance(0.158);
    assertEquals(chance1, chance2);
  }
}
