import java.util.Scanner;
public class Ex12 {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.println("enter a num of lines: ");
//char c= n.charAt(0);
	int n = input.nextInt();
	for (int i = 1; i<=n; i++){
		for(int j = i; j<n;j++){
			System.out.print(" ");
			}
		for(int j = 1; j<=2*i-1;j++){
			if (i==n)
				 System.out.print("*");
				else if(j == 1 || j==2*i-1)
					System.out.print("*");
					else
					System.out.print(" ");

			}
			System.out.println();

		}




}
}