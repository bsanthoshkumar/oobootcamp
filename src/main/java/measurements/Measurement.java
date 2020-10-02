package measurements;

import java.util.Objects;

public class Measurement <U extends Unit> {
  private final double value;
  private final U unit;

  public Measurement(double value, U unit) {
    this.value = value;
    this.unit = unit;
  }

  private boolean isEqualTo(Measurement<?> other) {
    return this.unit.toStandard(this.value) == other.unit.toStandard(other.value);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Measurement<?> that = (Measurement<?>) o;
    if (this.unit.getClass() != that.unit.getClass()) return false;
    return this.isEqualTo(that);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

  public Measurement<U> add(Measurement<U> other, U resultUnit) {
    double measurement1 = this.unit.toStandard(this.value);
    double measurement2 = other.unit.toStandard(other.value);
    return new Measurement<U>(measurement1 + measurement2, resultUnit);
  }
}
