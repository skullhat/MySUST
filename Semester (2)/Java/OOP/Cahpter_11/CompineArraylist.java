import java.util.*;

public class CompineArraylist{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<>();
		for(int i = 0; i< 5 ; i++ ){
			list1.add(new Integer(input.nextInt()));
			}
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i = 0; i< 5 ; i++ ){
					list2.add(new Integer(input.nextInt()));
			}




		System.out.println(union(list1,list2));

		}
		public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
			ArrayList<Integer> list3 = new ArrayList<>();

			for(int i = 0; i<list1.size();i++ ){
				list3.add(list1.get(i));
			}
			for(int i = 0; i<list2.size();i++ ){
				list3.add(list2.get(i));
			}

			return list3;
			}

}

/*

(Combine two lists) Write a method that returns the union of two array lists of
integers using the following header:
public static ArrayList<Integer> union(
ArrayList<Integer> list1, ArrayList<Integer> list2)
*/