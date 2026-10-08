package finalmodifier;

public class CylinderCalculator {

    double calculateVolume(double r, double h) {
        return (r * r) * CircleCalculator.PI * h;
    }

    double calculateSurfaceArea(double r, double h) {
        return (2 * (r * r) * CircleCalculator.PI) + (2 * r * CircleCalculator.PI * h);
    }
}
