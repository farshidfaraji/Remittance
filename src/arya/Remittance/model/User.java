package arya.Remittance.model;

import arya.Remittance.model.abstracts.Entity;

public class User extends Entity {
	private String Frestname;
	private String Lastname;
	private String username;
	private String password;
	private String phone;
	private String Email;
	private byte[] photo;

	public String getFrestname() {
		return Frestname;
	}

	public void setFrestname(String frestname) {
		Frestname = frestname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

}
