public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public MyPoint distance(int x, int y) {
        MyPoint distance = new MyPoint();
        distance.x = (int) Math.abs(this.x - x);
        distance.y = (int) Math.abs(this.y - y);
        return distance;
    }

    public MyPoint distance(MyPoint obj) {
        MyPoint distance = new MyPoint();
        distance.x = (int) Math.abs(this.x - obj.x);
        distance.y = (int) Math.abs(this.y - obj.y);
        return distance;
    }

    public static MyPoint distance(MyPoint obj1, MyPoint obj2) {
        MyPoint distance = new MyPoint();
        distance.x = (int) Math.abs(obj1.x - obj2.x);
        distance.y = (int) Math.abs(obj1.y - obj2.y);
        return distance;
    }
}
