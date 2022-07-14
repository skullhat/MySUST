import java.util.Scanner;
public class Ex3 {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	/*System.out.print("Enter number: ");
	int n = input.nextInt();
	int i = 1,sum=0;
	while(i<=n/2){
		if (n %i ==0){
				sum +=i;
			}
		i++;
		}
		if ((sum+n) != n+1)
			System.out.println( n + " not prime number");
		else
			System.out.println( n + " is prime number");

*/
//other suotion
	System.out.print("Enter number: ");
	int n = input.nextInt();
	int sum=0;
	for (int i = 1; i<=n/2;i++){
		if (n% i == 0)
			sum += i;
		}
		System.out.println(sum==1 ? "prime":"not prime");
}
}