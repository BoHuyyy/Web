package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Staff;
import service.ManagerService;
import service.StaffService;


@Controller
@CrossOrigin(origins="*")
public class LoginController {
	@RequestMapping(value="/login/do",method=RequestMethod.POST)
	@ResponseBody
    public Integer login(@RequestBody Staff staff){
		int result;
		int result1 = 0;
		int result2 = 0;
		StaffService staff1 = new StaffService();
		ManagerService manager = new ManagerService();
		System.out.println(staff.getID());
		System.out.println(staff.getPassword());
		if(staff.getID().substring(0,4).equals("3016")){
			result1=staff1.checkStaff(staff.getID(),staff.getPassword());
		}else{
			result2=manager.checkManager(staff.getID(), staff.getPassword());
		}
		if(result1==1){
			result=0;
		}else if(result2==1){
			result=1;
		}else{
			result=-1;
		}
		return result;
    }
}
