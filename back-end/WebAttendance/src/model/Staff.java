package model;

public class Staff {
	private String id;
	private String name;
	private String phone;
	private String password;
	
	public Staff(){
		
	}
	
	
	public String getID() {
        return id;
    }
	
	public void setID(String ID) {
		this.id = ID;
	}
	
	public String getName() {
        return name;
    }
	
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	public String getPhone() {
        return phone;
    }
	
	public void setPhone(String phone) {
		// TODO Auto-generated method stub
		this.phone = phone;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
}
