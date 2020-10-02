package measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureUnitsTest {
  @Test
  void shouldConvertOneUnitToCelsius() {
    assertEquals(212, TemperatureUnits.CELSIUS.toStandard(100));
  }
}
