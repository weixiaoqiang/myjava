package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList01 aList = new ArrayList01();
		List lottery = new ArrayList();
		aList.lotteryAdd(lottery);
		
			System.out.println("红球1 红球2 红球3 红球4 红球5 蓝球");
			for (Object b : lottery) {
				System.out.print(b + "\t");
			}
		
	}

	public int num() {

		int num = (int) (Math.random() * 32) + 1;
		return num;
	}
	public void lotteryAdd(List a) {
		while (true) {
			int num=num();
			if(a.size()>=0&&a.size()<6) {
				if(a.contains(num)) {
					continue;
				}else {
					a.add(num);
				}
			}else if(a.size()==6){
				a.add(num/2);
			}else {
				return ;
			}
		}
	}

}
