package measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class VolumeTest {
  @Test
  void shouldGiveTrueIfVolumesAreEqual() {
    Volume volume1 = new Volume(3.78, VolumeUnits.LITRE);
    Volume volume2 = new Volume(1, VolumeUnits.GALLON);
    assertEquals(volume1, volume2);
  }

  @Test
  void shouldGiveFalseIfVolumesNotEqual() {
    Volume volume1 = new Volume(3.79, VolumeUnits.LITRE);
    Volume volume2 = new Volume(1, VolumeUnits.GALLON);
    assertNotEquals(volume1, volume2);
  }
}
