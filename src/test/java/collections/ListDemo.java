package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> obj= new ArrayList<Integer>();
		//ArrayList obj = new ArrayList();
		obj.add(234567);
		obj.add(234567);
		obj.add(null);
		//obj.add("Asha");
		obj.add(null);
		//obj.add("sri");
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.get(2));
		
		List<Integer> obj1 = new LinkedList<Integer>();
		obj1.add(234567);
		obj1.add(234567);
		obj1.add(null);
		obj1.add(null);
		obj1.add(123456);
		System.out.println(obj1);
		for (Integer integer : obj1) {
			System.out.println(integer);
			
		
		}
		
		HashSet<Integer> obj3= new HashSet<Integer>();
		
		obj3.add(3000);
		obj3.add(2000);
		obj3.add(null);
		obj3.add(null);
		obj3.add(5000);
		System.out.println(obj3);
		System.out.println(obj3.size());
		
		
		TreeSet<String> obj4 =new TreeSet<String>();
		obj4.add("Ant");
		obj4.add("Zebra");
		obj4.add("Bat");
		//obj4.add(null); cannot take null values
		obj4.add("Ant");
	
		System.out.println(obj4);
		
		Set<Integer> obj5 =new LinkedHashSet<Integer>();
		
		obj5.add(3000);
		obj5.add(2000);
		obj5.add(null);
		obj5.add(null);
		obj5.add(5000);
		System.out.println(obj5);
		System.out.println(obj5.size());
		
		
		Map<String, Integer> obj6 = new HashMap<String, Integer>();
		obj6.put("Asha", 50000);
		obj6.put("Srihitha", 60000);
		obj6.put("Ishitha", 70000);
		obj6.put(null, 40000);
		obj6.put(null, 60000);
		obj6.put("Ishitha", null);
		obj6.put("pavan", null);
		
		System.out.println(obj6);
		System.out.println(obj6.get("Asha"));
		
		Map<String,Integer> obj7 =new TreeMap<String, Integer>();
		obj7.put("Asha", 50000);
		obj7.put("Srihitha", 60000);
		obj7.put("Ishitha", 70000);
		//obj7.put(null, 40000);
		//obj7.put(null, 60000);
		obj7.put("Ishitha", null);
		obj7.put("pavan", null);
		System.out.println(obj7);
		System.out.println(obj7.get("Asha"));
		
		

	}

}
