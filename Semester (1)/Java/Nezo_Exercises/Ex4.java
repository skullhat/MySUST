import java.util.Scanner;
public class Ex4 {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("enter number: ");
	int n = input.nextInt(),i = n;
	int min = n, max=n;
	while (true){

		max = Math.max(max,i);
		min = Math.min(min,i);
		System.out.print("enter number: ");
		i = input.nextInt();
		if (i<0)
			break;
		}
		System.out.println(" max = " + max +" min = " + min);
}
}