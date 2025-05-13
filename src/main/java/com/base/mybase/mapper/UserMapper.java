package com.base.mybase.mapper;

import com.base.mybase.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserDTO findUserById(Long id);
}
