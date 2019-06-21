package Test;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		Calculate calculate=new Calculate();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入第一个数：");
		double num1=input.nextInt();
		System.out.println("请输入运算符：+，-，*，/");
		char symbol=input.next().charAt(0);
		System.out.println("请输入第二个数：");
		double num2=input.nextInt();
		double result=calculate.rule(num1, symbol, num2);
		

		System.out.println(num1+" "+symbol+" "+num2+" = "+result);
		
	}

}
