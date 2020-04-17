package eli.practice;

public class Triangle {
    private int height;
    private Label label;
    public Triangle(int height, Label label){
        this.height = height;
        this.label = label;
    }
    public Label getLabel(){return this.label;}

    public int getHeight(){return this.height;}

    public void printShape(){
       for(int i = 0; i < height; i++){
           if(i == label.getRowNumberOfLabel()-1){
               printSpaces(height - i - 1);
               printLabel(i);
               if(label.getRowNumberOfLabel() % 2 != 0 && label.getLabel().length() % 2 == 0) {
                   System.out.print("X");
               }
               if(label.getRowNumberOfLabel() % 2 == 0 && label.getLabel().length() % 2 != 0){
                   System.out.print("X");
               }
                System.out.println();
           }else{
               printSpaces(height - i - 1);
               printXs(i + 1);
               System.out.println();
           }
       }
    }
    public int checkLabelSpace(int rowNumberOfLabel){
        int validity;
        if(label.getLabel().length() > rowNumberOfLabel){
            validity = 0;
        }else{validity = 1;}
        return validity;
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
       printXs((index+1-label.getLabel().length())/2);
       printLabel();
       printXs((index+1-label.getLabel().length())/2);

    }
    public void printLabel(){
        for(int i = 0; i < label.getLabel().length(); i++){
            System.out.print(label.getLabel().charAt(i)+ " ");
        }
    }
}
