package shape;

public class SquareShapeCalculator implements ShapeCalculator{

    @Override
    public Long calculateArea(Shape shape) {
        Square shaped = (Square) shape;
        System.out.println(shaped.side*shaped.side);
        return shaped.side*shaped.side;
    }
}
