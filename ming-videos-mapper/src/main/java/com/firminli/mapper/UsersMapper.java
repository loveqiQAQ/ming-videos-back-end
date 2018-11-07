package com.firminli.mapper;

import com.firminli.pojo.Users;
import com.firminli.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper extends MyMapper<Users> {
}