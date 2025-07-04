public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rect1 = new MyRectangle(1, 5, 6, 1);
        System.out.println(rect1);  // Print rectangle

        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        // Using MyPoint
        MyPoint p1 = new MyPoint(2, 7);
        MyPoint p2 = new MyPoint(5, 2);
        MyRectangle rect2 = new MyRectangle(p1, p2);
        System.out.println(rect2);
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}
