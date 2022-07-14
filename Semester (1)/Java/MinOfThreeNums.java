import java.util.Scanner;
public class MinOfThreeNums{
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("enter number one:");
	byte a = input.nextByte();
	System.out.print("enter number two:");
	byte b = input.nextByte();
	System.out.print("enter number three:");
	byte c = input.nextByte();
	byte aAndB = (byte)Math.min(a,b);
	byte smallest = (byte)Math.min(aAndB,c);
	System.out.println("number one = "+a+"\nnumber two = "+b+"\nnumber three = "+c+"\nsmallest = "+smallest);
	}
}