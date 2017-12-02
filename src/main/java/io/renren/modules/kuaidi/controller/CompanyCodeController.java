package io.renren.modules.kuaidi.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.kuaidi.entity.CompanyCodeEntity;
import io.renren.modules.kuaidi.service.CompanyCodeService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.common.utils.R;




/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-12-02 14:10:56
 */
@RestController
@RequestMapping("/kuaidi/companycode")
public class CompanyCodeController {
	@Autowired
	private CompanyCodeService companyCodeService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("kuaidi:companycode:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<CompanyCodeEntity> companyCodeList = companyCodeService.queryList(query);
		int total = companyCodeService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(companyCodeList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("kuaidi:companycode:info")
	public R info(@PathVariable("id") Integer id){
		CompanyCodeEntity companyCode = companyCodeService.queryObject(id);
		
		return R.ok().put("companyCode", companyCode);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("kuaidi:companycode:save")
	public R save(@RequestBody CompanyCodeEntity companyCode){
		companyCodeService.save(companyCode);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("kuaidi:companycode:update")
	public R update(@RequestBody CompanyCodeEntity companyCode){
		companyCodeService.update(companyCode);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("kuaidi:companycode:delete")
	public R delete(@RequestBody Integer[] ids){
		companyCodeService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
