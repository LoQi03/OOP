package feladat1;

public class Rectangle {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(int a) {
        this.a = a;
        b = a;
    }

    public int getArea() {
        return a * b;
    }

    public void setSides(int a) {
        this.a = a;
        this.b = a;
    }

    public void setSides(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean isAreaGreater(Rectangle other) {
        return this.getArea() > other.getArea();
    }

    public boolean sidesEqual(Rectangle other) {
        return (a == other.getA() && b == other.getB()) || (b == other.getA() && a == other.getB());
    }

    @Override
    public String toString() {
        return "Rectangle [a=" + a + ", b=" + b + ", area=" + getArea() + "]";
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

}
