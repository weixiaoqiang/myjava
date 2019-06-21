package food;

import java.util.Scanner;

public class Testweb {
	private FoodManager fm = new FoodManager(); // //得到后台的管理类的对象
	private Scanner input = new Scanner(System.in);
	private void printLogo() {
		System.out.println();
		StringBuilder builder = new StringBuilder()
				.append("╭━━╮╭━━╮╭━━╮┏━━╮\n")
				.append("┃╭━╯┃╭╮┃┃╭╮┃┃╭╮┃\n")
				.append("┃╰━╮┃┃┃┃┃┃┃┃┃┃┃┃\n")
				.append("┃╭━╯┃┃┃┃┃┃┃┃┃┃┃┃\n")
				.append("┃┃　　┃╰╯┃┃╰╯┃┃╰╯┃\n")
				.append("╰╯　　╰━━╯╰━━╯┗━━╯");
		System.out.println(builder);
		System.out.println();

	}

	public void statr() {
		printLogo() ;
		while (true) {
			print2();
			
			String choose = input.next();
			switchWay(choose);
		}
	}
	/**
	 *swictch方法操作
	 * **/
	private void switchWay(String choose) {
		switch (choose) {
				case "1":
			        add();
					break;
				case "2":
					queryAll();
					break;
				case "3":
					findFood();
					break;
				case "4":
					update();
					break;
				case "5":
					total();
					break;
				case "6":
					getHight();
					break;
				case "7":
					sort();
					break;
				case "8":
					System.out.println("感谢使用！");
					break;
				default:
					System.out.println("请输入有效的序号！！！");
					break;
		}
	}
	/**
	 * 按照食品价格升序排序，价格相同按照库存数量降序排序
	 * **/
	private void sort() {
		fm.sort();
		Food[] foods=fm.queryAll();
		print(foods);
	}
	/**
	 *输出最高价格的商品
	 * **/
	private void getHight() {
		Food[]foods =fm.getHighesfood();
		print(foods);
	}
	/**
	 * 商品价格总和
	 * **/
	private void total() {
		double sum=fm.total();
		System.out.println("商品价格总和为：" + sum);
	}
	/**
	 *修改商品的信息
	 * **/
	private void update() {
		System.out.println("请输入您要修改的商品名称：");
		String foodName=input.next();
		Food food=fm.findFood(foodName);
		if(food==null) {
			System.out.println("该商品不存在！！！");
		}else {
			System.out.println("请输入你要修改的商品价格：");
			double foodPrice=input.nextDouble();
			System.out.println("请输入你要修改的商品数量：");
			int foodCount=input.nextInt();
			food=new Food(foodName,foodPrice,foodCount);
			boolean f=	fm.updateFood(food);
			if(f) {
				System.out.println("修改成功！");
			}else {
				System.out.println("修改失败！！！");
			}
		}
	}
	/**
	 * 查询商品并输出商品的信息
	 * **/
	private void findFood() {
		System.out.println("请输入您要查找的商品名称：");
		String foodName=input.next();
		Food food=fm.findFood(foodName);
		if(food==null) {
			System.out.println("该商品不存在！！！");
		}else {
			System.out.println(food.getName() + "," + food.getPrice() + "," + food.getCount());
		}
	}
	/**
	 * 输出全部已经存入的商品信息
	 * **/
	private void queryAll() {
		Food[] foods=	fm.queryAll();
		print(foods);
	}
/**
 * 商品信息的添加
 * **/
	private void add() {
		System.out.println("请输入商品名称：");
		String foodName=input.next();
		System.out.println("请输入商品价格：");
		double foodPrice=input.nextDouble();
		System.out.println("请输入商品数量：");
		int foodCount=input.nextInt();
		Food food=new Food(foodName,foodPrice,foodCount);
		boolean result=fm.addFood(food);
		if (result) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}
	/**
	 * 输出商品信息的方法
	 * **/
	private void print(Food[] foods) {
		if (null == foods || foods.length == 0) {
		} else {
			for (int i = 0; i < foods.length; i++) {
				Food food = foods[i];
				System.out.println(food.getName() + "," + food.getPrice() + "," + food.getCount());
			}
		}
	}
/**
 * 操作选择
 * **/
private void print2() {
	        System.out.println("*************我是帅气的分割线*************");
		    System.out.println("请根据下列序号来进行选择操作");
			System.out.println("1.请输入要添加的商品信息；");
			System.out.println("2.查询所有食品信息");
			System.out.println("3.根据食品名称查询食品信息");
			System.out.println("4.根据食品名称修改食品信息");
			System.out.println("5.统计所有食品的总价");
			System.out.println("6.统计最贵的食品信息");
			System.out.println("7.根据食品价格升序排序，价格相同的按数量降序排序");
			System.out.println("8.退出");
	}
}
