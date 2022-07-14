import java.util.Scanner;
public class Ex13 {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.println("enter a num of lines: ");
//char c= n.charAt(0);
	int n = input.nextInt();
	for (int i = 1; i<=n; i++){
		for(int j = 1; j<=n;j++){
			System.out.print("*");
			}
			System.out.println();

		}




}
}