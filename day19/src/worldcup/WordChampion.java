package worldcup;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class WordChampion {
	int count=1;
	public void stat() {
		Scanner input=new Scanner(System.in);
		TreeMap<String, Champion> tMap=new TreeMap<>();
		add(tMap);
		System.out.println("请输入你想查找是否获得世界杯冠军的国家：");
		String country=input.next();
		queryWiner(tMap,country);
		
	}
	
	private  void add(TreeMap<String,Champion> a) {
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
		a.put("1982", new Champion("第十二届","1982","西班牙","意大利"));
		a.put("1986", new Champion("第十三届","1986","墨西哥","阿根廷"));
		a.put( "1990",new Champion("第十四届","1990","意大利","西德"));
		a.put( "1994",new Champion("第十五届","1994","美国","巴西"));
		a.put( "1998",new Champion("第十六届","1998","法国","法国"));
		a.put("2002", new Champion("第十七届","2002","韩日","巴西"));
		a.put("2006", new Champion("第十八届","2006","德国","意大利"));
		a.put( "2010",new Champion("第十九届","2010","南非","西班牙"));
		a.put( "2014",new Champion("第二十届","2014","巴西","德国"));
	}

	private void queryWiner(TreeMap<String,Champion> a,String country) {
		Set<String> keys= a.keySet();
		
		keys.stream().forEach(key->{
			Champion vulre=a.get(key);
			if(country.equals(vulre.getWiner())) {
				System.out.println("年份："+vulre.getYear()+"，冠军："+vulre.getWiner());
			}else {
			    count++;
			    if(count==a.size()) {
			    	System.out.println("没有获得过世界冠军");
			    }
			}
		});
	}
	
}
