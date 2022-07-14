import java.util.Random;
public class RandomMonth{
public static void main(String args[]){
	Random rd= new Random();
	int random = 1 + rd.nextInt(12);
	if (random == 1)
		System.out.println("Jan");
	else if (random == 2)
		System.out.println("Feb");
	else if (random == 3)
		System.out.println("Mar");
	else if (random == 4)
		System.out.println("Apr");
	else if (random == 5)
		System.out.println("May");
	else if (random == 6)
		System.out.println("Jun");
	else if (random == 7)
		System.out.println("July");
	else if (random == 8)
		System.out.println("Aug");
	else if (random == 9)
		System.out.println("Sep");
	else if (random == 10)
		System.out.println("Oct");
	else if (random == 11)
		System.out.println("Nov");
	else if (random == 12)
		System.out.println("Dec");
	else
		System.out.println("Invaid month number!");
	}
}