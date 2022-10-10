package ncs.test8;

import java.util.Objects;

public class User {
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	public User() {
		super();
	}

	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	@Override
	public String toString() {
		return id + " " + password + " "+ name + " " + age + " "+ gender
				+ " " + phone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, gender, id, name, password, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(!(obj instanceof User))
			return false;
		
		User other = (User)obj;
		if(!id.equals(other.id))
			return false;
		if(!password.equals(other.password))
			return false;
		if(!name.equals(other.name))
			return false;
		if(age != other.age)
			return false;
		if(gender != other.gender)
			return false;
		if(!phone.equals(other.phone))
			return false;
		
		return true;
			
	}
	
	public User(User other) {
		this.id = other.id;
		this.password = other.password;
		this.name = other.name;
		this.age = other.age;
		this.gender = other.gender;
		this.phone = other.phone;
	}
	
	public Object clone() {
		return new User(this);
	}
}
