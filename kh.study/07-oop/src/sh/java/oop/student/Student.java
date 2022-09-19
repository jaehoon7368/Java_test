package sh.java.oop.student;

public class Student {

	//상태 - 클래스영역에 작성
	private String name;
	private char gender;
	private int age;
	
	public String getName() {
		return this.name;
	}
	public char getGender() {
		return this.gender;
	}
	public int getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//행위
	public void study() {
		System.out.printf("[%s]이/가 공부하고 있습니다.\n",name);
	}
	
	public void introduce() {
		System.out.printf("안녕하세요,저는 [%s]입니다. [%d]살 [%c]자에요. 반갑습니다~\n",name,age,gender);
	}
}
