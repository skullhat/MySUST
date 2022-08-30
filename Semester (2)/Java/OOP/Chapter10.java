public class Chapter10 {
    public static void main(String[] args) {
        // Integer a = new Integer("23");
        // Integer b = new Integer(23);
        // Integer c = Integer.valueOf("23");
        // Integer d = Integer.parseInt("23", 8);
        // Double e = new Double();
        // Double f = Double.valueOf("23.45");
        // int g = (Integer.valueOf("23")).intValue();
        // double h = (Double.valueOf("23.4")).doubleValue();
        // int i = (Double.valueOf("23.4")).intValue();
        // String j = (Double.valueOf("23.4")).toString();

        // Integer x = new Integer(3);
        // System.out.println(x.intValue());
        // System.out.println(x.compareTo(new Integer(4)));

        // System.out.println(Integer.parseInt("10"));
        // System.out.println(Integer.parseInt("10", 10));
        // System.out.println(Integer.parseInt("10", 16));
        // System.out.println(Integer.parseInt("11"));
        // System.out.println(Integer.parseInt("11", 10));
        // System.out.println(Integer.parseInt("11", 16));

        // Double x = 3.5;
        // System.out.println(x.intValue());
        // System.out.println(x.compareTo(4.5));

        java.math.BigInteger x = new java.math.BigInteger("3");
        java.math.BigInteger y = new java.math.BigInteger("7");
        java.math.BigInteger z = x.add(y);
        System.out.println("x is " + x);
        System.out.println("y is " + y);
        System.out.println("z is " + z);
    }
}
