import java.util.Scanner;
public class ValueSum {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number: ");
	int num = input.nextInt();
	char x = (char)num;
			System.out.println( x );

//	for (int i = 0)
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