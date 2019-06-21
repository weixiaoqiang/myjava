package snack;

public class KFC extends BurgerMaking {



	@Override
	public void foodMaterial() {
		System.out.println("鸡上腿肉");
	}

	@Override
	public void pickleMethod() {
		System.out.println("160g肉 、 3g香辛料 、3.4g辣椒粉 、少许淀粉 、少许油 、32克冰水");
	}

	@Override
	public void blastTimes() {
		System.out.println("5分钟");
	}

	@Override
	public void hamburgAvailable() {
		System.out.println("肯德基内部提供");
	}

	@Override
	public void packageAvailable() {
		System.out.println("肯德基包装纸");
	}

	@Override
	public void price() {
		System.out.println("25元");
	}

}
