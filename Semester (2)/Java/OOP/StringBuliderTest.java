public class StringBuliderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("My Name is Omer");
        // System.out.println(sb.reverse());
        System.out.println(sb.delete(11, sb.length())); // not includig the end!
        System.out.println(sb.append("Ali"));
        System.out.println(sb.deleteCharAt(sb.length() - 1));
        System.out.println(sb.insert(3, "Age Not my "));
        System.out.println(sb.insert(3, "Age Not my ", 4, 8)); 
        System.out.println(sb.replace(0, 7, "Age is ")); //end not includign the end

    }
}
