package eli.practice;

public class Rectangle extends AbstractShape implements Shape {
    private int length;
    public Rectangle(int length, int height, Label label ){
        super(height, label);
        this.length = length;
    }
    public int getLength(){
        return this.length;
    }
    public void printShape(){
        for(int c = 0; c < getHeight(); c ++){
            if (c == getLabel().getRowNumberOfLabel()-1) {
                for (int z = 0; z < (getLength()-getLabel().getLabel().length())/2; z++) {
                    System.out.print("X");
                }
                System.out.print(getLabel().getLabel());
                for (int z = 0; z < (getLength()-getLabel().getLabel().length())/2; z++) {
                    System.out.print("X");
                }
                if((getLength()-getLabel().getLabel().length()/2)%2 != 0){
                    System.out.print("X");
                }
                System.out.println();
                c++;
            }
            for (int i = 0; i < getLength(); i++) {
                System.out.print("X");
            }
            System.out.println();
        }
        }
    public boolean isValid(){
      return getLabel().getLabel().length() <= getLength();
    }
}



