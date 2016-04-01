package bit.wym.ssh.dao.impl;


import bit.wym.ssh.dao.AuthorityDao;
import bit.wym.ssh.entity.SshAuthority;
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
@Repository("authorityDao")
public class AuthorityDaoImpl implements AuthorityDao
{

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public SshAuthority load(String id) {
		return (SshAuthority) this.getCurrentSession().load(SshAuthority.class, id);
	}
	
	@Override
	public SshAuthority get(String id) {
		return (SshAuthority) this.getCurrentSession().get(SshAuthority.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SshAuthority> findAll() {
		Query query = this.getCurrentSession().createQuery("from SshAuthority ");
		return query.list();
	}

	@Override
	public void persist(SshAuthority entity) {
		this.getCurrentSession().persist(entity);

	}

	@Override
	public String save(SshAuthority entity) {
		return (String) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(SshAuthority entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(String id) {
		SshAuthority entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();

	}

}
