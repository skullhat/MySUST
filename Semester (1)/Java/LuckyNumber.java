import java.util.Scanner;
public class LuckyNumber {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number of 4 digits (1234): ");
	int num = input.nextInt();
	int num4= num%10;
	int num3= (num/10) % 10;
	int num2= (num/100) % 10;
	int num1= (num/1000) % 10;
	if ((num4+num3) == (num2+num1))
		System.out.println( num + " is lucky number" );
	else
		System.out.println(num + " is not lucky number");


}
}