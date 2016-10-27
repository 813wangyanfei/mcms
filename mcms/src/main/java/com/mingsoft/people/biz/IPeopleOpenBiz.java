package com.mingsoft.people.biz;
import com.mingsoft.base.biz.IBaseBiz;
import com.mingsoft.people.entity.PeopleOpenEntity;
/**
 * 开发平台用户接口 例如qq模块 
 */
public interface IPeopleOpenBiz extends IBaseBiz{

	/**
	 * 根据平台openid读取用户编号
	 * @param openId 平台openid信息
	 * @return null:无数据
	 */
	PeopleOpenEntity getByOpenId(String openId); 
	
	/**
	 * 保存开源用户信息，
	 * @param peopleOpen
	 */
	void savePeopleOpen(PeopleOpenEntity peopleOpen);
}