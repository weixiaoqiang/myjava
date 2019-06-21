package treetest;


import java.util.TreeSet;

public class TestTreeSet2 {
	public static void main(String[] args) {
		/*TreeSet<Student> arr = new TreeSet<>(new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o1.getAge()-o2.getAge();
			}
		});*/
		TreeSet<Student> arr=new TreeSet<>((o1,o2) ->{
			return o1.getAge()-o2.getAge();
		});
		
		arr.add(new Student("T1",1));
		arr.add(new Student("T4",4));
		arr.add(new Student("T2",2));
		arr.add(new Student("T3",3));
		for (Student student : arr) {
			System.out.println(student);
		}
		

	}
}
