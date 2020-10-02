package math.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSquare {
  @Test
  void shouldCalculateAreaOfSquare() {
    Square square = new Square(2);
    assertEquals(4.0, square.area(), 0.01);
  }

  @Test
  void shouldCalculatePerimeterOfSquare() {
    Square square = new Square(2);
    assertEquals(8.0, square.perimeter(), 0.01);
  }
}
