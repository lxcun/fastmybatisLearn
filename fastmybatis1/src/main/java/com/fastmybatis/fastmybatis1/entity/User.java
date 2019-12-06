package com.fastmybatis.fastmybatis1.entity;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Table(name="user")
@Data
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //定义自增主键，用户编号
    private int id;
    private String name;//用户名
    private String password;//用户密码
    private int phone;//用户电话号码
    private String address;//用户地址
}
