package member.model.vo;

public class Vvip extends Member{

	
	public Vvip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vvip(String name, String grade, int point) {
		super(name, grade, point);
		// TODO Auto-generated constructor stub
	}

	public double getPoints() {
		return getPoint() * 0.15;
	}
	

}
