package com.mingsoft.people.entity;

import com.mingsoft.base.entity.BaseEntity;
/**
 * Comments: 用户站点模块实体类，继承BaseEntity实体
 */
public class PeopleWebsiteModelEntity extends BaseEntity {

	/**
	 * 用户站点模块的用户ID
	 */
	private int peopleWebsiteModelPeopleId;
	
	/**
	 * 用户站点模块的站点ID
	 */
	private int peopleWebsiteModelWebsiteId;
	
	/**
	 * 用户站点模块的模块ID
	 */
	private int peopleWebsiteModelModelId;

	public int getPeopleWebsiteModelPeopleId() {
		return peopleWebsiteModelPeopleId;
	}

	public void setPeopleWebsiteModelPeopleId(int peopleWebsiteModelPeopleId) {
		this.peopleWebsiteModelPeopleId = peopleWebsiteModelPeopleId;
	}

	public int getPeopleWebsiteModelWebsiteId() {
		return peopleWebsiteModelWebsiteId;
	}

	public void setPeopleWebsiteModelWebsiteId(int peopleWebsiteModelWebsiteId) {
		this.peopleWebsiteModelWebsiteId = peopleWebsiteModelWebsiteId;
	}

	public int getPeopleWebsiteModelModelId() {
		return peopleWebsiteModelModelId;
	}

	public void setPeopleWebsiteModelModelId(int peopleWebsiteModelModelId) {
		this.peopleWebsiteModelModelId = peopleWebsiteModelModelId;
	}


}