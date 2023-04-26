package RegisterSimulation.entities.concretes;

import RegisterSimulation.entities.abstracts.IEntity;

public class Customer implements IEntity{
	int id;
	String name;
	String lastName;
	String eMail;
	String password;
	String nickName;
	boolean userState = false;
	
	public Customer() {}
	
	public Customer(int id, String name, String lastName, String eMail, String password, String nickName, boolean userState) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
		this.nickName = nickName;
		this.userState = userState;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public boolean getUserState() {
		return userState;
	}

	public void setUserState(boolean userState) {
		this.userState = userState;
	}
	
}
