package Homework2;

public class ValidateYear {
	public boolean result (int s) {
		if(s%4==0&&s%100!=0||s%400==0) {
			return true;
		}else {
			return false;
		}
	}

}
