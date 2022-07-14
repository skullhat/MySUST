public class Arraytest {
    public static void main(String[] args) {
        char[] city = { 'D', 'a', 'l', 'l', 'a', 's' };
        System.out.println(city);

        int list[] = { 1, 2, 3, 4, 5, 6 };
        for (int i = 1; i < list.length; i++)
            list[i] = list[i - 1];
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
