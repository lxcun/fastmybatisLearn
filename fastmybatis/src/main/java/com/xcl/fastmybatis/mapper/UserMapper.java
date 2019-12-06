package com.xcl.fastmybatis.mapper;

import com.gitee.fastmybatis.core.mapper.CrudMapper;
import com.gitee.fastmybatis.core.query.Query;
import com.xcl.fastmybatis.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

public interface UserMapper extends CrudMapper<User, Integer> {

    User findByName(@Param("name") String name);
    // http://localhost:8080/page1?pageIndex=1&pageSize=10

//    List<User> findByMap(@Param("map") Map<String, Object> map);
//
//    User getByMap(@Param("map") Map<String, Object> map);
//
//    List<User> findJoinPage(Query query);
//    // 自定义sql
//    @Update("update t_user set name = #{name} where id = #{id}")
//    int updateById(@Param("id") int id, @Param("name") String name);


}
