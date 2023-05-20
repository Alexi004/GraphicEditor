package GraphicsShapes;

// Похідний клас Square, що успадковується від Shape

public class Square extends Shape{
    double side;

    public Square(String name, double side){
        super(name);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square with side " + side);
    }
}
