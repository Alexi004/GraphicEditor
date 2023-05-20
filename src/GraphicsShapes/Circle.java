package GraphicsShapes;

// Похідний клас Circle, що успадковується від Shape
public class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with a radius " + radius);
    }
}
