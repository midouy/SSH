package bit.wym.ssh.service;



import bit.wym.ssh.entity.SshAuthority;

import java.util.List;

/**
 * 创建时间：2015-2-6 下午3:18:57
 * 
 * @author andy
 * @version 2.2
 *  接口
 */

public interface AuthorityService {
	SshAuthority load(String id);

	SshAuthority get(String id);

	List<SshAuthority> findAll();

	void persist(SshAuthority entity);

	String save(SshAuthority entity);

	void saveOrUpdate(SshAuthority entity);

	void delete(String id);

	void flush();
	
}
