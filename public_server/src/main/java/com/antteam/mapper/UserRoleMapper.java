package com.antteam.mapper;

import com.antteam.bean.UserRole;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}