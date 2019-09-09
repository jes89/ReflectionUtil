package sample;

public class Member {

	private int idx;
	private String name;
	private String gender;
	private String agreeYn;
	
	public Member() {

	}
	
	public Member(int idx, String name, String gender, String agreeYn) {
		super();
		this.idx = idx;
		this.name = name;
		this.gender = gender;
		this.agreeYn = agreeYn;
	}
	
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAgreeYn() {
		return agreeYn;
	}
	public void setAgreeYn(String agreeYn) {
		this.agreeYn = agreeYn;
	}
	
	
	
}	
