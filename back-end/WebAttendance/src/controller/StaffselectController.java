package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Leaveform;
import service.LeaveformService;

@Controller
public class StaffselectController {
	@CrossOrigin(origins="*",maxAge=3600)
	@RequestMapping(value="select/do",method=RequestMethod.POST)
	@ResponseBody
	public List<Leaveform> select(@RequestBody String id){
		LeaveformService leaveform1 = new LeaveformService();
		List<Leaveform> list = leaveform1.sselectLeaveform(id);
		return list;
	}
}