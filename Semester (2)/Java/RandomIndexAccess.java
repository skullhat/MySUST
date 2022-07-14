public class RandomIndexAccess {
    public static void main(String[] args) {
        int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(randomIndex(x));

    }

    public static int randomIndex(int[] arr) {
        int rand = (int) (Math.random() * arr.length - 1);
        if (rand > arr.length) {
            randomIndex(arr);
            return arr[rand];
        } else
            return arr[rand];
    }
}
