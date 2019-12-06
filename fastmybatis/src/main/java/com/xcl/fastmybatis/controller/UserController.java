package com.xcl.fastmybatis.controller;

import com.gitee.fastmybatis.core.query.Query;
import com.xcl.fastmybatis.entity.User;
import com.xcl.fastmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Locale;

@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/")
    @ResponseBody
    public String home(Locale locale, Model model, HttpServletRequest request) {
//
//        Query query = new Query().eq("username","妹子");
//        List<User> users = UserMapper.list(query);

        User user = userMapper.findByName("妹子");
        return user.getName();
    }
    @GetMapping("page1")
    @ResponseBody
    public List<User> page1(int pageIndex,int pageSize) {
        Query query = new Query();
        query.page(pageIndex, pageSize);
        List<User> list = userMapper.list(query);
        return list;
    }
}
