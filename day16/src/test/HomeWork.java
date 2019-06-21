package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWork {
	

	public static void main(String[] args) {
		HomeWork aList = new HomeWork();
        List lottery = new ArrayList();
		int num=aList.num()/2;
		aList.sizeSix(lottery);
		lottery.add(num);
		for(Object b : lottery) {
			System.out.println(b);
		}
		
		
		Iterator it=  lottery.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public int num() {
		int num = (int) (Math.random() * 32) + 1;
		return num;
	}
	
	public void sizeSix(List a) {
		while (a.size()<6) {
			if(a.contains(num())!=true) {
				a.add(num());
			}
		}
	}
}
