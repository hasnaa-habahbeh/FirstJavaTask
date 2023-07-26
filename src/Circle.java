public class Circle extends Shape {
    private double radius;

    public String toString() {
        StringBuilder circleString = new StringBuilder();
        circleString.append(">> Circle <<" + "\n");
        circleString.append("Radius: " + getRadius() + "\n");
        circleString.append("Area: " + calculateArea() + "\n");
        circleString.append("Perimeter: " + calculatePerimeter() + "\n");

        return circleString.toString();
    }

    public double calculateArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radiusInput) {
        validateRadius(radiusInput);
        this.radius = radiusInput;
    }

    private void validateRadius(double radiusInput) {
        if (radiusInput <= 0) throw new IllegalArgumentException("Error: radius should be greater than 0");
    }
}
