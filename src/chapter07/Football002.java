package chapter07;

public class Football002 {
	private String teamName;
	private String country;
	private String ace;
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAce() {
		return ace;
	}

	public void setAce(String ace) {
		this.ace = ace;
	}

	@Override
	public String toString() {
		return "Football002 [teamName=" + teamName + ", country=" + country + ", ace=" + ace + "]";
	}

	public static void main(String[] args) {
		Football002 ags=new Football002();
		ags.setTeamName("아스날");
		ags.setCountry("영국");
		ags.setAce("사카");
		System.out.println(ags.toString());
		ags.setTeamName("레알 마드리드");
		ags.setCountry("스페인");
		ags.setAce("벨링엄");
		System.out.println(ags.toString());

	}

}
