package edu.escuelaing.arsw.labs.boardws.model;

public class Point {

    private int x;
    private int y;
    private Color color;

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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Point [color=" + color + ", x=" + x + ", y=" + y + "]";
    }

}
