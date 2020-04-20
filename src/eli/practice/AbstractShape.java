package eli.practice;

public abstract class AbstractShape{
    private Label label;
    private int height;

    public AbstractShape(int height, Label label) {
        this.height = height;
        this.label = label;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public Label getLabel() {
        return label;
    }
    public void setLabel(Label label) {
        this.label = label;
    }
}
