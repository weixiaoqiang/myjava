package Homework3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Person person=new Person();
		Boat boat=new Boat();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你的名字：");
		String personName=person.personName=input.next();
		System.out.println("请输入你的性别：");
		String personSex=person.personSex=input.next();
		System.out.println("请输入你的年龄：");
		int personAge=person.personAge=input.nextInt();
		System.out.println("请输入船的名字：");
		String boatName=boat.boatName=input.next();
		System.out.println("请输入船的型号：");
		String boatModel=boat.boatModel=input.next();
		
		System.out.println(person.row(personName, personSex, personAge, boatName, boatModel));
		
	}

}
