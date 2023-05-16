package lambdaexamples;

abstract class AbstractShape {
    protected int sides;

    public AbstractShape(int sides) {
        this.sides = sides;
    }

    public abstract void draw();
}

public class Rectangle extends AbstractShape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super(4); // Invoke the constructor of the abstract class
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }

}

class Main
{
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4,55);
        System.out.println(rectangle.sides);

    }
}