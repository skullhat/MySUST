import java.util.Scanner;
public class Accounring{
public static void main(String args[]){
	Scanner input= new Scanner(System.in);
	int saved= 1000;
	System.out.print("Hello,\n1.Eda3\n2.S5b\n3.kshf\n");
	int choise = input.nextInt();
	switch (choise){
		case 1 :
			System.out.print("enter number to be added to your account: ");
				int add = input.nextInt();
				saved += (add-1.5);
			System.out.println("your account has: " + saved);
			break;
		case 2:
			System.out.print("enter number to be reduced from your account: ");
			int reduce = input.nextInt();
			if (reduce > saved){
				System.out.println("you don\'t have enough money in your account.");
				}
			else {
				saved -= (reduce+1.5);
			System.out.println("your account has: " + saved);
		}
			break;
		case 3:
			System.out.println("your account has: " + saved);
			break;

		}


}
}