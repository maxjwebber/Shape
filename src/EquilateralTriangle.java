public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(String name) {
        super(name);
    }

    public void setDimensions(int side) {
        super.setDimensions(side, side, side);
    }
}
