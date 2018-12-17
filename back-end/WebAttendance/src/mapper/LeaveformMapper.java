package mapper;

import java.util.List;

import model.Leaveform;
public interface LeaveformMapper {
	int deleteLeaveform(Leaveform leaveform);//经理删除表
	int insertLeaveform(Leaveform leaveform);//员工插入表
	int updateLeaveform(Leaveform leaveform);//修改审批状态
	List<Leaveform> mselectLeaveform(Leaveform leaveform);//经理查看所有请假表/
	List<Leaveform> unselectLeaveform(Leaveform leaveform);//经理查看未审批假条
	List<Leaveform> sselectLeaveform(Leaveform leaveform);//员工查看自己请假表
}
