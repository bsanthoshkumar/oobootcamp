package measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MeasurementTest {
  @Test
  void shouldGiveTrueIfTheMeasurementsAreEqual() {
    Measurement<LengthUnits> measurement1 = new Measurement<>(2, LengthUnits.INCH);
    Measurement<LengthUnits> measurement2 = new Measurement<>(5, LengthUnits.CENTIMETER);

    assertEquals(measurement2, measurement1);
  }

  @Test
  void shouldGiveFalseIfMeasurementsAreNotEqual() {
    Measurement<LengthUnits> measurement1 = new Measurement<>(2, LengthUnits.INCH);
    Measurement<LengthUnits> measurement2 = new Measurement<>(4, LengthUnits.CENTIMETER);

    assertNotEquals(measurement2, measurement1);
  }

  @Test
  void shouldAddTwoMeasurements() {
    Measurement<LengthUnits> measurement1 = new Measurement<>(2, LengthUnits.INCH);
    Measurement<LengthUnits> measurement2 = new Measurement<>(2.5, LengthUnits.CENTIMETER);
    Measurement<LengthUnits> expected = new Measurement<>(3, LengthUnits.INCH);

    assertEquals(expected, measurement1.add(measurement2, LengthUnits.INCH));
  }
}
