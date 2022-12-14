package member.model.vo;

public class Member {

	private String name;
	private String grade;
	private int point;
	
	

	public Member() {
		super();
	}
	
	
	public Member(String name, String grade, int point) {
		super();
		this.name = name;
		this.grade = grade;
		this.point = point;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public double getPoints() {
		return point;
	}
	
	public String memberInfo() {
		return name + "		" + grade + "		  "+ point + "		 " + getPoints();
	}
	
	
}
