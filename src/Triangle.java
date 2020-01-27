public class Triangle extends Shape {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(String name) {
        super(name);
    }
    public void setDimensions(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void printDimensions() {
        System.out.println("Dimensions: "+sideA+" by "+sideB+" by "+sideC);
    }

    @Override
    public double getArea() {
        int s = (sideA+sideB+sideC)/2;
        return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
    }
}
