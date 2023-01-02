package pl.javastart.task;

public class ChristmasTree {

    private int height;
    private String type;
    private int baublesAmount;

    public ChristmasTree(int height, String type, int baublesAmount) {
        this.height = height;
        this.type = type;
        this.baublesAmount = baublesAmount;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBaublesAmount(int baublesAmount) {
        this.baublesAmount = baublesAmount;
    }

    @Override
    public String toString() {
        return "ChristmasTree{" +
                "height=" + height +
                ", type='" + type + '\'' +
                ", baublesAmount=" + baublesAmount +
                '}';
    }
}
