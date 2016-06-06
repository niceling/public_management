package com.antteam.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antteam.bean.User;
import com.antteam.mapper.UserMapper;
import com.antteam.pagination.PaginationBean;
import com.antteam.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{
	private final static Logger logger=LoggerFactory.getLogger(UserServiceImpl.class.getName());
	@Autowired
	private UserMapper userDao;
	public int deleteByPrimaryKey(Integer id) {
		return userDao.deleteByPrimaryKey(id);
	}

	public int insertSelective(User record) {
		return userDao.insertSelective(record);
	}

	public User selectByPrimaryKey(Integer id) {
		return userDao.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(User record) {
		return userDao.updateByPrimaryKeySelective(record);
	}

	public List<User> query(PaginationBean<User> paginationBean) throws Exception {
		logger.info("页码："+paginationBean.getRows()+"min:"+paginationBean.getMin());
		return userDao.query(paginationBean);
	}

	public int count(PaginationBean<User> paginationBean) throws Exception {
		return userDao.count(paginationBean);
	}

}
