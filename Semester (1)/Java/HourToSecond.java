import java.util.Scanner;
public class HourToSecond{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter hours: ");
		int hour=input.nextInt();
		int seconds=hour*60*60;
		System.out.println(hour+" hours is "+seconds+" seconds");


}

}