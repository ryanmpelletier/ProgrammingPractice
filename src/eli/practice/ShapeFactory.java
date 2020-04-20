package eli.practice;

public class ShapeFactory {
    public Shape buildShape(String shapeType, String labelText, int labelRow, int height){
        if (shapeType.equals("Rectangle")) {
            return new Rectangle(2*height, height, new Label(labelRow, labelText));
        } else if (shapeType.equals("Triangle")) {
            return new Triangle(height, new Label(labelRow, labelText));
        } else if (shapeType.equals("Square")) {
            return new Square(height, new Label(labelRow, labelText));
        }
        return null;
    }
}
