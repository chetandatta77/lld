public class MainClass {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("Circle");
        circle.draw();
    }
}
