import java.util.Scanner;
public class GussGame{
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter 0 for head and 1 for tail: ");
	int num = input.nextInt();
	int randGuss = (int)(Math.random()*10);

	if (num == 0 || num == 1){
		while (randGuss != 1 || randGuss!=0){
		randGuss = (int)(Math.random()*10);
		if (randGuss == 1 || randGuss==0)
			break;
		}
		if (num == randGuss && randGuss == 0)
			System.out.println("Head. your guss is correct");
		else if (num == randGuss && randGuss == 1)
			System.out.println("Tail. your guss is correct");
		else{
			System.out.println((randGuss == 0) ? "head":"tail");
			System.out.println("your guss is not correct");
			}


		}
		else
			System.out.println("please enter 0 or 1");


	}
	}