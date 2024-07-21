import shape.ShapeCalculator;
import shape.Square;
import shape.SquareShapeCalculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Square square = new Square(2);
        ShapeCalculator calculator = new SquareShapeCalculator();
        calculator.calculateArea(square);
    }
}
