package Homework2;
import java.util.*;

public class Test {
	
   public static void main(String[] args) {
	   ValidateYear validateYear=new ValidateYear();
	   Scanner input=new Scanner(System.in);
	   System.out.println("请输入年份：");
	   int year=input.nextInt();
	  boolean flage=validateYear.result(year);
	  if(flage) {
		  System.out.println(year+"是闰年");
	  }else {
		System.out.println(year+"是平年");
	}
}
  
}
