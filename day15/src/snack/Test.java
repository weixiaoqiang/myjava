package snack;

import java.util.Scanner;

public class Test {

	BurgerMaking kfx = new KFC();
	BurgerMaking macDonald = new MacDonald();
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Test test=new Test();
		test.query();
	}

	public void query() {
	
		while(true) {
			System.out.println("------查看汉堡制作------");
			System.out.println("1.肯德基；2.麦当劳；3.退出");
			String choose = input.next();
			switch (choose) {
			case "1":
				print(kfx);
				break;
            case "2":
				print(macDonald);
				break;
            case "3":
				System.out.println("拜拜！！！");
				return;
			default:
				System.out.println("输入序号有错！");
				break;
			}
		}
	}
	
	public void print(BurgerMaking shopName) {
		System.out.print("\n食品材料：");
		shopName.foodMaterial();
		System.out.print("\n腌制材料：");
		shopName.pickleMethod();
		System.out.print("\n制作时间：");
		shopName.blastTimes();
		System.out.print("\n汉堡面包提供方：");
		shopName.hamburgAvailable();
		System.out.print("\n包装：");
		shopName.packageAvailable();
		System.out.print("\n售价：");
		shopName.price();
	}

}
