public class Circle extends Shape {

    private int radius;
    public Circle(String name) {
        super(name);
    }

    public void setDimensions(int radius)
    {
        this.radius = radius;
    }

    @Override
    public void printDimensions() {
        System.out.println("Dimensions: radius is "+radius);
    }
}
