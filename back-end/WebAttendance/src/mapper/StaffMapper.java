package mapper;

import model.Staff;

public interface StaffMapper {
	Staff selectStaff(Staff staff);//登陆用
	int insertStaff(Staff staff);//注册用
}