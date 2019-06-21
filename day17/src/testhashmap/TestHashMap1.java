package testhashmap;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestHashMap1 {
	public static void main(String [] args) {
		HashMap<String, Student> hMap=new HashMap<>();
		hMap.put("001", new Student("ss", 18));
		hMap.put("002", new Student("ss1",15));
		hMap.put("002",new Student("ss2",52));
		hMap.remove("002");
		for (String string : hMap.keySet()) {
			Student	 vlure=hMap.get(string);
			System.out.println(vlure);
		}
		TreeMap<String,Student> tMap=new TreeMap<>();
		String String="ssss";
		System.out.println(String);
	}
}
