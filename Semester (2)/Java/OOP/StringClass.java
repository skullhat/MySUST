public class StringClass {
    public static void main(String[] args) {
        // String x = "C++#C#HTML#CSS";
        // System.out.println(x.split("#"));
        // for (String i : x.split("#")) {
        // System.out.println(i);

        char[] dst = { 'J', 'A', 'V', 'A', '1', '3', '0', '1' };
        "CS3720".getChars(2, 6, dst, 4);
        for (char i : dst) {
            System.out.print(i);
        }

    }
}
