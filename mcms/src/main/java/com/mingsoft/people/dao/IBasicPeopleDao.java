package com.mingsoft.people.dao;

import com.mingsoft.base.dao.IBaseDao;
import java.util.*;
import com.mingsoft.people.entity.BasicPeopleEntity;

/**
 * 通用用户与信息一对多表持久层
 */
public interface IBasicPeopleDao extends IBaseDao {
	/**
	 * 查询
	 * @param basicPeople 通用用户与信息一对多表
	 * @return
	 */
	List query(BasicPeopleEntity basicPeople);
}