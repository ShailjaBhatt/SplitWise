package SplitWise;

public class Users {
	private int ID;
	private String Name;
	private String Email;
	private String Phone_Number;
	public Users (int id,String name,String email,String phone_n){
		ID = id;
		Name = name;
		Email = email;
		Phone_Number = phone_n;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone_Number() {
		return Phone_Number;
	}
	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}
	
}
