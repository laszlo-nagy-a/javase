package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        Gentleman gentleman = new Gentleman();
        System.out.println(gentleman.sayHello("John"));

        System.out.println(CircleCalculator.PI);
        CircleCalculator circleCalculator = new CircleCalculator();
        System.out.println(circleCalculator.calculatePerimeter(2));
        System.out.println(circleCalculator.calculateArea(2));

        CylinderCalculator cylinderCalculator = new CylinderCalculator();
        System.out.println(cylinderCalculator.calculateVolume(2, 3));
        System.out.println(cylinderCalculator.calculateSurfaceArea(2, 3));

        CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();
        System.out.println(cylinderCalculatorBasedOnCircle.calculateVolume(2, 3));
        System.out.println(cylinderCalculatorBasedOnCircle.calculateSurfaceArea(2, 3));
    }
}
