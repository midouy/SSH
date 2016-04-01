package bit.wym.ssh.dao.impl;

import bit.wym.ssh.dao.UserDao;
import bit.wym.ssh.entity.SshUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 创建时间：2015-2-6 下午2:45:14
 * 
 * @author andy
 * @version 2.2
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao
{

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public SshUser load(String id) {
		return (SshUser) this.getCurrentSession().load(SshUser.class, id);
	}
	
	@Override
	public SshUser get(String id) {
		return (SshUser) this.getCurrentSession().get(SshUser.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SshUser> findAll() {
		List<SshUser> sshUsers = this.getCurrentSession().createQuery("from SshUser").setCacheable(true).list();
		return sshUsers;
	}

	@Override
	public void persist(SshUser entity) {
		this.getCurrentSession().persist(entity);

	}

	@Override
	public String save(SshUser entity) {
		return (String) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(SshUser entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(String id) {
		SshUser entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();

	}

}
