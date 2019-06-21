package Test;

public class Calculate {

	private  double  add(double firtNum,double secondNum) {
		return firtNum+secondNum;
	}
	
	private  double  reduce(double firtNum,double secondNum) {
		return firtNum-secondNum;
	}
	
	private   double  ride(double firtNum,double secondNum) {
		return firtNum*secondNum;
	}
	
	private   double  except(double firtNum,double secondNum) {
		return firtNum/secondNum;
	}
	public double rule(double firtNum,char symbol,double secondNum) {
		double result=0;
		if(symbol=='+') {
			 result=add(firtNum, secondNum);
		}else if(symbol=='-') {
			result=reduce(firtNum, secondNum);
		}else if(symbol=='*') {
			result=except(firtNum, secondNum);
		}else if(symbol=='/') {
			if(secondNum==0) {
				throw new RuntimeException("除数不能为0！！！");
			}
			result=ride(firtNum, secondNum);
		}else {
			throw new RuntimeException("运算符输入有误！！！");
		}
		return result;
	}
}
