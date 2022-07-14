import java.util.Scanner;

public class DynaicArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[1];
        int control = 1;

        while (control != 0) {

            myArray = add(myArray);
            System.out.println("enter any number to continue or 0 to stop: ");
            control = input.nextInt();
        }
        System.out.println("elmesnt are");
        for (int i : myArray) {

            System.out.println(i);
        }
    }

    public static int[] add(int[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter element: ");
        int ele = input.nextInt();
        int[] nArr;
        int size = arr.length;
        // normal add
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i] == 0) {

                arr[i] = ele;

                return arr;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (!(i < arr.length - 1 && arr[i] == 0)) {
                nArr = new int[size + 1];
                // copy ele to new array
                for (int k = 0; k < nArr.length; k++) {
                    if (k <= arr.length - 1) {
                        nArr[k] = arr[k];
                        continue;
                    } else {
                        // new element
                        nArr[nArr.length - 1] = ele;
                    }
                }
                return nArr;
            }

        }
        return new int[1];
    }

}
