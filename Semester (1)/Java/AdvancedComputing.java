import java.util.Scanner;
public class AdvancedComputing{
public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		int x = 1,possitive=0,negative=0;
		double sum=0;
		while (x !=0){
			System.out.print("Enter an integer, the input ends if it is 0: ");
			x = input.nextInt();
			if (x>0){
				possitive += 1;
				}
			else if (x<0){
				negative += 1;
				}
			sum += x;
			}
		double avg = sum/(possitive+negative);
		System.out.println("Possitive = " + possitive + "Negative = " + negative);
		System.out.println("Total = " + sum + "Avarge = " + avg);


	}
}