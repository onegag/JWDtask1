package by.tamkovich.cube.entity;

public class Cube {
    private Point center;
    private double side;

    public Cube(Point center, Double side) {
        this.center = center;
        this.side = side;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "center=" + center +
                ", side=" + side +
                '}';
    }
}
