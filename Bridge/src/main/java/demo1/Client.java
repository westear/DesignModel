package demo1;

public class Client {
    public static void main(String[] args) {
        Shape[] myShapes = new Shape[]{
                new Rectangle(new V1Drawing(), 1.0,1.0,3.0,3.0),
                new Rectangle(new V2Drawing(), -1.0,-1.0,-2.0,-2.0),
                new Circle(new V2Drawing(), 1.0, 1.0, 3.0),
                new Circle(new V1Drawing(), 0,0,2)
        };

        for (Shape shape : myShapes) {
            shape.draw();
            System.out.println();
        }
    }
}
