import java.util.Scanner;
public class SimpleCalc {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number1 operator number2 example (1+3): ");
	double num = input.nextDouble();
	char op = input.next().charAt(0);
	double num2 = input.nextDouble();
	if (op == '+')
		System.out.println("result: " + (num+num2) );
	else if (op == '-')
		System.out.println("result: " + (num-num2) );
	else if (op == '*')
		System.out.println("result: " + (num*num2) );
	else if (op == '/')
		System.out.println("result: " + (num/num2) );
	else
		System.out.println("Error in inputs" );

}
}