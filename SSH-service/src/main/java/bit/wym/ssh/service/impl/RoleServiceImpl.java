package bit.wym.ssh.service.impl;


import bit.wym.ssh.dao.RoleDao;
import bit.wym.ssh.entity.SshRole;
import bit.wym.ssh.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 创建时间：2015-2-6 下午3:24:16
 * 
 * @author andy
 * @version 2.2 UserService 的实现
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService
{

	@Autowired
	private RoleDao roleDao;

	@Override
	public SshRole load(String id) {
		return roleDao.load(id);
	}

	@Override
	public SshRole get(String id) {
		return roleDao.get(id);
	}

	@Override
	public List<SshRole> findAll() {
		return roleDao.findAll();
	}

	@Override
	public void persist(SshRole entity) {
		roleDao.persist(entity);
	}

	@Override
	public String save(SshRole entity) {
		return roleDao.save(entity);
	}

	@Override
	public void saveOrUpdate(SshRole entity) {
		roleDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(String id) {
		roleDao.delete(id);
	}

	@Override
	public void flush() {
		roleDao.flush();
	}

}
