package food;

public class TestFoodManager {

	private FoodManager fManage = new FoodManager();

	public static void main(String[] args) {

		TestFoodManager testFoodManager = new TestFoodManager();
		testFoodManager.addFoodManager();
		// testFoodManager.findFoodManager();
		testFoodManager.allFoodsManager();
		testFoodManager.total();
		// testFoodManager.getHighest();
		// testFoodManager.updateFoodManager();
		// testFoodManager.sort();
		// testFoodManager.allFoodsManager();
	}

	// 添加商品信息
	public void addFoodManager() {
		Food food = new Food("牛肉", 10, 5);
		Food food2 = new Food("苹果", 2, 100);
		boolean ruelse = fManage.addFood(food);
		ruelse = fManage.addFood(food2);
		if (ruelse) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}

	// 查询商品信息
	public void findFoodManager() {
		Food food = fManage.findFood("牛肉");
		if (food == null) {
			System.out.println("没有查到该商品");
		} else {
			System.out.println(food.getName() + "," + food.getPrice() + "," + food.getCount());
		}
	}

	//
	public void updateFoodManager() {
		Food food = new Food("牛肉", 20, 5);
		boolean ruelst = fManage.updateFood(food);
		if (ruelst) {
			System.out.println("修改成功");
		} else {
			System.out.println("修改失败");
		}
	}

	// 输出全部已经存入的商品信息
	public void allFoodsManager() {
		Food[] food = fManage.queryAll();
		print(food);
	}

	// 商品价格总和
	public void total() {
		double sum = fManage.total();
		System.out.println("商品价格总和为：" + sum);
	}

	// 输出最高价格的商品信息
	public void getHighest() {
		Food[] food = fManage.getHighesfood();
		print(food);
	}

	// 排序
	private void sort() {
		fManage.sort();
	}

	// 输出商品信息的方法
	private void print(Food[] foods) {
		if (null == foods || foods.length == 0) {
		} else {
			for (int i = 0; i < foods.length; i++) {
				Food food = foods[i];
				System.out.println(food.getName() + "," + food.getPrice() + "," + food.getCount());
			}
		}
	}

}
