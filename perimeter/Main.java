package Debugging.perimeter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // (-1,3), (-1,-1), (4, -1), (1, 3)

        //1. rezolva problema pe un exemplu
        //2. scrie ce ai facut
        //3. gasesti pattern-uri si dezvolti un algoritm
        //4. verifica algoritmul de mana
        //5. tradu in cod
        //6. testam si debug


        //calculez distanta de la P1 la P2
        //pana acum am 4
        //calculez distanta de la P2 la P3
        //adaug la 4 pe 5 si imi da 9
        //calculez disnta de la P3 la P4
        // adaug la 9 pe 5 si imi da 14
        //calculez distanta de la P4 la P1
        //adaug la 14 pe 2 si imi da 16
        //16 este rezultatul

        //generalizam

        //calculez distanta de la P1 la P2 (currDist = 4)
        //pana acum am currDist
        //calculez distanta de la P2 la P3 (currDist = 5)
        //adaug la 4 pe currDist si imi da 9
        //calculez disnta de la P3 la P4 (currDist = 5)
        // adaug la 9 pe currDist si imi da 14
        //calculez distanta de la P4 la P1 (currDist = 2)
        //adaug la 14 pe currDist si imi da 16
        //16 este rezultatul

        //totatlPerim este initial 0
        //calculez distanta de la P1 la P2 (currDist = 4)
        //totalPerim devine totalPerim + currDist
        //calculez distanta de la P2 la P3 (currDist = 5)
        //totalPerim devine totalPerim + currDist
        //calculez disnta de la P3 la P4 (currDist = 5)
        //totalPerim devine totalPerim + currDist
        //calculez distanta de la P4 la P1 (currDist = 2)
        //totalPerim devine totalPerim + currDist
        //totalPerim este rezultatul


        //totalPerim este initial 0
        //pentru toate punctele din array (pana la penultimul)
        //calculez distanta de la points[i] la points[i+1] (currDist)
        //totalPerim devine totalPerim + currDist
        //calculez disntata dela ultimul (lenght-1) la primul (0)
        //totalPerim devine totalPerim + currDist
        //returnez totalPerim



        //varianta 2

        //totatlPerim este initial 0
        //calculez distanta de la P1 la P2 (currDist = 4)
        //totalPerim devine totalPerim + currDist
        //calculez distanta de la P2 la P3 (currDist = 5)
        //totalPerim devine totalPerim + currDist
        //calculez disnta de la P3 la P4 (currDist = 5)
        //totalPerim devine totalPerim + currDist
        //calculez distanta de la P4 la P1 (currDist = 2)
        //totalPerim devine totalPerim + currDist
        //totalPerim este rezultatul


        //folosim prev

        //totatlPerim este initial 0
        //initial prev este P4 (ultimul punct din array)
        //calculez distanta de la prev la P1 (currDist)
        //totalPerim devine totalPerim + currDist
        //prev devine P1
        //calculez distanta de la prev la P2 (currDist)
        //totalPerim devine totalPerim + currDist
        //prev devine P2
        //calculez disnta de la prev la P3 (currDist)
        //totalPerim devine totalPerim + currDist
        //prev devine P3
        //calculez distanta de la prev la P4 (currDist)
        //totalPerim devine totalPerim + currDist
        //prev devine P4
        //totalPerim este rezultatul

        //totatlPerim este initial 0
        //initial prev este P4 (ultimul punct din array)
        //pentru fiecare point[i] din array
        //calculez distanta de la prev la point[i]
        //totalPerim devine totalPerim + currDist
        //prev devine point[i]
        //totalPerim e rezultatul


        //1. testam cum functioneaza metodele care calculeaza perimetrul
