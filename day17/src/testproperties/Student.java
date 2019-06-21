package testproperties;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	private String stuNo;
	public String getName() {
		return name;
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Student(String stuNo,String name, int age) {
		super();
		this.stuNo=stuNo;
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
	}
	
	@Override
	public int compareTo(Student o) {
		return o.getAge()-this.getAge();
	}
	@Override
	public String toString() {
		return "Student [姓名=" + name + ", 年龄=" + age + ", 学号=" + stuNo + "]";
	}
	
	
}
