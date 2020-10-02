package measurements;

public enum LengthUnits implements Unit {
  FEET(12), INCH(1), CENTIMETER(0.4), MILLIMETRE(0.04);

  private final double noOfInches;

  LengthUnits(double noOfInches) {
    this.noOfInches = noOfInches;
  }

  @Override
  public double toStandard(double value) {
    return this.noOfInches * value;
  }
}
