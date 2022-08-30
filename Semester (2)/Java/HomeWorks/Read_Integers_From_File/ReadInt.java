import java.io.*;
import java.util.Scanner;

public class ReadInt {
    public static void main(String[] args) {
        // First way: Using Scanner:
        System.out.println("First way: Using Scanner:");

        try {
            Scanner inF = new Scanner(new File("integers.txt"));
            int[] scanerInt = new int[10];
            int i = 0;
            while (inF.hasNextLine()) {
                scanerInt[i++] = inF.nextInt();
            }
            inF.close();

            for (int x : scanerInt) {
                System.out.println(x);
            }

        } catch (IOException e) {

        }

        // Seconds Way: Using BufferedReader:

        System.out.println("Seconds Way: Using BufferedReader:");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("integers.txt"));

            String Int_line;

            while ((Int_line = reader.readLine()) != null) {
                int In_Value = Integer.parseInt(Int_line);

                System.out.println(Int_line);
            }

        } catch (IOException e) {

        }

    }
}
