package com.xcl.fastmybatis.mapper;

import com.gitee.fastmybatis.core.mapper.CrudMapper;
import com.xcl.fastmybatis.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper extends CrudMapper<Order, Integer> {
}
