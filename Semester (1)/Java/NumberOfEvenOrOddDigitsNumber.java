import java.util.Scanner;
public class NumberOfEvenOrOddDigitsNumber {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = input.nextInt();

	int element=num;
	int odd = 0, even=0;
	while(num!=0){
		element=num;
		element%= 10;
		if (element%2==0)
			even++;
		if (element%2!=0)
			odd++;
		num/=10;
		}

		 	System.out.println("odds is: " +odd+"\nevens is: " +even );



}
}