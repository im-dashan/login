package com.dashan.login.mapper;

import com.dashan.login.entity.UserRolesKey;

public interface UserRolesMapper {
    int deleteByPrimaryKey(UserRolesKey key);

    int insert(UserRolesKey row);

    int insertSelective(UserRolesKey row);
}