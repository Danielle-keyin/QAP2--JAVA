public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(0, 0, 3, 4);

        System.out.println(line1); // Check toString
        System.out.println("Begin X: " + line1.getBeginX());
        System.out.println("Begin Y: " + line1.getBeginY());
        System.out.println("End X: " + line1.getEndX());
        System.out.println("End Y: " + line1.getEndY());

        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient (radians): " + line1.getGradient());

        line1.setBeginXY(1, 2);
        line1.setEndXY(4, 6);
        System.out.println("Updated Line: " + line1);

        int[] beginXY = line1.getBeginXY();
        int[] endXY = line1.getEndXY();

        System.out.println("BeginXY: (" + beginXY[0] + "," + beginXY[1] + ")");
        System.out.println("EndXY: (" + endXY[0] + "," + endXY[1] + ")");
    }
}