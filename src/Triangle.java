public class Triangle extends Shape {
    static double base ;
    double leg1, leg2;

    Triangle(double base, double leg1, double leg2) {
        this.base = base;
        this.leg1 = leg1;
        this.leg2 = leg2;
        validateValue(base, "base");
        validateValue(leg1, "leg1");
        validateValue(leg2, "leg2");
    }

    public double calculateArea() {
        double semiPerimeter = (base + leg1 + leg2) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - base) * (semiPerimeter - leg1) * (semiPerimeter - leg2));
    }

    public double calculatePerimeter() {
        return base + leg1 + leg2;
    }

    // overload method:
    public static double calculateArea(double height) {
        validateValue(height, "height");
        return base * height / 2;
    }

    private static void validateValue(double value, String valueName) {
        if (value <= 0) throw new IllegalArgumentException("Error: " + valueName + " should be greater than 0");
    }
}
