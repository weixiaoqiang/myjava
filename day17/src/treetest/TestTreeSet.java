package treetest;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet<Student> arr=new TreeSet<>();
		arr.add(new Student("T1",1));
		arr.add(new Student("T4",4));
		arr.add(new Student("T2",2));
		arr.add(new Student("T3",3));
		for (Student student : arr) {
			System.out.println(student);
		}
	}

}
