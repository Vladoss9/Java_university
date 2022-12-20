package dz2_3;

public class Circle {
    private int Radius = 0;
    private Point Point = new Point(0,0);

    Circle(Point point)
    {
        Point = point;
    }

    Circle(int x, int y)
    {
        Point = new Point(x,y);
    }

    public String ToString()
    {
        return String.format("x: %s y:%s",Point.GetX(), Point.GetX());
    }
}
