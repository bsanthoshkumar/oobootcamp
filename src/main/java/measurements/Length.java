package measurements;

import java.util.Objects;

public class Length {
  private final double value;
  private final LengthUnits unit;

  public Length(double value, LengthUnits unit) {
    this.value = value;
    this.unit = unit;
  }

  private boolean isEqualTo(Length other) {
    final double length1InInches = this.unit.toStandard(this.value);
    final double length2InInches = other.unit.toStandard(other.value);
    return length1InInches == length2InInches;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;
    Length other = (Length) object;
    return this.isEqualTo(other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

  public Length add(Length other) {
    double length1 = this.unit.toStandard(this.value);
    double length2 = other.unit.toStandard(other.value);
      return  new Length(length1 + length2, LengthUnits.INCH);
  }
}
