import java.util.Scanner;
public class ReverseNumber {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = input.nextInt();
	int org = num;
	int rev = 0;
	while(num!=0){
		rev= rev *10 + num%10;
		num/= 10;
		}

		 	System.out.println((rev == org) ? "palindrome": "not palindrome");



}
}