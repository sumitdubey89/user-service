package epam.demo.userservice.model;

public class User {

	private String name;
	private int age;
	private int memberSince;

	public User(String name, int age, int memberSince) {
		this.name = name;
		this.age = age;
		this.memberSince = memberSince;
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

	public int getMemberSince() {
		return memberSince;
	}

	public void setMemberSince(int memberSince) {
		this.memberSince = memberSince;
	}
}
