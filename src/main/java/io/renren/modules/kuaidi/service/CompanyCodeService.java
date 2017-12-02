package io.renren.modules.kuaidi.service;

import io.renren.modules.kuaidi.entity.CompanyCodeEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-12-02 14:10:56
 */
public interface CompanyCodeService {
	
	CompanyCodeEntity queryObject(Integer id);
	
	List<CompanyCodeEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(CompanyCodeEntity companyCode);
	
	void update(CompanyCodeEntity companyCode);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
