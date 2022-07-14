import java.util.Scanner;
public class Ex2 {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter number: ");
	int n = input.nextInt();

	int i = 1,sum=0;
	while(i<=n/2){

		if (n %i ==0){
				System.out.print(i+" ");
				sum +=i;
			}
		i++;
		}
		System.out.println();
		System.out.println((sum + n)+" is sum of divosor ");


}
}