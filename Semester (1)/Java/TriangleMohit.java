import java.util.Scanner;
public class TriangleMohit{
public static void main(String args[]){
	Scanner input= new Scanner(System.in);
	System.out.print("Enter side 1 value: ");
	int side1 = input.nextInt();
	System.out.print("Enter side 2 value: ");
	int side2 = input.nextInt();
	System.out.print("Enter side 3 value: ");
	int side3 = input.nextInt();
	int permiter = 0;
	if (((side1 + side2) > side3) &&(side2 + side3 > side1) && (side3 + side1 > side2) ){
		permiter = side1 + side2 +side3;
		System.out.println("permiter is " + permiter);

		}
	else
		System.out.println("invalued inputs.");



}
}