import java.util.Scanner;
public class ScannerTemp{
public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		//print //number of repition num1--> num2 avg + max +min
		/*System.out.print();
		System.out.println();*/
		//number of inputs
		int x= input.nextInt();
		System.out.print("Enter number "+1 +" " );
			int j= input.nextInt();
		int i = 1,sum=0,max=j,min=j;
		while (i<x){
			System.out.print("Enter number "+(i+1) +" " );
			j= input.nextInt();
			//min = i;
			//sum
			sum +=j;

			   max = Math.max(j,max);
			   min = Math.min(j,min);
			   // min = Math.min(i,j);

			i++;
			}
			int avg = sum/x;
			System.out.print("max " + max + " min "+ min + " avg " + avg);
}
}