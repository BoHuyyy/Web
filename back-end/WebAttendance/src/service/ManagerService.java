package service;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import access.Dbaccess;
import mapper.ManagerMapper;
import model.Manager;

public class ManagerService {
	public int checkManager(String ID,String password){
		Dbaccess dbaccess=new Dbaccess();
		SqlSession sqlSession=null;
		Manager manager=new Manager();
		manager.setID(ID);
		try {
			sqlSession=dbaccess.getSqlSession();
			ManagerMapper mm =sqlSession.getMapper(ManagerMapper.class);
			Manager manager1=mm.selectManager(manager);
			sqlSession.commit();
			System.out.println(manager1.getPassword());
			if (manager1 !=null && manager1.getPassword().equals(password)){
				return 1;
			}else{
			   return 0;
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
	
	
	//经理注册用
	public int insertManager(String ID,String name,String phone,String password){
		Dbaccess dbaccess=new Dbaccess();
		int result = 0;
		SqlSession sqlSession=null;
		Manager manager=new Manager();
		manager.setID(ID);
		manager.setName(name);
		manager.setPhone(phone);
		manager.setPassword(password);
		try {
			sqlSession=dbaccess.getSqlSession();
			ManagerMapper sm =sqlSession.getMapper(ManagerMapper.class);
			result=sm.insertManager(manager);
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
//	// TODO Auto-generated method stub
////	int temp = checkManager("2016218111","123456");
////	System.out.println(temp);
//	
//	int temp = insertManager("2016218112","经理2","12345678901","123456");
//	System.out.println(temp);
//	}
}
	

