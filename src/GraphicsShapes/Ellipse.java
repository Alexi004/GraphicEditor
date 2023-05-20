package GraphicsShapes;

// Похідний клас Ellipse, що успадковується від Shape
public class Ellipse extends Shape{
    private double majorAxis;
    private double minorAxis;

    public Ellipse(String name, double majorAxis, double minorAxis){
        super(name);
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    public void draw(){
        System.out.println("Drawing an ellipse with major axis " + majorAxis + " and minor axis " + minorAxis);
    }
}
