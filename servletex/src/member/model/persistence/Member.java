package member.model.persistence;

public class Member {
	private int num;
	private String id;
	private String pw;
	private String name;
	//생성자
	public Member(){}
	public Member(int num, String id, String pw, String name){
		this.num= num;
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Member=[number=" + num+ 
						",id=" + id + 
						",pw=" + pw + 
						",name=" + name + "]";
	}
	//setter/getter
	public int getNum() {
		return num;
	}
	public void setNum(int number) {
		this.num= number;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
