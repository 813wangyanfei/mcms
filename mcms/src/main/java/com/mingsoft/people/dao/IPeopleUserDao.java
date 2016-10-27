package com.mingsoft.people.dao;

import org.apache.ibatis.annotations.Param;
import com.mingsoft.base.dao.IBaseDao;
/**
 * Comments:用户信息持久化层接口，继承IBaseDao
 */
public interface IPeopleUserDao extends IBaseDao {
	/**
	 * 根据用户id集合批量删除用户
	 * @param peopleIds 用户id集合
	 */
	public void deletePeopleUsers(@Param("peopleIds")int[] peopleIds);
}