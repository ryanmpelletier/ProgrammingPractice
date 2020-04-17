package eli.practice;
import java.util.Scanner;

public class ShapeProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "Yes";
        while (answer.equals("Yes")) {
            System.out.println("What shape would you like to print?");
            String shape = input.next();
            System.out.println("What label would you like to print? Please note the row number and text featured.");
            int rowNumber = input.nextInt();
            String textFeatured = input.next();
            Label label = new Label(rowNumber, textFeatured);
            if (shape.equals("Rectangle")) {
                System.out.println("What will the height and length be, respectively?");
                int height = input.nextInt();
                int length = input.nextInt();
                if(label.getLabel().length() > length){
                    System.out.println("Im sorry, your label is too long!");
                }else{
                Rectangle rectangle = new Rectangle(length, height, label);
                rectangle.printShape();}
            } else if (shape.equals("Triangle")) {
                System.out.println("What should the height of your triangle be?");
                int height = input.nextInt();
                Triangle triangle = new Triangle(height, label);
                if(triangle.checkLabelSpace(label.getRowNumberOfLabel()) == 0){
                    System.out.println("Your label is too long!");
                }else{
                    triangle.printShape();
                }
            } else if (shape.equals("Square")) {
                System.out.println("What would you like the length of your square to be?");
                int length = input.nextInt();
                if(label.getLabel().length() > length){
                    System.out.println("Im sorry, your label is too long!");
                }else{
                    Square square = new Square(length, label);
                    square.printShape();
                }
            }
            System.out.println("Would you like to print another shape?");
            answer = input.next();
        }
        System.out.println("Thank you for printing shapes today!");
    }
}
