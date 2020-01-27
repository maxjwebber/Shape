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

        Circle circle = new Circle("circle");
        circle.setDimensions(radius);
        Square square = new Square("square");
        square.setDimensions(squareSide,squareSide);
        Triangle triangle = new Triangle("triangle");
        triangle.setDimensions(sideA,sideB,sideC);
        EquilateralTriangle EQT = new EquilateralTriangle("EQT");
        EQT.setDimensions(eside);




    }
}
