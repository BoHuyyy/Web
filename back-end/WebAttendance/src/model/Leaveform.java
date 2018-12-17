package model;

public class Leaveform {
	private String num;
	private String id;
	private String name;
	private String phone;
	private String reason;
	private String days;
	private String beginTime;
	private String endTime;
	private String status = "未审批";
	
	public Leaveform(){
		
	}
	
	public String getNum(){
		return num;
	}
	
	public void setNum(String num) {
		// TODO Auto-generated method stub
		this.num = num;
	}
	
	public String getID() {
        return id;
    }
	
	public void setID(String ID) {
		// TODO Auto-generated method stub
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
	
	public String getReason() {
        return reason;
    }
	
	public void setReason(String reason) {
        this.reason = reason;
    }
	
	public String getDays() {
        return days;
    }
	
	public void setDays(String days) {
        this.days = days;
    }
	
	public String getBeginTime() {
        return beginTime;
    }
	
	public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }
	
	public String getEndTime() {
        return endTime;
    }
	
	public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
	
	public String getStatus() {
        return status;
    }
	
	public void setStatus(String status) {
        this.status = status;
    }
	

}
