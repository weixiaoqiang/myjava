package worldcup;

public class Champion {
	//届数
	private String session;
	//年份
	private String year;
	//举办地
	private String location;
	//冠军
	private String winer;
	
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getWiner() {
		return winer;
	}
	public void setWiner(String winer) {
		this.winer = winer;
	}
	
	public Champion(String session, String year, String location, String winer) {
		super();
		this.session = session;
		this.year = year;
		this.location = location;
		this.winer = winer;
	}
	
	public Champion() {
		super();
	}
	@Override
	public String toString() {
		return " 世界杯，第" + session + "届，年份：" + year + "，举办地：" + location + ",，冠军：" + winer + "";
	}
	
	
	
}
