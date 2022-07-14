import java.util.Scanner;
public class LengthOfNum {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = input.nextInt();

	int length=0;
	while(num!=0){
		num/= 10;
		length++;
		}

		 	System.out.println("length of number is: " +length);



}
}