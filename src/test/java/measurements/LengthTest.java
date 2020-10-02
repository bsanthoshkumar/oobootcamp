package measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
  @Test
  void shouldGiveTrueIfLengthsAreEqual() {
    Length length1 = new Length(1, LengthUnits.FEET);
    Length length2 = new Length(12, LengthUnits.INCH);
    assertEquals(length1, length2);
  }

  @Test
  void shouldGiveFalseIfLengthsNotEqual() {
    Length length1 = new Length(1, LengthUnits.CENTIMETER);
    Length length2 = new Length(11, LengthUnits.MILLIMETRE);
    assertNotEquals(length1, length2);
  }

  @Test
  void shouldAddTwoLengths() {
    Length length1 = new Length(2, LengthUnits.INCH);
    Length length2 = new Length(2.5, LengthUnits.CENTIMETER);
    Length expected = new Length(3, LengthUnits.INCH);
    assertEquals(expected, length1.add(length2));
  }
}