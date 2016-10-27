package com.mingsoft.people.biz;

import com.mingsoft.base.biz.IBaseBiz;
import com.mingsoft.people.entity.PeopleWebsiteModelEntity;

/**
 * Comments: 用户站点模块业务层接口，继承IBaseBiz接口
 */
public interface IPeopleWebsiteModelBiz extends IBaseBiz {

	/**
	 * 根据用户站点模块实体删除据用户站点模块字段
	 * @param peopleWebsiteModel
	 */
	public void deleteEntity(PeopleWebsiteModelEntity peopleWebsiteModel );
	
}