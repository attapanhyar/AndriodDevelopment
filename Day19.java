import java.util.ArrayList;
import java.util.Collections;

public class Day19{
	public static void main(String aa[]){
	
	ArrayList<String> list = new <String>ArrayList();
	ArrayList<Integer> newList = new <Integer>ArrayList();


	//ArrayList<Datatype> name = new <DataType>ArraList();

	list.add("Ali");
	list.add("Shahzad");
	list.add("Boota");

	//System.out.println(list.get(0));

/*
	for (int i =0;i<list.size();i++){

		System.out.println(list.get(i));
	}
*/
	for(String name:list){
		System.out.println(name);
	}


	//list.set(1,"Ibrahim");
	
	//System.out.println(list);

	newList.add(1);
	newList.add(-1);
	newList.add(121);
	newList.add(12);
	newList.add(153);
	newList.add(112);
	newList.add(11);
	//Sorting Integers and Strings using sort() method
	Collections.sort(list);
	Collections.sort(newList);
	// Removing particular index value
	newList.remove(1);

	// Traversing through the list
	for(int i:newList){
		System.out.println(i);

	}


	
	}



}