package lab.exercise;

public class RedShapeDecorator extends ShapeDecorator {

    Shape shape;

    public RedShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Border Color: Red");
    }

}
