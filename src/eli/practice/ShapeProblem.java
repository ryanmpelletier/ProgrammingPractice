package eli.practice;
import java.util.Scanner;

public class ShapeProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ShapeFactory shapeFactory = new ShapeFactory();
        String shapeType = "Rectangle";
        int height = 5;
        Shape shape = shapeFactory.buildShape(shapeType, "eli", 3, height);
        if(!shape.isValid()){
            System.out.println("Im sorry your label is too long!");
        }else{
            shape.printShape();
        }
    }
}
