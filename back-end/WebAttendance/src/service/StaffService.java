package service;


import java.io.IOException;
import org.apache.ibatis.session.SqlSession;
import access.Dbaccess;
import model.Staff;
import mapper.StaffMapper;

public class StaffService {
	//检查用户名密码
	public int checkStaff(String ID,String password){
		Dbaccess dbaccess=new Dbaccess();
		SqlSession sqlSession=null;
		Staff staff=new Staff();
		staff.setID(ID);
		try {
			sqlSession=dbaccess.getSqlSession();
			StaffMapper sm =sqlSession.getMapper(StaffMapper.class);
			Staff staff1=sm.selectStaff(staff);
			sqlSession.commit();
			if (staff1 !=null && staff1.getPassword().equals(password)){
				return 1;//正确返回1
			}else{
			   return 0;//错误返回0
			}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			sqlSession.close();
		}
		return 0;
	}
	
	//注册插入staff表
	public int insertStaff(String ID,String name,String phone,String password){
		Dbaccess dbaccess=new Dbaccess();
		int result = 0;
		SqlSession sqlSession=null;
		Staff staff=new Staff();
		staff.setID(ID);
		staff.setName(name);
		staff.setPhone(phone);
		staff.setPassword(password);
		try {
			sqlSession=dbaccess.getSqlSession();
			StaffMapper sm =sqlSession.getMapper(StaffMapper.class);
			result=sm.insertStaff(staff);
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			sqlSession.close();
		}
		return result;//
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		int temp = checkStaff("3016218111","12345");
////		System.out.println(temp);
//		
//		
////		int temp = insertStaff("3016218112","员工2","12345678901","123456");
//	}
}
