package GraphicsShapes;

// Похідний клас Triangle, що успадковується від Shape
public class Triangle extends Shape{
    private double height;
    private double base;

    public Triangle(String name, double height, double base){
        super(name);
        this.height = height;
        this.base = base;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a triangle with base " + base + " and height " + height);
    }
}
