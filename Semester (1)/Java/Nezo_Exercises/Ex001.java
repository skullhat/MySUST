import java.util.Scanner;
public class Ex001 {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	/*S152. Write a Java program that accepts four integer from
	the user and prints equal if all four are equal, and not equal
	otherwise. Go to the editor

Sample Output:
Input first number: 25
Input second number: 37
Input third number: 45
Input fourth number: 23
Numbers are not equal!
*/
//other suotion
	System.out.print("Enter number 1 : ");
	int n = input.nextInt();
	System.out.print("Enter number 2 : ");
	int n2 = input.nextInt();
	System.out.print("Enter number 3 : ");
	int n3 = input.nextInt();
	System.out.print("Enter number 4 : ");
	int n4 = input.nextInt();
	boolean n_n2 =(n == n2);
	boolean n2_n3 =(n2 == n3);
	boolean n3_n4 =(n3 == n4);

	if (n_n2 && n2_n3 &&n3_n4)
		System.out.println("equl");
	else
		System.out.println("not equal");

}
}