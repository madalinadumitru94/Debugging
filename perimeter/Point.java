package Debugging.perimeter;

public class Point {
    private int x;
    private int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceTo (Point otherPt) {
        int dx = x - otherPt.getX();
        int dy = y - otherPt.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

//    public double distanceTo2 (Point p1, Point p2) {
//        int dx = p1.getX() - p2.getX();
//        int dy = p1.getY() - p2.getY();
//        return Math.sqrt(dx * dx + dy * dy);
//    }
    //se apeleaza p1.distanceTo2(p1,p2);

    public static double distanceTo2 (Point p1, Point p2) {
        int dx = p1.getX() - p2.getX();
        int dy = p1.getY() - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    //Se apeleaza pe clasa Points.distranceTo2(p1,p2);
}
