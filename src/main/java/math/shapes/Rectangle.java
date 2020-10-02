package math.shapes;

public class Rectangle {
  private final double sideA;
  private final double sideB;

  public Rectangle(final double sideA, final double sideB) {
    this.sideA = sideA;
    this.sideB = sideB;
  }

  public double area() {
    return this.sideA * this.sideB;
  }

  public double perimeter() {
    return 2 * (this.sideA + this.sideB);
  }

  public void displayInfo(Printer printer) {
    final double length = Math.max(this.sideA, this.sideB);
    final double width = Math.min(this.sideA, this.sideB);
    printer.print(length, width, area(), perimeter());
  }
}
