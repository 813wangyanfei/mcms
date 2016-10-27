package com.mingsoft.people.dao;

import com.mingsoft.base.dao.IBaseDao;
import com.mingsoft.people.entity.PeopleWebsiteModelEntity;

/**
 * Comments: 用户站点模块持久化层接口，继承IBaseDao接口
 */
public interface IPeopleWebsiteModelDao extends IBaseDao {

	/**
	 * 根据用户站点模块实体删除据用户站点模块字段
	 * @param peopleWebsiteModel
	 */
	public void deleteEntity(PeopleWebsiteModelEntity peopleWebsiteModel );
	
	/**
	 * 根据用户Id删除用户站点模块中间表数据集合
	 * @param peopleId
	 */
	public void deleteByPeopleId(int peopleId);
	
}