public class Square extends Shape {
    private double side;

    public String toString() {
        StringBuilder squareString = new StringBuilder();
        squareString.append(">> Square <<" + "\n");
        squareString.append("Side: " + getSide() + "\n");
        squareString.append("Area: " + calculateArea() + "\n");
        squareString.append("Perimeter: " + calculatePerimeter() + "\n");

        return squareString.toString();
    }

    public double calculateArea() {
        return Math.pow(side, 2);
    }

    public double calculatePerimeter() {
        return 4 * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double sideInput) {
        validateSide(sideInput);
        this.side = sideInput;
    }

    private void validateSide(double sideInput) {
        if (sideInput <= 0) throw new IllegalArgumentException("Error: side should be greater than 0");
    }
}
