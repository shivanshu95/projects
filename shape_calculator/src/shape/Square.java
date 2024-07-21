package shape;

public class Square extends Shape{
    long side;

    public Square(long side) {
        super(ShapeType.SQUARE);
       this.side = side;
    }
}
