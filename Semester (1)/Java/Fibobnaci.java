public class Fibobnaci{
	public static void main(String args[]){
	int num1=0,num2=1,num3,i,elements=10;
	System.out.print(num1 +", "+ num2);
	for (i=2;i<elements;++i){
		num3 = num1 +num2;
		System.out.print(", "+ num3);
		num1 = num2;
		num2 = num3;
		}
	}
}