import java.util.Scanner;
public class BMICalulation{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		 System.out.print("Please, enter your wight in pound: ");
		double wightInPounds = scan.nextDouble();
		System.out.print("Please, enter your hight in inches: ");
		double hightInInches = scan.nextDouble();
		double wight = wightInPounds*0.45359237;
		double hight = hightInInches*0.0254;
		double bmi = wight / (hight*hight);
		System.out.println("BMI= " +bmi);

		if (bmi < 18.5)
			System.out.println("Underweight.");
		else if (bmi < 25.0)
			System.out.println("Normal.");
		else if (bmi < 30.0)
			System.out.println("Overweight.");
		else
			System.out.println("Obese.");
		}
}