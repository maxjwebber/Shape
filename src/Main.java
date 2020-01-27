import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me the radius of the circle.");
        int radius = scan.nextInt();
        System.out.println("Give me the side of the square. This will be the length and height.");
        int squareSide = scan.nextInt();
        System.out.println("Give me the first side of the triangle.");
        int sideA = scan.nextInt();
        System.out.println("Give me the second side of the triangle.");
        int sideB = scan.nextInt();
        System.out.println("Give me the third side of the triangle.");
        int sideC = scan.nextInt();
        System.out.println("Give me a side of the equilateral triangle. This will be the length of all three sides.");
        int eside = scan.nextInt();
        scan.close();

        Circle circle = new Circle("Circle");
        circle.setDimensions(radius);
        Square square = new Square("Square");
        square.setDimensions(squareSide,squareSide);
        Triangle triangle = new Triangle("Triangle");
        triangle.setDimensions(sideA,sideB,sideC);
        EquilateralTriangle EQT = new EquilateralTriangle("Equilateral triangle");
        EQT.setDimensions(eside);
        Shape shape = new Shape("Anonymous Shape");

        System.out.println(circle.getName());
        circle.printDimensions();
        System.out.println("Area: "+circle.getArea());

        System.out.println(square.getName());
        square.printDimensions();
        System.out.println("Area: "+square.getArea());

        System.out.println(triangle.getName());
        triangle.printDimensions();
        System.out.println("Area: "+triangle.getArea());

        System.out.println(EQT.getName());
        EQT.printDimensions();
        System.out.println("Area: "+EQT.getArea());

        System.out.println(shape.getName());
        shape.printDimensions();
        System.out.println("Area: "+shape.getArea());

    }
}
