package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import service.LeaveformService;
@Controller
public class ManagerdeleteController {
	@CrossOrigin(origins="*",maxAge=3600)
	@RequestMapping(value="delete/do",method=RequestMethod.POST)
	@ResponseBody
	public int delete(@RequestBody String num){
		LeaveformService leaveform = new LeaveformService();
		int result = leaveform.deleteLeaveform(num);
		return result;
	}
}
