package sample;

public class MyPageForm {
	
	private int idx;
	private String name;
	
	public MyPageForm() {

	}
	
	public MyPageForm(int idx, String name) {
		super();
		this.idx = idx;
		this.name = name;
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
	
}
