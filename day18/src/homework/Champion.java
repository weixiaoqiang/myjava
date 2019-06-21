package homework;

public class Champion  {
	 private String session;
	 private  String years;
	 private String place;
	 private  String winer;
	 
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getWiner() {
		return winer;
	}
	public void setWiner(String winer) {
		this.winer = winer;
	}
	
	public Champion(String session ,String years, String place,String winer) {
		super();
		this.session=session;
		this.years = years;
		this.place = place;
		this.winer=winer;
	}
	
	public Champion() {
		super();
	}
	@Override
	public String toString() {
		return "["+session+",年份："+years+"年,举办国家："+place+",世界杯获得者："+winer+"]";
		
	}
	 
	
}
