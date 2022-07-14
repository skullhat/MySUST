import java.util.Scanner;
public class Ex1 {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);

	int sum = 0;
	while(true){
		System.out.print("Enter number: ");
		sum += input.nextInt();;
		if (sum > 100)
			break;
		}
		System.out.println("Done " + sum);


}
}