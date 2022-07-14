import java.util.Scanner;
public class Testig {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	int numCahr;
	for(int i = 1; i<=4; i++){
		numCahr = 66;
		for(int j = i; j<=4 ; j++){
			System.out.print((char)numCahr);
			System.out.print(numCahr);
			System.out.print(" ");
			numCahr +=2;
			}
			System.out.println();

		}

}
}