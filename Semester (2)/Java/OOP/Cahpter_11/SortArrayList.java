import java.util.ArrayList;
public class SortArrayList{

public static void main(String[] args){

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(5));
		list.add(new Integer(3));
		list.add(new Integer(2));
		sort(list);

		System.out.println(list.toString());

	}
public static void sort(ArrayList<Integer> list){
	for (int i = 0; i< list.size(); i++){
			if (i == list.size() -1) {
				break;
				}
			if (list.get(i).intValue() >  list.get(i+1).intValue()){
				int temp = list.get(i).intValue();
				list.set(i,list.get(i+1));
				list.set(i+1,new Integer(temp));
				i=-1;
				}


		}

	}

}
/*
(Sort ArrayList) Write the following method that sorts an ArrayList of
numbers:
public static void sort(ArrayList<Integer> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an
array list, and displays them in increasing order.

*/