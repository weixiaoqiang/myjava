package test1;

import java.util.LinkedList;
import java.util.List;

import sun.text.resources.FormatData;

public class Test {

	public static void main(String[] args) {
		LinkedList list=new LinkedList<>();
		Test test=new Test();
		
		list.add("你是生是死");
		list.add("sss");
		list.add("sss");
		list.addFirst(333);
		list.add(2, "十四");
		list.remove("sss");
		test.name(list);
	}
	public void name(List arr) {
		for(Object s : arr) {
			System.out.println(s);
		}
	}
	
	
}
