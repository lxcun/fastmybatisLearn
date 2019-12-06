package com.fastmybatis.fastmybatis1.mapper;

import com.fastmybatis.fastmybatis1.entity.User;
import com.gitee.fastmybatis.core.mapper.CrudMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

public interface UserMapper extends CrudMapper<User, Integer> {
}
