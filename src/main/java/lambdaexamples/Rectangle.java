package lambdaexamples;

abstract class AbstractShape {
    protected int sides;

    public AbstractShape(int sides) {
        this.sides = sides;
    }

    public abstract void draw();
}

class Main
{
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4,55);
        System.out.println(rectangle.sides);

    }
}