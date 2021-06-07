package epam.demo.userservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {


	@Id
	@Column(name = "user_id",nullable = false)
	private Integer id;

	@Column(name = "first_name",nullable = false)
	private String firstName;

	@Column(name = "last_name",nullable = false)
	private String lastName;

	@Column(name = "age",nullable = false)
	private int age;

	@Column(name = "member_since",nullable = false)
	private int memberSince;

	@Column(name = "city_name",nullable = false)
	private String addressCityName;

	public User() {
	}

	public User(Integer id, String firstName, String lastName, int age, int memberSince, String addressCityName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.memberSince = memberSince;
		this.addressCityName = addressCityName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getAddressCityName() {
		return addressCityName;
	}

	public void setAddressCityName(String addressCityName) {
		this.addressCityName = addressCityName;
	}

	@Override public String toString() {
		return "User{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age + ", memberSince="
				+ memberSince + ", addressCityName='" + addressCityName + '\'' + '}';
	}
}
