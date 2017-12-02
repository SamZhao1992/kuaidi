package io.renren.modules.kuaidi.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-12-02 14:10:56
 */
public class CompanyCodeEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String companyName;
	//
	private String companyCode;
	//
	private String companyType;
	//
	private String countryType;
	//
	private String companyComment;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * 获取：
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * 设置：
	 */
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	/**
	 * 获取：
	 */
	public String getCompanyCode() {
		return companyCode;
	}
	/**
	 * 设置：
	 */
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	/**
	 * 获取：
	 */
	public String getCompanyType() {
		return companyType;
	}
	/**
	 * 设置：
	 */
	public void setCountryType(String countryType) {
		this.countryType = countryType;
	}
	/**
	 * 获取：
	 */
	public String getCountryType() {
		return countryType;
	}
	/**
	 * 设置：
	 */
	public void setCompanyComment(String companyComment) {
		this.companyComment = companyComment;
	}
	/**
	 * 获取：
	 */
	public String getCompanyComment() {
		return companyComment;
	}
}
