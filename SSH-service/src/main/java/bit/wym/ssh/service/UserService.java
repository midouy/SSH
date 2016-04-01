package bit.wym.ssh.service;



import bit.wym.ssh.entity.SshUser;

import java.util.List;

/**
 * 创建时间：2015-2-6 下午3:18:57
 * 
 * @author andy
 * @version 2.2
 *  userService接口
 */

public interface UserService {
	SshUser load(String id);

	SshUser get(String id);

	List<SshUser> findAll();

	void persist(SshUser entity);

	String save(SshUser entity);

	void saveOrUpdate(SshUser entity);

	void delete(String id);

	void flush();
}
