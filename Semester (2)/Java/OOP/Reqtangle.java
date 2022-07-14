public class Reqtangle {
    private double length;
    private double width;

    public Reqtangle() {

    }

    public Reqtangle(double l, double w) {
        length = l;
        width = w;
    }

    public void setLength(double ln) {
        length = ln;
    }

    public void setWidth(double wd) {
        width = wd;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width * 2;
    }

}