//        Shape shape = new Shape(new Point[]{new Point(0,0),new Point(6,0),new Point(3,6)});
//        System.out.println(getPerimeter2(shape));
//        System.out.println(getPerimeter(shape));

        //2. mai jos, ai 4 variante ale metodei getNumPoints, care numara cate puncte are o forma.
        //2.1 Care dintre variante nu este o implementare corecta?
        //2.2 Gasesti o implementare mai simpla pentru aceasta metoda? Scrie implementarea in metoda getNumPoints()

        //3. scrie o metoda care sa returneze valoarea celui mai mare X din punctele unei forme

        //4. scrie o metoda care sa returneze lungimea celei mai lungi laturi a unei forme

        //5. scrie o metoda care sa returneze distanta medie dintre punctele unei forme

        //6. scrie o metoda care sa returneze cel mai mare perimetru dintr-o lista de forme

        //7. ai mai jos metoda "misterioasa". Fa debug manual daca ai nevoie, si apoi descrie ce face aceasta metoda.

        int x1 = -1;
        int y1 = 3;
        int x2 = -1;
        int y2 = -1;
        int x3 = 4;
        int y3 = -1;
        int x4 = 1;
        int y4 = 3;
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Point p3 = new Point(x3, y3);
        Point p4 = new Point(x4, y4);
        Point[] pointsTrapez = {p1, p2, p3, p4};
        Point[] pointsTriunghi = {p1, p2, p3};
        Shape trapez = new Shape();
        trapez.setPoints(pointsTrapez);
        trapez.setNumberOfPoints(4);
        Shape triunghi = new Shape();
        triunghi.setPoints(pointsTriunghi);
        triunghi.setNumberOfPoints(3);
        System.out.println(getPerimeter(trapez));
        System.out.println(getPerimeter2(trapez));
        System.out.println(getNumPoints1(trapez));
        System.out.println(getNumPoints2(trapez));
        //System.out.println(getNumPoints3(trapez)); aceasta metoda calculeaza gresit
        System.out.println(getNumPoints4(trapez));
        System.out.println(getNumPoints(trapez));
        try {
            System.out.println("Cel mai mare X: " + trapez.getBiggestX());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Cea mai lunga latura" + trapez.getLongestSideLength());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Distanta medie a laturilor" + trapez.getAverageDistanceBetweenPoints());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        List<Shape> shapes = new ArrayList<>();
        shapes.add(trapez);
        shapes.add(triunghi);
        try {
            System.out.println("Perimetrul maxim din lista de forme" + getMaxPerimeter(shapes));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static double getPerimeter2(Shape shape){
        double totalPerim = 0;
        Point[] points = shape.getPoints();
        int numberOfPoints = shape.getNumberOfPoints();
        Point prev = points[numberOfPoints-1];
        for (int i = 0; i <numberOfPoints ; i++) {
            totalPerim += prev.distanceTo(points[i]);
            prev = points[i];
        }
        return totalPerim;
    }

    public static double getPerimeter (Shape shape){
        double totalPerim = 0;
        Point[] points  = shape.getPoints();
        int numberOfPoints = shape.getNumberOfPoints();
        for (int i = 0; i < numberOfPoints-1; i++) {
            double currDist = points[i].distanceTo(points[i+1]);
            totalPerim = totalPerim + currDist;
        }
        totalPerim = totalPerim + points[numberOfPoints-1].distanceTo(points[0]);
        return totalPerim;
    }

    public static int getNumPoints1 (Shape s) {
        int count = 0;
        for (Point p : s.getPoints()) {
            int newPoint = 1;
            count = count + newPoint;
        }
        return count;
    }

    public static int getNumPoints2 (Shape s) {
        int count = 0;
        for (Point p : s.getPoints()) {
            count = count + 1;
        }
        return count;
    }

    public static int getNumPoints3 (Shape s) {
        int count = 0;
        for (Point p : s.getPoints()) {
            count = count + count;
        }
        return count;
    }

    public static int getNumPoints4 (Shape s) {
        int count = 0;
        int newPoint = 1;
        for (Point p : s.getPoints()) {
            count = count + newPoint;
        }
        return count;
    }

    public static int getNumPoints(Shape s){
        int count =0;
        for (int i = 0; i < s.getNumberOfPoints(); i++) {
            count++;
        }
        return count;
    }
    public static double getMaxPerimeter(List<Shape> shapes) throws Exception{
        if (shapes == null) {
            throw new Exception("Lista nu poate fi goala");
        }

        double maxPerimeter = 0;
        for (Shape shape : shapes) {
            double perimeter = getPerimeter(shape);
            if (perimeter > maxPerimeter) {
                maxPerimeter = perimeter;
            }
        }
        return maxPerimeter;
    }
    public static double misterioasa (Shape s) {
        double tmp = 0;
        for (Point p : s.getPoints()) {

            if (p.getX() > 0) {

                if (p.getY() < 0) {
                    tmp = tmp + 1;
                }
            }
        }
        return tmp / getNumPoints(s);
    }
// Metoda misterioasa calculează proporția punctelor dintr-o formă care au coordonata X pozitivă și coordonata Y negativă. Metoda parcurge toate punctele unei forme și incrementeaza un contor atunci cand punctul are coordonata X pozitivă și coordonata Y negativă. La final, metoda împarte contorul la numărul total de puncte din formă.
}
