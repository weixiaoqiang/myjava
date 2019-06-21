package homework2;


public class StudentManager {
	private String stuName;//学生姓名
	private char stuSex;//学生性别
	private int stuAge;//学生年龄
	private String stuCode;//学号
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public char getStuSex() {
		return stuSex;
	}
	public void setStuSex(char stuSex) {
		this.stuSex = stuSex;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public String getStuCode() {
		return stuCode;
	}
	public void setStuCode(String stuCode) {
		this.stuCode = stuCode;
	}
	
	public StudentManager(String stuCode,String stuName, char stuSex, int stuAge) {
		super();
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuAge = stuAge;
		this.stuCode = stuCode;
	}
	public StudentManager() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "StudentManager [stuName=" + stuName + ", stuSex=" + stuSex + ", stuAge=" + stuAge + ", stuCode="
				+ stuCode + "]";
	}
	
	
	
	

}
