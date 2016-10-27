package com.mingsoft.people.dao;

import com.mingsoft.base.dao.IBaseDao;
import com.mingsoft.people.entity.PeopleOpenEntity;

/**
 * 开发平台用户 
 */
public interface IPeopleOpenDao extends IBaseDao{

	/**
	 * 根据平台openid读取用户编号
	 * @param openId 平台openid信息
	 * @return null没有找到数据
	 */
	PeopleOpenEntity getByOpenId(String openId);
}