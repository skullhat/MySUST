import java.util.Scanner;
public class Ex7 {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.println("enter a number: ");
	int n = input.nextInt();
	int v1=1,v2=1,sum=0;
	for(int i = 1; i<= n -2; i++){
		sum =v1+v2;
		v1 = v2;
		v2 = sum;
		}
	System.out.println(sum + " ");



}
}