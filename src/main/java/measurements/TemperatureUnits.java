package measurements;

public enum TemperatureUnits implements Unit {
  FAHRENHEIT(1), CELSIUS(2.12 );


  private final double inFahrenheit;

  TemperatureUnits(double inFahrenheit) {
    this.inFahrenheit = inFahrenheit;
  }

  @Override
  public double toStandard(double value) {
    return this.inFahrenheit * value;
  }
}
