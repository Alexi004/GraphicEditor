package GraphicsShapes;

// Використання класів
public class Main {
    public static void main(String[] args){
        Shape circle = new Circle("Circle", 3.5);
        Shape quad = new Quad("Quad", 8.0 , 6.0);
        Shape triangle = new Triangle("Triangle", 6.0, 4.0);
        Shape ellipse = new Ellipse("Ellipse", 9.0, 5.0);
        Shape square = new Square("Square", 4.5);

        ShapePrinter shapePrinter = new ShapePrinter();
        shapePrinter.printShapeName(circle);
        shapePrinter.printShapeName(quad);
        shapePrinter.printShapeName(triangle);
        shapePrinter.printShapeName(ellipse);
        shapePrinter.printShapeName(square);

        circle.draw();
        quad.draw();
        triangle.draw();
        ellipse.draw();
        square.draw();
    }
}
