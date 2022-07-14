import java.util.Scanner;
public class Ex0 {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number between 1 and 10: ");
	int num = input.nextInt();

	while(num <1 || num>10){
		System.out.print(num + " is not between 1 and 10. Try Again! ");
		num = input.nextInt();
		}
		System.out.println(num + " is between 1 and 10");


}
}