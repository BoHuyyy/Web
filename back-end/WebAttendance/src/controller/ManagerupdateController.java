package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import service.LeaveformService;

@Controller
public class ManagerupdateController {
	@CrossOrigin(origins="*",maxAge=3600)
	@RequestMapping(value="update/do",method=RequestMethod.POST)
	@ResponseBody
	public int update(@RequestBody String num){
		System.out.println(num);
		LeaveformService leaveform = new LeaveformService();
		int result = leaveform.upadteLeaveform(num);
		return result;
	}
}
