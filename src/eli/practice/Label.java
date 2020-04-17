package eli.practice;

public class Label {
    private int rowNumberOfLabel;
    private String label;

    public Label(int rowNumberOfLabel, String label){
        this.rowNumberOfLabel = rowNumberOfLabel;
        this.label = label;
    }
    public int getRowNumberOfLabel(){return this.rowNumberOfLabel;}

    public String getLabel() {return label;}
}
