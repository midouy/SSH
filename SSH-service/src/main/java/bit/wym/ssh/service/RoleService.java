package bit.wym.ssh.service;



import bit.wym.ssh.entity.SshRole;

import java.util.List;

/**
 * 创建时间：2015-2-6 下午3:18:57
 * 
 * @author andy
 * @version 2.2
 *  RoleService接口
 */

public interface RoleService {
	SshRole load(String id);

	SshRole get(String id);

	List<SshRole> findAll();

	void persist(SshRole entity);

	String save(SshRole entity);

	void saveOrUpdate(SshRole entity);

	void delete(String id);

	void flush();
}
