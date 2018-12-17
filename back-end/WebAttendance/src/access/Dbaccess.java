package access;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Dbaccess {
	public Dbaccess() {
		// TODO Auto-generated constructor stub
	}
	
	public SqlSession getSqlSession() throws IOException{
		SqlSession sqlSession=null;
		Reader reader=Resources.getResourceAsReader("config/Configuration.xml");
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
		sqlSession=sqlSessionFactory.openSession();
		return sqlSession;
	}
}
