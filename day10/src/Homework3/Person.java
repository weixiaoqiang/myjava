package Homework3;

public class Person {
	
	public String personName;
	public String personSex;
	public int personAge;	

	public String row(String name,String sex,int age,String boatname,String model) {
		return "姓名："+name+",性别："+sex+",年龄："+age+"，划着一艘名叫："+boatname+",型号为："+model+",过黄河";
	}
}
