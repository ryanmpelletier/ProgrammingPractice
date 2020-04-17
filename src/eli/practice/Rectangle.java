package eli.practice;

public class Rectangle {
    private int length;
    private int height;
    private Label label;

    public Rectangle(int length, int height, Label label ){
        this.length = length;
        this.height = height;
        this.label = label;
    }


    private int getLength(){
        return this.length;
    }
    private int getHeight(){
        return this.height;
    }
    public void printShape(){
        for(int c = 0; c < getHeight(); c ++) {
            if (c == label.getRowNumberOfLabel()-1) {
                for (int z = 0; z < (getLength()-label.getLabel().length())/2; z++) {
                    System.out.print("X");
                }
                System.out.print(label.getLabel());
                for (int z = 0; z < (getLength()-label.getLabel().length())/2; z++) {
                    System.out.print("X");
                }
                if((getLength()-label.getLabel().length()/2)%2 != 0){
                    System.out.print("X");
                }
                System.out.println();
                c++;
            } else {
            }
            for (int i = 0; i < getLength(); i++) {
                System.out.print("X");
            }
            System.out.println();
        }
        }
    }



