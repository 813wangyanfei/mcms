package com.mingsoft.people.biz;

import com.mingsoft.base.biz.IBaseBiz;
import com.mingsoft.util.*;
import java.util.*;
import com.mingsoft.people.entity.BasicPeopleEntity;

/**
 * 通用用户与信息一对多表业务
 */
public interface IBasicPeopleBiz extends IBaseBiz {

	/**
	 * 查询
	 * @param basicPeople 通用用户与信息一对多表
	 * @return
	 */
	List query(BasicPeopleEntity basicPeople);
	
	void saveBasicPeople(BasicPeopleEntity basicPeople);
	
	void deleteBasicPeople(BasicPeopleEntity basicPeople);
	
}