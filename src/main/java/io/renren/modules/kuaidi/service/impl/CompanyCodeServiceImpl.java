package io.renren.modules.kuaidi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import io.renren.modules.kuaidi.dao.CompanyCodeDao;
import io.renren.modules.kuaidi.entity.CompanyCodeEntity;
import io.renren.modules.kuaidi.service.CompanyCodeService;



@Service("companyCodeService")
public class CompanyCodeServiceImpl implements CompanyCodeService {
	@Autowired
	private CompanyCodeDao companyCodeDao;
	
	@Override
	public CompanyCodeEntity queryObject(Integer id){
		return companyCodeDao.queryObject(id);
	}
	
	@Override
	public List<CompanyCodeEntity> queryList(Map<String, Object> map){
		return companyCodeDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return companyCodeDao.queryTotal(map);
	}
	
	@Override
	public void save(CompanyCodeEntity companyCode){
		companyCodeDao.save(companyCode);
	}
	
	@Override
	public void update(CompanyCodeEntity companyCode){
		companyCodeDao.update(companyCode);
	}
	
	@Override
	public void delete(Integer id){
		companyCodeDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		companyCodeDao.deleteBatch(ids);
	}
	
}
