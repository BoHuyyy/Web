package service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import access.Dbaccess;
import model.Leaveform;
import mapper.LeaveformMapper;

public class LeaveformService{
	//插入请假条
	public int insertLeaveform(String ID,String name,String phone,String reason,String days,String beginTime,String endTime){
		Dbaccess dbaccess=new Dbaccess();
		SqlSession sqlSession=null;
		try {
			sqlSession=dbaccess.getSqlSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Leaveform leaveform = new Leaveform();
		leaveform.setID(ID);
		leaveform.setName(name);
		leaveform.setPhone(phone);
		leaveform.setReason(reason);
		leaveform.setDays(days);
		leaveform.setBeginTime(beginTime);
		leaveform.setEndTime(endTime);
		leaveform.setStatus("未审批");
		LeaveformMapper lm =sqlSession.getMapper(LeaveformMapper.class);
		int result=lm.insertLeaveform(leaveform);
		sqlSession.commit();
		System.out.println(result);
		return result;
	}
	//员工查看自己请假条
	public  List<Leaveform> sselectLeaveform(String ID){
		Dbaccess dbaccess=new Dbaccess();
		SqlSession sqlSession=null;
		Leaveform leaveform = new Leaveform();
		leaveform.setID(ID);
		try {
			sqlSession=dbaccess.getSqlSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LeaveformMapper lm =sqlSession.getMapper(LeaveformMapper.class);
		return lm.sselectLeaveform(leaveform);
	}
//	//经理查看未审批假条
//	public List<Leaveform> unselectLeaveform(String status){
//		Dbaccess dbaccess=new Dbaccess();
//		SqlSession sqlSession=null;
//		Leaveform leaveform = new Leaveform();
//		leaveform.setStatus(status);
//		try {
//			sqlSession=dbaccess.getSqlSession();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		LeaveformMapper lm =sqlSession.getMapper(LeaveformMapper.class);
//		return lm.unselectLeaveform(leaveform);
//	}
	//经理查看所有审批假条
	public List<Leaveform> mselectLeaveform(){
		Dbaccess dbaccess=new Dbaccess();
		SqlSession sqlSession=null;
		Leaveform leaveform = new Leaveform();
		try {
			sqlSession=dbaccess.getSqlSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LeaveformMapper lm =sqlSession.getMapper(LeaveformMapper.class);
		return lm.mselectLeaveform(leaveform);
	}
	//经理删除假条
	public int deleteLeaveform(String num){
		Dbaccess dbaccess=new Dbaccess();
		SqlSession sqlSession=null;
		Leaveform leaveform = new Leaveform();
		leaveform.setNum(num);
		try {
			sqlSession=dbaccess.getSqlSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LeaveformMapper lm =sqlSession.getMapper(LeaveformMapper.class);
		int result=lm.deleteLeaveform(leaveform);
		sqlSession.commit();
		return result;
	}
	//经理审批假条
	public int upadteLeaveform(String num){
		Dbaccess dbaccess=new Dbaccess();
		SqlSession sqlSession=null;
		Leaveform leaveform = new Leaveform();
		leaveform.setNum(num);
		try {
			sqlSession=dbaccess.getSqlSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LeaveformMapper lm =sqlSession.getMapper(LeaveformMapper.class);
		int result=lm.updateLeaveform(leaveform);
		sqlSession.commit();
		return result;
	}
	//测试
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
////		int leaveform = deleteLeaveform(4);
//		
//		int leaveform = upadteLeaveform("1");
//		
////		List leaveform = mselectLeaveform();
////		System.out.println(leaveform);
//		
////		List leaveform = sselectLeaveform("3016218111");
////		System.out.println(leaveform);
//		
////		int leaveform = insertLeaveform("3016218112","哈哈","13312097865","事假","3","2017-05-03","2017-05-05");
//	}
}
