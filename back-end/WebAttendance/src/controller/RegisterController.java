package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Staff;
import service.StaffService;
import service.ManagerService;
@Controller
public class RegisterController {
	@CrossOrigin(origins="*",maxAge=3600)
	@RequestMapping(value="register/do",method=RequestMethod.POST)
	@ResponseBody
    public int register(@RequestBody Staff staff){
		System.out.println(staff.getID());
		System.out.println(staff.getName());
		
		int result;
		StaffService staff1 = new StaffService();
		ManagerService manager = new ManagerService();
		String type = staff.getID().substring(0, 4);
		if(type.equals("2016")){
			result = manager.insertManager(staff.getID(), staff.getName(), staff.getPhone(), staff.getPassword());
		}else{
			result = staff1.insertStaff(staff.getID(), staff.getName(), staff.getPhone(), staff.getPassword());
		}
		return result;
    }
}
