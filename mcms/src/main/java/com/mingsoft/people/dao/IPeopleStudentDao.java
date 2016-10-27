package com.mingsoft.people.dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.mingsoft.base.dao.IBaseDao;
import com.mingsoft.people.entity.PeopleStudentEntity;
import com.mingsoft.util.PageUtil;
/**
 * Comments:学生信息持久化层接口，继承IBaseDao
 */
public interface IPeopleStudentDao  extends IBaseDao {
		
		/**
		 * 获取学生实体信息
		 * @param peopleId 用户id
		 * @return  学生实体
		 */
		PeopleStudentEntity getPeopleStudent(int peopleId);
		
		/**
		 * 查询app下学生的信息
		 * @param appId 应用id
		 * @param page 分页实体
		 * @return 学生列表
		 */
		List<PeopleStudentEntity> queryPageListByAppId(@Param("appId") Integer appId,@Param("page" ) PageUtil page);
		
		/**
		 * 根据条件查询学生总数
		 * @param appId 应用id
		 * @param page 分页实体
		 * @param where 查询条件集合
		 * @return 学生列表
		 */
		List<PeopleStudentEntity> queryByMap(@Param("appId") Integer appId,@Param("page" ) PageUtil page,@Param("where" )Map where);
		
		/**
		 * 根据条件查询学生总数
		 * @param appId  应用id
		 * @param page 分页实体
		 * @param where  查询条件集合
		 * @return 学生总数 
		 */
		int getCountByMap(@Param("appId") Integer appId,@Param("where")Map where);
}