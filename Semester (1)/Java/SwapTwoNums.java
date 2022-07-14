import java.util.Scanner;
public class SwapTwoNums {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	int a = 1;
	int b = 5;
	System.out.println("a = " + a + " ,b = "+ b);
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("a = " + a + " ,b = "+ b);

}
}