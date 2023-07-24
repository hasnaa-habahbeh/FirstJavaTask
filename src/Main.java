public class Main {
    public static void printValues(Shape shape) {
        System.out.println("shape object -> " + shape);
        System.out.println("area -> " + shape.calculateArea());
        System.out.println("perimeter -> " + shape.calculatePerimeter());
        System.out.println("___________________");
    }

    public static void main(String[] args) {
        try {
            Circle testCircle = new Circle(3);
            printValues(testCircle);

            Square testSquare = new Square(3);
            printValues(testSquare);

            Triangle testTriangle = new Triangle(6, 3, 4);
            printValues(testTriangle);

            double triangleAreaByHeight = Triangle.calculateArea(3);
            System.out.println("overload method result -> " + triangleAreaByHeight);
        } catch (Error error) {
            System.out.println("Error: " + error);
        }
    }
}
