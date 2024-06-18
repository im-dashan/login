package com.dashan.login.mapper;

import com.dashan.login.entity.Roles;

public interface RolesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Roles row);

    int insertSelective(Roles row);

    Roles selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Roles row);

    int updateByPrimaryKey(Roles row);
}