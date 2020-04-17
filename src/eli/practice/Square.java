package eli.practice;

public class Square {
    private int length;
    private Label label;

    public Square(int length, Label label){
        this.length = length;
        this.label = label;
    }

    public int getLength() {
        return length;
    }

    public Label getLabel() {
        return label;
    }

    public void printShape(){
        for(int c = 0; c < getLength(); c ++) {
            if (c == label.getRowNumberOfLabel()-1) {
                System.out.print("X");
                System.out.print(label.getLabel());
                for (int z = 0; z < getLength()-label.getLabel().length()-1; z++) {
                    System.out.print("X");
                }
                System.out.println("");
                c++;
            } else {
            }
            for (int i = 0; i < getLength(); i++) {
                System.out.print("X");
            }
            System.out.println("");
        }
    }


}
