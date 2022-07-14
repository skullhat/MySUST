import java.util.Scanner;
public class Excersizes {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = input.nextInt();
	if (num%2==0)
		System.out.print(num + " is even");
	else
		System.out.print(num + " is odd");
}
}