public class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
        validateSide();
    }

    public double calculateArea() {
        return Math.pow(side, 2);
    }

    public double calculatePerimeter() {
        return 4 * side;
    }

    private void validateSide() {
        if (side <= 0) throw new IllegalArgumentException("Error: side should be greater than 0");
    }
}
