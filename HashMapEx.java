import java.util.HashMap;

public class HashMapEx{
	public static void main(String aa[]){
		HashMap<Integer,String> hm = new HashMap<Integer,String>();


		hm.put(1,"Islamabad is capital of Pakistan");
		hm.put(2,"Dehli");
		hm.put(3,"Ertugural Bay");

		hm.remove(2);
		//System.out.println(hm.get(1));
		//System.out.println(hm.get(2));


		//hm.clear();    // To clear All the contents

		for (int i: hm.keySet()){

			System.out.println("Key: "+i+" Value: "+hm.get(i));
		}





	}


}