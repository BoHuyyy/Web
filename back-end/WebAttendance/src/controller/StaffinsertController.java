package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Leaveform;
import service.LeaveformService;

@Controller
public class StaffinsertController {
	@CrossOrigin(origins="*",maxAge=3600)
	@RequestMapping(value="sinsert/do",method=RequestMethod.POST)
	@ResponseBody
	public int sinsert(@RequestBody Leaveform leaveform){
		System.out.println(leaveform.getID());
		System.out.println(leaveform.getName());
		System.out.println(leaveform.getBeginTime());
		System.out.println(leaveform.getReason());
		LeaveformService leaveform1 = new LeaveformService();
		int result = leaveform1.insertLeaveform(leaveform.getID(), leaveform.getName(), leaveform.getPhone(), leaveform.getReason(), leaveform.getDays(), leaveform.getBeginTime(), leaveform.getEndTime());
		return result;
	}
}
