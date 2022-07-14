import java.util.Scanner;
public class BitsToGb_Mb_Kb_B{
public static void main(String args[]){
	Scanner input= new Scanner(System.in);
	System.out.print("Enter number of bits: ");
	int bits = input.nextInt();
	int giga = bits / 1024/ 1024/ 1024;
	int mega = giga % 1024;
	int kilo = mega %1024;


	System.out.println(giga + " gb "+ mega+ " mb ");

}
}