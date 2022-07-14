import java.util.Scanner;
public class Ex9 {
public static void main(String args[]){
	Scanner input = new Scanner(System.in);
//	System.out.println("enter a string: ");
	String n = "lsok";
	//char c= n.charAt(0);
	int l = n.length() -1;
	boolean isPallarendom = true;
	for (int i = 0, j = l; i<j; i++,j--){
		if (n.charAt(i)==n.charAt(j)){
			continue;
			}
		isPallarendom = false;
		break;
		}
	System.out.println(isPallarendom ? "is Pallarendom":" not is Pallarendom");




}
}