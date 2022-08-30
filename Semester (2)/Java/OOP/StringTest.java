public class StringTest {
    public static void main(String[] args) {

        // replace()
        String s = "Welcome#to#Java";
        System.out.println(s.replace("#", " "));
        System.out.println(s.replaceFirst("#", " "));

        // split()
        String[] tokens = "Java#HTML#CSS".split("#");
        for (String i : tokens) {
            System.out.println(i);
        }

        // matches()
        String name = "Omer";
        System.out.println(name.matches("Omer"));
        System.out.println("Hello Mr Omer".matches("Hello.*"));
        System.out.println("Hello Mr Omer".matches("Hello.*"));

        // convsion between String and char[] and opposite
        char[] a = "HTML".toCharArray();
        for (char c : a) {
            System.out.print(c + " ");
        }

        String str = String.valueOf(new char[] { 'l', 'o', 'v', 'e' });
        System.out.println("\n" + str);

        String d = new String(new char[] { 's', 't', 'r', 'i', 'n', 'g' });

        // equals()
        System.out.println("String".equals("String"));
        System.out.println("String".equalsIgnoreCase("string"));

        // replaceAll()
        System.out.println("Ali is tall".replaceAll("tall", "short"));

        // tests

        System.out.println("Welcome to Java".replace("Java", "HTML"));

        // //String s1 = "Welcome to Java";
        // String s2 = s1.replace("o", "abc");
        // System.out.println(s1);
        // System.out.println(s2);

        // Let s1 be "Welcome" and s2 be "welcome". Write the code for the following
        // statements:
        // a. Replace all occurrences of the character e with E in s1 and assign the new
        // string
        // to s2.
        // b. Split Welcome to Java and HTML into an array tokens delimited by a space
        // and assign the first two tokens into s1 and s2.

        String s1 = "Welcome";
        String s2 = "welcome";
        s2 = s1.replace('e', 'E');
        String[] toknes = "Welcome to Java and HTML".split(" ");
        s1 = tokens[0];
        s2 = tokens[1];

        System.out.println("s1 is: " + s1 + "\ns2 is: " + s2);
    }
}
