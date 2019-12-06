package com.fastmybatis.fastmybatis1.controller;

import com.fastmybatis.fastmybatis1.entity.User;
import com.fastmybatis.fastmybatis1.mapper.UserMapper;
import com.gitee.fastmybatis.core.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("page1")
    @ResponseBody
    public List<User> page1(int pageIndex,int pageSize) {
        Query query = new Query();
        query.page(pageIndex, pageSize);
        List<User> list = userMapper.list(query);
        return list;
    }
}
