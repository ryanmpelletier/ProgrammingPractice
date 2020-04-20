package eli.practice;

public class Triangle extends AbstractShape implements Shape{
    public Triangle(int height, Label label){
        super(height,label);
    }
    public void printShape(){
       for(int i = 0; i < getHeight(); i++){
           if(i == getLabel().getRowNumberOfLabel()-1){
               printSpaces(getHeight() - i - 1);
               printLabel(i);
               if(getLabel().getRowNumberOfLabel() % 2 != 0 && getLabel().getLabel().length() % 2 == 0) {
                   System.out.print("X");
               }
               if(getLabel().getRowNumberOfLabel() % 2 == 0 && getLabel().getLabel().length() % 2 != 0){
                   System.out.print("X");
               }
                System.out.println();
           }else{
               printSpaces(getHeight() - i - 1);
               printXs(i + 1);
               System.out.println();
           }
       }
    }
    public boolean isValid(){
        return getLabel().getLabel().length() <= getLabel().getRowNumberOfLabel();
    }

    public void printSpaces(int length){
        for(int i = 0; i < length; i++){
            System.out.print(" ");
        }
    }
    public void printXs(int length){
        for(int i = 0; i < length; i++){
            System.out.print("X ");
        }
    }
    public void printLabel(int index){
       printXs((index+1-getLabel().getLabel().length())/2);
       printLabel();
       printXs((index+1-getLabel().getLabel().length())/2);

    }
    public void printLabel(){
        for(int i = 0; i < getLabel().getLabel().length(); i++){
            System.out.print(getLabel().getLabel().charAt(i) + " ");
        }
    }
}
