import java.util.Scanner;
public class Ex5 {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("enter number: ");
	int n = input.nextInt(),sum=0;
	while(n>0){
		sum += n%10; //ABC
		n/= 10;//AB
		}
		System.out.println("sum = " + sum);
}
}