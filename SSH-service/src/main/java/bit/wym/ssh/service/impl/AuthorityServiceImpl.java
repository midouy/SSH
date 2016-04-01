package bit.wym.ssh.service.impl;


import bit.wym.ssh.dao.AuthorityDao;
import bit.wym.ssh.entity.SshAuthority;
import bit.wym.ssh.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 创建时间：2015-2-6 下午3:24:16
 * 
 * @author andy
 * @version 2.2 
 * AuthorityService 的实现
 */
@Service("authorityService")
public class AuthorityServiceImpl implements AuthorityService
{

	@Autowired
	private AuthorityDao authorityDao;

	@Override
	public SshAuthority load(String id) {
		return authorityDao.load(id);
	}

	@Override
	public SshAuthority get(String id) {
		return authorityDao.get(id);
	}

	@Override
	public List<SshAuthority> findAll() {
		return authorityDao.findAll();
	}

	@Override
	public void persist(SshAuthority entity) {
		authorityDao.persist(entity);
	}

	@Override
	public String save(SshAuthority entity) {
		return authorityDao.save(entity);
	}

	@Override
	public void saveOrUpdate(SshAuthority entity) {
		authorityDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(String id) {
		authorityDao.delete(id);
	}

	@Override
	public void flush() {
		authorityDao.flush();
	}

}
