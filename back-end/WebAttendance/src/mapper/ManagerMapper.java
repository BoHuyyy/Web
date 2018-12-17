package mapper;

import model.Manager;

public interface ManagerMapper {
	Manager selectManager(Manager manager);//登陆用
	int insertManager(Manager manager);//注册用
}
