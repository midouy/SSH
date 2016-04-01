package bit.wym.ssh.dao.impl;

import bit.wym.ssh.dao.RoleDao;
import bit.wym.ssh.entity.SshRole;
import org.hibernate.Query;
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
@Repository("roleDao")
public class RoleDaoImpl implements RoleDao
{

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public SshRole load(String id) {
		return (SshRole) this.getCurrentSession().load(SshRole.class, id);
	}
	
	@Override
	public SshRole get(String id) {
		return (SshRole) this.getCurrentSession().get(SshRole.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SshRole> findAll() {
		Query query = this.getCurrentSession().createQuery("from SshRole");
		return query.list();
	}

	@Override
	public void persist(SshRole entity) {
		this.getCurrentSession().persist(entity);

	}

	@Override
	public String save(SshRole entity) {
		return (String) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(SshRole entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(String id) {
		SshRole entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();

	}

}
