package com.mingsoft.people.entity;

import com.mingsoft.base.entity.BaseEntity;

 /**
 * 通用用户与信息一对多表实体
 */
public class BasicPeopleEntity extends BaseEntity {

	private static final long serialVersionUID = 1464746805910L;

	private int bpId; 
	/**
	 * 信息编号
	 */
	private java.lang.Integer bpBasicId; 
	/**
	 * 用户编号
	 */
	private java.lang.Integer bpPeopleId; 
	
	
	/**
	 * 用户信息
	 */
	private PeopleUserEntity peopleUser;
	
	/**
	 * 创建时间
	 */
	private java.util.Date bpDatetime; 
	
	/**
	 * 设置信息编号
	 */
	public void setBpBasicId(java.lang.Integer bpBasicId) {
		this.bpBasicId = bpBasicId;
	}

	/**
	 * 获取信息编号
	 */
	public java.lang.Integer getBpBasicId() {
		return this.bpBasicId;
	}
	
	/**
	 * 设置用户编号
	 */
	public void setBpPeopleId(java.lang.Integer bpPeopleId) {
		this.bpPeopleId = bpPeopleId;
	}

	/**
	 * 获取用户编号
	 */
	public java.lang.Integer getBpPeopleId() {
		return this.bpPeopleId;
	}
	
	/**
	 * 设置创建时间
	 */
	public void setBpDatetime(java.util.Date bpDatetime) {
		this.bpDatetime = bpDatetime;
	}

	/**
	 * 获取创建时间
	 */
	public java.util.Date getBpDatetime() {
		return this.bpDatetime;
	}

	public PeopleUserEntity getPeopleUser() {
		return peopleUser;
	}

	public void setPeopleUser(PeopleUserEntity peopleUser) {
		this.peopleUser = peopleUser;
	}
	
	
	
}