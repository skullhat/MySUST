import java.util.Scanner;

public class ArraysMethods {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int target = 7;
        fillArray(arr);
        printArray(arr);
        if (searchArray(arr, target) > 0) {
            System.out.println(target + " is found");
        } else {
            System.out.println(target + " not found");

        }
    }

    public static void fillArray(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter Value No. " + (i + 1));
            array[i] = input.nextInt();
        }
    }

    public static void printArray(int[] array) {
        System.out.println("your array elements are:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int searchArray(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return array[i];
            }
        }
        return -1;
    }
}