package eli.practice.classes.model;

public class Motherboard {

    private String brand;
    private String chipset;
    private Ram[] ramSticks;
    private CPU processor;
    private GraphicsCard graphicsCard;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public Ram[] getRamSticks() {
        return ramSticks;
    }

    public void setRamSticks(Ram[] ramSticks) {
        this.ramSticks = ramSticks;
    }

    public CPU getProcessor() {
        return processor;
    }

    public void setProcessor(CPU processor) {
        this.processor = processor;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
