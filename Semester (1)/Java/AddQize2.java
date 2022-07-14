import java.util.Scanner;
public class AddQize2{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int r1 = (int)(Math.random() * 10);
		int r2 = (int)(Math.random() * 10);
		int r3 = (int)(Math.random() * 10);
		System.out.print("Enter the summition of: " + r1 +"+"+r2+"+"+r3+" = .");
		int result = input.nextInt();
		if (result == (r1+r2+r3))
			System.out.println("your are correct!");
		else if(result != (r1+r2+r3))
			System.out.println("You are wrong!");


	}
}
