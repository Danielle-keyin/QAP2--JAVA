// wasnt sure the best way to draw the diagram so I put it here



// topLeft: MyPoint

// bottomRight: MyPoint

// Constructors:

// MyRectangle(int x1, int y1, int x2, int y2)

// MyRectangle(MyPoint topLeft, MyPoint bottomRight)

// Methods:

// getTopLeft(): MyPoint

// setTopLeft(MyPoint): void

// getBottomRight(): MyPoint

// setBottomRight(MyPoint): void

// getWidth(): int

// getHeight(): int

// getArea(): int

// getPerimeter(): int

// toString(): String






public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructor using coords
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Constructor using MyPoint objects
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public int getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    public int getArea() {
        return getWidth() * getHeight();
    }

    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
