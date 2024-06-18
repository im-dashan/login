package com.dashan.login.mapper;

import com.dashan.login.entity.Users;

public interface UsersMapper {
    int insert(Users row);

    int insertSelective(Users row);
}