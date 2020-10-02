package measurements;

public enum VolumeUnits implements Unit {
  GALLON(3.78), LITRE(1);

  private final double noOfLitres;

  VolumeUnits(double noOfLitres) {
    this.noOfLitres = noOfLitres;
  }

  @Override
  public double toStandard(double value) {
    return this.noOfLitres * value;
  }
}

