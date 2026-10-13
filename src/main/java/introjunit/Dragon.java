package introjunit;

public class Dragon {
    private String name;
    private int numberOfHeads;
    private double height;
    private int[] heightPerHead;
    private boolean greenColoredDragon;

    public Dragon(String name, int numberOfHeads, double height, int[] heightPerHead, boolean greenColoredDragon) {
        this.name = name;
        this.numberOfHeads = numberOfHeads;
        this.height = height;
        this.heightPerHead = heightPerHead;
        this.greenColoredDragon = greenColoredDragon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfHeads() {
        return numberOfHeads;
    }

    public void setNumberOfHeads(int numberOfHeads) {
        this.numberOfHeads = numberOfHeads;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int[] getHeightPerHead() {
        return heightPerHead;
    }

    public void setHeightPerHead(int[] heightPerHead) {
        this.heightPerHead = heightPerHead;
    }

    public boolean isGreenColoredDragon() {
        return greenColoredDragon;
    }

    public void setGreenColoredDragon(boolean greenColoredDragon) {
        this.greenColoredDragon = greenColoredDragon;
    }
}
