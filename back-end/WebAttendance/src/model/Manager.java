package model;

public class Manager {
	private String id;
	private String name;
	private String phone;
	private String password;
	
	public Manager(){
		
	}
	
	public Manager(String ID,String password){
		
	}

	public String getID() {
        return id;
    }
	
	public void setID(String ID){
		this.id = ID;
	}
	
	public String getName() {
        return name;
    }
	
	public void setName(String name) {
        this.name = name;
    }
	
	public String getPhone() {
        return phone;
    }
	
	public void setPhone(String phone) {
        this.phone = phone;
    }
	
	public String getPassword() {
        return password;
    }
	
	public void setPassword(String password) {
        this.password = password;
    }
}
