public class Diamond_Triangle {
    public static void main(String[] args) {
        int n = 5;
	//outer loop
		for (int i=1; i<n; i++){
	//decreases triangle of spaces
			for(int j = i; j<=n; j++){
				System.out.print(" ");
				}
	/* decreases triangle
		note:
			must decreased by one column to have a top
	*/
			for (int j = 1; j<i; j++){
				System.out.print("*");
				}
	//increases triangle of *
			for (int j = 1; j<=i; j++){
				System.out.print("*");
				}
		//numbers of lines
		System.out.println();
}
	//outer loop
		for (int i=1; i<=n; i++){
			//increases triangle of spaces
			for (int j = 1; j<=i; j++){
				System.out.print(" ");
				}
				/* decreases triangle
				note:
					must decreased by one column to have a top
				*/
			for (int j = i; j<n; j++){
				System.out.print("*");
				}
				//decreases triangle of *
			for (int j = i; j<=n; j++){
				System.out.print("*");
				}
		//numbers of lines
		System.out.println();
		}


    }
}
