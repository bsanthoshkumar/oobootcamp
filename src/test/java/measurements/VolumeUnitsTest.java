package measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeUnitsTest {
  @Test
  void shouldConvertOneUnitToLitres() {
  assertEquals(7.56,VolumeUnits.GALLON.toStandard(2));
  }
}