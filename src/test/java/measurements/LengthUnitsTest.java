package measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthUnitsTest {
  @Test
  void shouldConvertOneUnitToInches() {
    assertEquals(2, LengthUnits.CENTIMETER.toStandard(5));
  }
}