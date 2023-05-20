package GraphicsShapes;

// Похідний клас Quad, що успадковується від Shape
public class Quad extends Shape {
    private double width;
    private double height;

    public Quad(String name, double width, double height){
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a quad with widht " + width + " and height " + height);
    }
}
