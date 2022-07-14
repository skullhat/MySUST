public class SumAverageRunningInt {
public static void main(String args[]){
int lowerbound = 1;
int upperbound = 100;
int sum=0;
double avg=0;
for (int i = lowerbound; i<=upperbound; i++){
	sum+=i;
	}
	avg = (sum/100.0);
	System.out.println("sum of numbers from " + lowerbound + " to " + upperbound + " is: " + sum );
	System.out.println("avrage is: " + avg );

}
}