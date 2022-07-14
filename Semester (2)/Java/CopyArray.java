public class CopyArray {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 8, 9, 2 };
        int[] arrTar = new int[arr.length];

        System.arraycopy(arr, 0, arrTar, 0, arr.length);

        for (int e : arrTar) {
            System.out.println(e);
        }
    }
}
