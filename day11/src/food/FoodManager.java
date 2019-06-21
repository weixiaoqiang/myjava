package food;

import java.util.Arrays;

public class FoodManager {

/**
 * 初始化数据
 * **/
	public FoodManager() {
		Food food1 = new Food("手撕牛肉", 15, 5);
		Food food2 = new Food("车厘子", 15, 20);
		Food food3 = new Food("苹果", 2, 5);
		Food food4 = new Food("南瓜", 5, 10);
		Food food5 = new Food("豌豆芽", 8, 50);

		addFood(food1);
		addFood(food2);
		addFood(food3);
		addFood(food4);
		addFood(food5);
	}
/**
 * 食物
 * **/
	private Food[] foods = new Food[500];

	int count = 0;

	/**
	 * 商品添加
	 **/
	public boolean addFood(Food food) {
		for (int i = count; i < foods.length; ) {
			Food f = findFood(food.getName());
			if (foods[i] == null && f == null) {

				foods[i] = food;
				count++;
				return true;
			}
			return false;
		}
		return false;
	}

	/**
	 * 查询商品信息
	 **/
	public Food findFood(String name) {
		for (int i = 0; i < foods.length; i++) {
			if (foods[i] != null && foods[i].getName().equals(name)) {
				return foods[i];
			}
		}
		return null;
	}

	/**
	 * 修改商品信息
	 **/
	public boolean updateFood(Food food) {
		for (int i = 0; i < foods.length; i++) {
			// 数组下标为i的地方不为null，不然会出空指针异常
			// 并且数组下标为i的Food的名字和参数的food的名字相同
			if (foods[i] != null && foods[i].getName().equals(food.getName())) {
				foods[i].setPrice(food.getPrice());// 修改价格
				foods[i].setCount(food.getCount());// 修改库存数量
				return true; // 修改成功
			}
		}
		return false;// 修改失败
	}

	/**
	 * 输出全部已经存入的商品信息
	 **/

	public Food[] queryAll() {
		Food[] food = Arrays.copyOf(foods, count);
		return food;
	}

	/**
	 * 商品价格总和
	 **/
	public double total() {
		double sum = 0;
		for (int i = 0; i < count; i++) {
			sum += foods[i].getPrice() * foods[i].getCount();
		}
		return sum;
	}

	/**
	 * 输出最高价格的商品信息
	 **/
	public Food[] getHighesfood() {
		// 最高的价格
		double max = null == foods[0] ? 0 : foods[0].getPrice();
		for (int i = 1; i < count; i++) {
			if (foods[i].getPrice() > max) {
				max = foods[i].getPrice();
			}
		}
		// 最高价格商品的数量
		int $count = 0;
		for (int i = 0; i < count; i++) {
			if (foods[i].getPrice() == max) {
				$count++;
			}
		}
		// 输出这些最高价格的商品
		Food[] food = new Food[$count];
		int index = 0;
		for (int i = 0; i < count; i++) {
			if (foods[i].getPrice() == max) {
				food[index++] = foods[i];
			}
		}
		return food;
	}

	/**
	 * 按照食品价格升序排序，价格相同按照库存数量降序排序
	 **/
	public void sort() {
		for (int i = 0; i < count - 1; i++) {
			for (int j = 0; j < count - 1 - i; j++) {
				Food f_j = foods[j];
				Food f_j1 = foods[j + 1];
				if (f_j.getPrice() > f_j1.getPrice()) {// 将商品价格按升序排序
					Food target = f_j;
					foods[j] = f_j1;
					foods[j + 1] = target;
				} else if (f_j.getPrice() == f_j1.getPrice()) {// 讲价格相等的商品按库存数量降序排序
					if (f_j.getCount() < f_j1.getCount()) {
						Food target = f_j;
						foods[j] = f_j1;
						foods[j + 1] = target;
					}
				}
			}
		}
	}

}
