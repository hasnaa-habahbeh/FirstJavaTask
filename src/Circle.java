public class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
        validateRadius();
    }

    public double calculateArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }

    private void validateRadius() {
        if (radius <= 0) throw new IllegalArgumentException("Error: radius should be greater than 0");
    }
}
