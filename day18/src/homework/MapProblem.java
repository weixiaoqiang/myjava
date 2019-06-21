package homework;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapProblem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		String year = input.next();
		//HashMap<String, Champion> chamPion = new HashMap<>();
		TreeMap<String, Champion> chamPion2=new TreeMap<>();
		add(chamPion2);
		Set< String> kays =chamPion2.keySet();
		Champion vrule1=	chamPion2.get(year);
		System.out.println(vrule1);
		
		System.out.println("请输入一个国家的名字：");
		String countryName = input.next();
		kays.stream().forEach(key->{
			Champion	vrule2=	chamPion2.get(key);
			if(countryName.equals(vrule2.getWiner())) {
				System.out.println(vrule2.getYears());
			}
		});
		

	}

	public static void add(TreeMap<String , Champion> a) {
		a.put("1930", new Champion("第一届","1930", "乌拉圭", "乌拉圭")) ;
		a.put("1934", new Champion("第二届", "1934", "意大利","意大利"));
		a.put("1938", new Champion("第三届", "1938", "法国", "意大利"));
		a.put("1950", new Champion("第四届", "1950", "巴西","乌拉圭"));
		a.put("1954", new Champion( "第五届","1954", "瑞士","西德")) ;
		a.put("1958", new Champion( "第六届", "1958", "瑞典","巴西"));
		a.put("1962",new Champion("第七届","1962", "智利", "巴西"));
		a.put( "1966" ,new Champion( "第八届" , "1966", "英格兰","英格兰"));
		a.put("1970" ,new Champion("第九届" , "1970", "墨西哥","巴西"));
		a.put("1974", new Champion("第十届", "1974", "前西德","西德"));
		a.put("1978", new Champion("第十一届", "1978", "阿根廷","阿根廷"));
	}
}
