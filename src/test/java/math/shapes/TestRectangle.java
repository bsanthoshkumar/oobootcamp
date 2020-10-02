package math.shapes;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRectangle {
  @Test
  void shouldCalculateAreaOfRectangle() {
    Rectangle rect = new Rectangle(2, 1.5);
    assertEquals(3.0, rect.area(), 0.01);
  }

  @Test
  void shouldCalculatePerimeterOfRectangle() {
    Rectangle rect = new Rectangle(2, 1.5);
    assertEquals(7.0, rect.perimeter(), 0.01);
  }

  @Test
  void shouldDisplayDetails() {
    Rectangle rect = new Rectangle(1.5, 2);
    rect.displayInfo((length, width, area, perimeter) -> {
      assertEquals(2, length);
      assertEquals(1.5, width);
      assertEquals(3, area);
      assertEquals(7, perimeter);
    });    
  }
}


