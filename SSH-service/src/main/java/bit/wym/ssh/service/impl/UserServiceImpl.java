package bit.wym.ssh.service.impl;


import bit.wym.ssh.dao.UserDao;
import bit.wym.ssh.entity.SshUser;
import bit.wym.ssh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 创建时间：2015-2-6 下午3:24:16
 * 
 * @author andy
 * @version 2.2 UserService 的实现
 */
@Service("userService")
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserDao userDao;

	@Override
	public SshUser load(String id) {
		return userDao.load(id);
	}

	@Override
	public SshUser get(String id) {
		return userDao.get(id);
	}

	@Override
	public List<SshUser> findAll() {
		return userDao.findAll();
	}

	@Override
	public void persist(SshUser entity) {
		userDao.persist(entity);
	}

	@Override
	public String save(SshUser entity) {
		return userDao.save(entity);
	}

	@Override
	public void saveOrUpdate(SshUser entity) {
		userDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(String id) {
		userDao.delete(id);
	}

	@Override
	public void flush() {
		userDao.flush();
	}

}
