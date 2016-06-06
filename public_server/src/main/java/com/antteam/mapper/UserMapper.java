package com.antteam.mapper;

import java.util.List;

import com.antteam.bean.User;
import com.antteam.pagination.PaginationBean;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> query(PaginationBean<User> paginationBean);
    
    int count(PaginationBean<User> paginationBean);
}