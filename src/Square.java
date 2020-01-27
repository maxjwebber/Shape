public class Square extends Shape {

    private int height;
    private int length;
    public Square(String name) {
        super(name);
    }

    public void setDimensions(int height, int length)
    {
        this.height = height;
        this.length = length;
    }
    @Override
    public void printDimensions() {
        System.out.println("Dimensions: "+height+" by "+length);
    }

    @Override
    public double getArea() {
        return height*length;
    }
}
