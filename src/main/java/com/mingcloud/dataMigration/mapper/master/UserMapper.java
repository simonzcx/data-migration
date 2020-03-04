package com.mingcloud.dataMigration.mapper.master;


import com.mingcloud.dataMigration.mapper.base.BaseMapper;
import com.mingcloud.dataMigration.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * UserMapper
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    
}
