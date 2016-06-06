package com.antteam.mapper;

import com.antteam.bean.OwnerRes;

public interface OwnerResMapper {
    int insert(OwnerRes record);

    int insertSelective(OwnerRes record);
}