import java.util.Scanner;
public class Ex002 {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	/*
	Write a Java program to multiply two given integers without
	using the multiply operator(*). Go to the editor

	Input the first number: 25
	Input the second number: 5
Result: 125
*/
//other suotion
	System.out.print("Enter number 1 : ");
	int n = input.nextInt();
	System.out.print("Enter number 2 : ");
	int n2 = input.nextInt();
	int r=0;
	for (int i =1 ; i <=n2;i++){
		r+=n;
		}
	System.out.print("the rusult is: "+ r);

}
}