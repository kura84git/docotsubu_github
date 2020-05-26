package beans;

import java.io.Serializable;

public class RegisterUser implements Serializable{
	private String userId;
	private String name;
	private String pass;
	private String mail;
	private int age;

	public RegisterUser() {}

	public RegisterUser(String userId, String name, String pass, String mail, int age) {
		this.userId = userId;
		this.name = name;
		this.pass = pass;
		this.mail = mail;
		this.age = age;
	}

	public String getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getPass() {
		return pass;
	}

	public String getMail() {
		return mail;
	}

	public int getAge() {
		return age;
	}


}
