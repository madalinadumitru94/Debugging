package Debugging.perimeter;

import Debugging.perimeter.Point;

public class Shape {

    private Point[] points;
    private int numberOfPoints;

    public Shape() {
        this.points = new Point[10];
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public int getBiggestX () throws Exception {
        if (numberOfPoints == 0) {
            throw new Exception("Nu sunt puncte in forma");
        }
        int maxX = points[0].getX();
        for (int i = 1; i < numberOfPoints; i++) {
            if (points[i].getX() > maxX) {
                maxX = points[i].getX();
            }
        }
        return maxX;
    }

    public double getLongestSideLength () throws Exception {
        if (numberOfPoints <= 1) {
            throw new Exception("Nu se poate calcula o latura");
        }
        double maxLength = points[0].distanceTo(points[1]);
        for (int i = 1; i < numberOfPoints-1; i++) {
            if (points[i].distanceTo(points[i+1]) > maxLength) {
                maxLength = points[i].distanceTo(points[i+1]);
            }
        }
        return maxLength;
    }

    public double getAverageDistanceBetweenPoints () throws Exception {
        if (numberOfPoints <= 1) {
            throw new Exception("Nu se poate calcula o latura");
        }
        double totalDistance = 0;
        int count = 0;
        for (int i = 0; i < numberOfPoints - 1; i++) {
            totalDistance += points[i].distanceTo(points[i+1]);
            count++;
        }
        return totalDistance / count;
    }
}
