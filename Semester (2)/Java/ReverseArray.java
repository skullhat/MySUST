public class ReverseArray {
    public static void main(String[] args) {
        String[] array = { "sami", "ali", "ahmed", "jhon", "mohammed", "omer" };
        String[] revrsedArray = new String[6];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            revrsedArray[j] = array[i];
        }
        for (String i : revrsedArray) {
            System.out.println(
                    i);
        }
    }
}
