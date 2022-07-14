public class Pattern3{
public static void main(String args[]){
	int n = 6;
	for(int i = 1; i<=n; i++){
		for (int j = i; j<=n; j++){
		System.out.print(" ");
		}
		for (int j = 1 ; j<=n ; j++){
			System.out.print(j + " ");

		}
		System.out.println();
		}
}
}