package snack;

public class MacDonald  extends BurgerMaking{

	@Override
	public void foodMaterial() {
		System.out.println("鸡上腿肉");
	}

	@Override
	public void pickleMethod() {
		System.out.println("180g肉 、 4g香辛料 、1.4g辣椒粉 、少许淀粉 、少许油 、35克冰水");
	}

	@Override
	public void blastTimes() {
		System.out.println("6分钟");
	}

	@Override
	public void hamburgAvailable() {
		System.out.println("麦当劳内部提供");
	}

	@Override
	public void packageAvailable() {
		System.out.println("麦当劳包装纸");
	}

	@Override
	public void price() {
		System.out.println("20元");
	}

}
