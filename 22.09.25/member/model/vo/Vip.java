package member.model.vo;

public class Vip extends Member{

	
	public Vip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vip(String name, String grade, int point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}

	public double getPoints() {
		return getPoint() * 0.1;
	}
	
}
