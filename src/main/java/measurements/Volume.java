package measurements;

import java.util.Objects;

public class Volume {
  private final double value;
  private final VolumeUnits unit;

  public Volume(double value, VolumeUnits unit) {
    this.value = value;
    this.unit = unit;
  }

  private boolean isEqualTo(Volume other) {
    double volume1 = this.unit.toStandard(this.value);
    double volume2 = other.unit.toStandard(other.value);
    return volume1 == volume2;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) return true;
    if (object == null || getClass() != object.getClass()) return false;
    Volume other = (Volume) object;
    return this.isEqualTo(other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }
}
