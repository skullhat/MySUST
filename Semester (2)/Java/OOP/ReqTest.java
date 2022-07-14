public class ReqTest {
    public static void main(String[] args) {
        Reqtangle r1 = new Reqtangle();
        r1.setLength(5);
        r1.setWidth(4);
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        System.out.println(r1.getArea());

        Reqtangle r2 = new Reqtangle(5, 7);
        System.out.println(r2.getArea());
    }
}
