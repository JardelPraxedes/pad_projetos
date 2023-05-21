public class Client {
    private Shape shape;
    private Color color;

    public Client(AbstractFactory factory) {
        shape = factory.createShape();
        color = factory.createColor();
    }

    public void run() {
        shape.draw();
        color.fill();
    }

    public static void main(String[] args) {
        AbstractFactory shapeFactory = new ShapeFactory();
        Client client1 = new Client(shapeFactory);
        client1.run();

        AbstractFactory colorFactory = new ColorFactory();
        Client client2 = new Client(colorFactory);
        client2.run();
    }
}