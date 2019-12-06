package com.xcl.fastmybatis.controller;

import com.gitee.fastmybatis.core.query.Query;
import com.xcl.fastmybatis.entity.Order;
import com.xcl.fastmybatis.entity.User;
import com.xcl.fastmybatis.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
public class OrderController {
    @Autowired
    private OrderMapper orderMapper;
    @GetMapping("pageOrder")
    @ResponseBody
    public List<Order> page1(int pageIndex, int pageSize) {
        Query query = new Query();
        query.page(pageIndex, pageSize);
        List<Order> list = orderMapper.list(query);
        return list;
    }
}
