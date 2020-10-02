package coin;

public class Chance {
  private final double chanceOfAnEvent;
  private final static double MAX_PROBABILITY = 1.0;

  public Chance(double chanceOfAnEvent) {
    this.chanceOfAnEvent = chanceOfAnEvent;
  }

  public Chance complement() {
    return new Chance(MAX_PROBABILITY - this.chanceOfAnEvent);
  }

  public Chance and(Chance anotherChance) {
    return new Chance(this.chanceOfAnEvent * anotherChance.chanceOfAnEvent);
  }


  public Chance or(Chance anotherChance) {
    return this.complement().and(anotherChance.complement()).complement();
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Chance)) {
      return false;
    }
    Chance that = (Chance) obj;
    return Math.abs(this.chanceOfAnEvent - that.chanceOfAnEvent) <= 0.01;
  }
}
